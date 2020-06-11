package com.zgku.video;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VideoApplication {

    public static void main(String[] args) {
        System.out.print("视频上传项目启动类1.==="+"\n");
        SpringApplication.run(VideoApplication.class, args);
    }

}
