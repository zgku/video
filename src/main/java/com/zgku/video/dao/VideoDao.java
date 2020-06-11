package com.zgku.video.dao;

import com.zgku.video.model.Video;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface VideoDao {

    //插入
    @Insert({"insert into video (name,local_url,url) values (#{name},#{local_url},#{url})"})
    int insertUrl(@Param("name")String name, @Param("local_url")String local_url, @Param("url")String url);

    //查询
    @Select("select * from shipins")
    List<Video> selectVideo();


}
