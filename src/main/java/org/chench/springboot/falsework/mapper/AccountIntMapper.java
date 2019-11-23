package org.chench.springboot.falsework.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.chench.springboot.falsework.model.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * 接口映射器，通过映射器注解定义SQL语句
 * @author: chench9@lenovo.com
 * @desc: org.chench.springboot.falsework.mapper.AccountIntMapper
 * @date: 2019/11/22 11:10
 */
@Repository
@Mapper
public interface AccountIntMapper {

    @Select("select id,name,email,ctime,mtime from account limit #{start}, #{offset}")
    public List<Account> getAccoutList(@Param("start") int start, @Param("offset") int offset);
}
