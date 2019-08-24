package org.chench.springboot.falsework.service;

import org.chench.springboot.falsework.mapper.AccountMapper;
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
    private AccountMapper accountMapper;

    /**
     * 查询账户列表
     * @param start
     * @param offset
     * @return
     */
    public List<Account> getAccoutList(int start, int offset) {
        return accountMapper.getAccoutList(start, offset);
    }

}
