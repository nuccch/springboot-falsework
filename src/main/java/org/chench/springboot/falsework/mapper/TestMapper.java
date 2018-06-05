package org.chench.springboot.falsework.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.chench.springboot.falsework.model.Test;

import java.util.List;

// 定义MyBatis的接口映射器
@Mapper
public interface TestMapper {

    @Select("select * from test limit #{start}, #{offset}")
    public List<Test> getTestList(@Param("start") int start, @Param("offset") int offset);
}
