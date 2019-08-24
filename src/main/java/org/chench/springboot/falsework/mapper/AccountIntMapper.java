package org.chench.springboot.falsework.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.chench.springboot.falsework.model.Account;

import java.util.List;

// 接口形式的mapper
@Mapper
public interface AccountIntMapper {

    @Select("select id,name,email,ctime,mtime from account limit #{start}, #{offset}")
    public List<Account> getAccoutList(@Param("start") int start, @Param("offset") int offset);
}
