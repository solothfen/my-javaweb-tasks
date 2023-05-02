package com.gx.dao;

import com.gx.domain.ke;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //此注解代表这是一个持久层，用法类似@controller、@service
public interface kedao {

    @Select("select * from ke")
    public List<ke> findAll();
    @Insert("insert into ke (ke_name,ke_time,school) value(#{ke_name},#{ke_time},#{school})")
    public int saveke(ke ke);

    @Update("update ke set ke_name=#{ke_name},ke_time=#{ke_time},school=#{school} where ke_name=#{ke_name}")
    public int updateke(ke ke);

    @Select("select * from ke where ke_name=#{ke_name}")
    public List<ke> find(String ke_name);

    @Delete("delete from ke where ke_name=#{ke_name}")
    public int deleteke(String ke_name);
}

