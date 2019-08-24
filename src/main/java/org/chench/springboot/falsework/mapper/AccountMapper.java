package org.chench.springboot.falsework.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.chench.springboot.falsework.model.Account;

import java.util.List;

@Mapper
public interface AccountMapper {

    @Select("select id,name,email,ctime,mtime from account limit #{start}, #{offset}")
    public List<Account> getAccoutList(@Param("start") int start, @Param("offset") int offset);
}
