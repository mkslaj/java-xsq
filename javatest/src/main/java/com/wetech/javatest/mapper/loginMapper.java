/*package com.wetech.javatest.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface loginMapper {
    @Select("select count(*) from login where name = #{name} and password = #{password}")
    boolean  verifylogin(@Param("name") String name, @Param("password") String password);

}*/
