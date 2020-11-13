package com.cheng.yumall.member.controller;

import java.util.Arrays;
import java.util.Map;

////renren-generator/src/main/resources/template/Controller.java.vm
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cheng.yumall.member.entity.MemberLoginLogEntity;
import com.cheng.yumall.member.service.MemberLoginLogService;
import com.cheng.common.utils.PageUtils;
import com.cheng.common.utils.R;



/**
 * 會員登錄記錄
 *
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 02:15:34
 */
@RestController
@RequestMapping("member/memberloginlog")
public class MemberLoginLogController {
    @Autowired
    private MemberLoginLogService memberLoginLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    ////@RequiresPermissions("member:memberloginlog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberLoginLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 訊息
     */
    @RequestMapping("/info/{id}")
    ////@RequiresPermissions("member:memberloginlog:info")
    public R info(@PathVariable("id") Long id){
		MemberLoginLogEntity memberLoginLog = memberLoginLogService.getById(id);

        return R.ok().put("memberLoginLog", memberLoginLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    ////@RequiresPermissions("member:memberloginlog:save")
    public R save(@RequestBody MemberLoginLogEntity memberLoginLog){
		memberLoginLogService.save(memberLoginLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    ////@RequiresPermissions("member:memberloginlog:update")
    public R update(@RequestBody MemberLoginLogEntity memberLoginLog){
		memberLoginLogService.updateById(memberLoginLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    ////@RequiresPermissions("member:memberloginlog:delete")
    public R delete(@RequestBody Long[] ids){
		memberLoginLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
