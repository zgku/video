package com.zgku.video.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileUploadController {

    @RequestMapping("/file")
    public String file(){
        System.out.print("================请求路径===跳转file页面====="+"\n");
        return "/file";

    }
}
