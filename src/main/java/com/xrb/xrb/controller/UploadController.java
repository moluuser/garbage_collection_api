package com.xrb.xrb.controller;

import com.xrb.xrb.utils.FileHandleUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;

@RestController
public class UploadController {
    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {

        Date date = new Date();
        long time = date.getTime();
        String originFileName = file.getOriginalFilename();
        assert originFileName != null;
        String suffix = originFileName.substring(originFileName.lastIndexOf(".") + 1);
        String newFileName = time + "." + suffix;

        return FileHandleUtil.upload(file.getInputStream(), "img/", newFileName);

    }
}
