package com.cheng.yumall.thirdparty.controller;

import com.cheng.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassName UploadFileController
 * @Description TODO
 * @Author cheng
 * @Date 2021/1/9 13:09
 * @Version 1.0
 **/
@RestController
@Configuration
@Slf4j
@RequestMapping("/local")
public class UploadFileController {

    @Value("${files.path}")
    private String filePath;

    @PostMapping("/uploadFile")
    private R upload(@RequestParam("file") MultipartFile file) {
        String fileName = file.getOriginalFilename();
        long size = file.getSize();
        System.out.println("size = " + size);
        assert fileName != null;
        File dest = new File(filePath, fileName);
        if (!fileName.contains(".")) {
            log.error("沒有副檔名");
        }

        if (!dest.getParentFile().exists()) {
            if (dest.getParentFile().mkdirs()) {
                log.info("建立資料夾:{}", dest.getParentFile());
            }
        }

        Map<String, String> map = null;
        if (!Objects.requireNonNull(file.getOriginalFilename()).isEmpty()) {
            try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
                bos.write(file.getBytes());
                bos.flush();
                log.info("Upload success");
                map = new HashMap<String, String>() {{
                    put("fileName", fileName);
                }};
            } catch (Exception e) {
                log.error("Upload Fail:{}", e.getMessage());
            }
        }
        return R.ok().put("data", map);
    }

    @GetMapping("/getFilePath")
    public R fileDownLoad(HttpServletResponse response, @RequestParam("fileName") String fileName) {
        File file;
        try {
            file = new File(filePath, fileName);
            if (!file.exists()) {
                return R.error(-2, "檔案不存在( •́ _ •̀)？".concat(fileName));
            }

            response.reset();
            response.setContentType("application/octet-stream");
            response.setCharacterEncoding("utf-8");
            response.setContentLength((int) file.length());
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
        } catch (NullPointerException ne) {
            return R.error(-9, "檔案不存在( •́ _ •̀)？".concat(fileName));
        }

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
            byte[] buff = new byte[1024];
            OutputStream os = response.getOutputStream();
            int i;
            while ((i = bis.read(buff)) != -1) {
                os.write(buff, 0, i);
                os.flush();
            }
        } catch (Exception e) {
            log.error("下載失敗:{}", e.getMessage());
            return R.error(-10, e.getMessage());
        }
        return R.ok().put("filePath", filePath.concat(fileName));
    }
}
