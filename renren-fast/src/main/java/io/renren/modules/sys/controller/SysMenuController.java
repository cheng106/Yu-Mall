/**
 * Copyright (c) 2016-2019 人人開源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版權所有，侵權必究！
 */

package io.renren.modules.sys.controller;

import io.renren.common.annotation.SysLog;
import io.renren.common.exception.RRException;
import io.renren.common.utils.Constant;
import io.renren.common.utils.R;
import io.renren.modules.sys.entity.SysMenuEntity;
import io.renren.modules.sys.service.ShiroService;
import io.renren.modules.sys.service.SysMenuService;
import org.apache.commons.lang.StringUtils;
//renren-generator/src/main/resources/template/Controller.java.vm
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

/**
 * 系統選單
 *
 * @author Mark sunlightcs@gmail.com
 */
@RestController
@RequestMapping("/sys/menu")
public class SysMenuController extends AbstractController {
    @Autowired
    private SysMenuService sysMenuService;
    @Autowired
    private ShiroService shiroService;

    /**
     * 導航選單
     */
    @GetMapping("/nav")
    public R nav() {
        List<SysMenuEntity> menuList = sysMenuService.getUserMenuList(getUserId());
        Set<String> permissions = shiroService.getUserPermissions(getUserId());
        return R.ok().put("menuList", menuList).put("permissions", permissions);
    }

    /**
     * 所有選單列表
     */
    @GetMapping("/list")
    //@RequiresPermissions("sys:menu:list")
    public List<SysMenuEntity> list() {
        List<SysMenuEntity> menuList = sysMenuService.list();
        for (SysMenuEntity sysMenuEntity : menuList) {
            SysMenuEntity parentMenuEntity = sysMenuService.getById(sysMenuEntity.getParentId());
            if (parentMenuEntity != null) {
                sysMenuEntity.setParentName(parentMenuEntity.getName());
            }
        }

        return menuList;
    }

    /**
     * 選擇選單(新增、修改選單)
     */
    @GetMapping("/select")
    //@RequiresPermissions("sys:menu:select")
    public R select() {
        // 查詢列表資料
        List<SysMenuEntity> menuList = sysMenuService.queryNotButtonList();

        // 新增根選單
        SysMenuEntity root = new SysMenuEntity();
        root.setMenuId(0L);
        root.setName("一級選單");
        root.setParentId(-1L);
        root.setOpen(true);
        menuList.add(root);

        return R.ok().put("menuList", menuList);
    }

    /**
     * 選單訊息
     */
    @GetMapping("/info/{menuId}")
    //@RequiresPermissions("sys:menu:info")
    public R info(@PathVariable("menuId") Long menuId) {
        SysMenuEntity menu = sysMenuService.getById(menuId);
        return R.ok().put("menu", menu);
    }

    /**
     * 儲存
     */
    @SysLog("儲存選單")
    @PostMapping("/save")
    //@RequiresPermissions("sys:menu:save")
    public R save(@RequestBody SysMenuEntity menu) {
        // 資料校驗
        verifyForm(menu);

        sysMenuService.save(menu);

        return R.ok();
    }

    /**
     * 修改
     */
    @SysLog("修改選單")
    @PostMapping("/update")
    //@RequiresPermissions("sys:menu:update")
    public R update(@RequestBody SysMenuEntity menu) {
        // 資料校驗
        verifyForm(menu);

        sysMenuService.updateById(menu);

        return R.ok();
    }

    /**
     * 刪除
     */
    @SysLog("刪除選單")
    @PostMapping("/delete/{menuId}")
    //@RequiresPermissions("sys:menu:delete")
    public R delete(@PathVariable("menuId") long menuId) {
        if (menuId <= 31) {
            return R.error("系統選單，不能刪除");
        }

        //判断是否有子選單或按鈕
        List<SysMenuEntity> menuList = sysMenuService.queryListParentId(menuId);
        if (menuList.size() > 0) {
            return R.error("請先刪除子選單或按鈕");
        }

        sysMenuService.delete(menuId);

        return R.ok();
    }

    /**
     * 驗證參數是否正確
     */
    private void verifyForm(SysMenuEntity menu) {
        if (StringUtils.isBlank(menu.getName())) {
            throw new RRException("選單名稱不能為空");
        }

        if (menu.getParentId() == null) {
            throw new RRException("上級選單不能為空");
        }

        //選單
        if (menu.getType() == Constant.MenuType.MENU.getValue()) {
            if (StringUtils.isBlank(menu.getUrl())) {
                throw new RRException("選單URL不能為空");
            }
        }

        //上級選單類型
        int parentType = Constant.MenuType.CATALOG.getValue();
        if (menu.getParentId() != 0) {
            SysMenuEntity parentMenu = sysMenuService.getById(menu.getParentId());
            parentType = parentMenu.getType();
        }

        //目錄、選單
        if (menu.getType() == Constant.MenuType.CATALOG.getValue() ||
                menu.getType() == Constant.MenuType.MENU.getValue()) {
            if (parentType != Constant.MenuType.CATALOG.getValue()) {
                throw new RRException("上級選單只能為目錄類型");
            }
            return;
        }

        //按鈕
        if (menu.getType() == Constant.MenuType.BUTTON.getValue()) {
            if (parentType != Constant.MenuType.MENU.getValue()) {
                throw new RRException("上級選單只能為選單類型");
            }
            return;
        }
    }
}
