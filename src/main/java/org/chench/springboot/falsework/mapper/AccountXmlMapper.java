package org.chench.springboot.falsework.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.chench.springboot.falsework.model.Account;

import java.util.List;

/**
 * 映射xml形式的mapper接口
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.mapper.AccountXmlMapper
 * @date 8/24/19 4:14 PM
 */
@Mapper
public interface AccountXmlMapper {
    public List<Account> getAccountList(int start, int offset);
}
