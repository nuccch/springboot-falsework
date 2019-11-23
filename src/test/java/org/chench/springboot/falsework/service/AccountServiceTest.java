package org.chench.springboot.falsework.service;

import org.chench.springboot.falsework.model.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/*
 * 测试Service组件，不需要web环境，但是需要提供Spring容器环境。
 * @author: chench9@lenovo.com
 * @desc: org.chench.springboot.falsework.service.AccountServiceTest
 * @date: 2019/11/22 11:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void testGetAccountListByInt() {
        int start = 0;
        int offset = 10;
        List<Account> accountList = accountService.getAccoutListByInt(start, offset);
        Assert.assertTrue(accountList != null);
    }
}
