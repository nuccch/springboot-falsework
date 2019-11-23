package org.chench.springboot.falsework.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.chench.springboot.falsework.model.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 接口映射器，在xml文件中定义SQL语句
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.mapper.AccountXmlMapper
 * @date 8/24/19 4:14 PM
 */
@Repository
@Mapper
public interface AccountXmlMapper {
    public List<Account> getAccountList(int start, int offset);
}
