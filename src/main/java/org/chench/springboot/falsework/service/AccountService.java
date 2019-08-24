package org.chench.springboot.falsework.service;

import org.chench.springboot.falsework.mapper.AccountIntMapper;
import org.chench.springboot.falsework.mapper.AccountXmlMapper;
import org.chench.springboot.falsework.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.service.AccountService
 * @date 8/24/19 3:51 PM
 */
@Service
public class AccountService {
    @Autowired
    private AccountIntMapper accountIntMapper;

    @Autowired
    private AccountXmlMapper accountXmlMapper;

    /**
     * 使用接口映射器查询账户列表
     * @param start
     * @param offset
     * @return
     */
    public List<Account> getAccoutListByInt(int start, int offset) {
        return accountIntMapper.getAccoutList(start, offset);
    }

    /**
     * 使用xml映射器查询账户列表
     * @param start
     * @param offset
     * @return
     */
    public List<Account> getAccountListByXML(int start, int offset) {
        return accountXmlMapper.getAccountList(start, offset);
    }

}
