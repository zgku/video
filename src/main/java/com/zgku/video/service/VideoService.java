package com.zgku.video.service;

import com.zgku.video.dao.VideoDao;
import com.zgku.video.model.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class VideoService {
    @Autowired
    private VideoDao videoDao;

    //插入
    public int insertUrl(String name,String local_url,String url){
        System.out.print("开始插入=name=="+name+"\n");
        System.out.print("开始插入=lujing=="+local_url+"\n");
        System.out.print("开始插入=url=="+url+"\n");
        int result=videoDao.insertUrl(name, local_url, url);
        System.out.print("插入结果==="+result+"\n");
        return result;
    }
    //查询
    public List<Video> selectShipin(){
        List<Video> videos=videoDao.selectVideo();
        return  videos;
    }

}
