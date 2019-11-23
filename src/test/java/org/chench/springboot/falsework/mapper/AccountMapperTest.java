package org.chench.springboot.falsework.mapper;

import org.chench.springboot.falsework.model.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/*
 * 测试DAO层接口，跟测试服务组件一样，不需要web环境，但是需要提供Spring容器环境。
 * @author: chench9@lenovo.com
 * @desc: org.chench.springboot.falsework.mapper.AccountMapperTest
 * @date: 2019/11/23 16:17
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class AccountMapperTest {
    @Autowired
    private AccountIntMapper accountIntMapper;

    @Autowired
    private AccountXmlMapper accountXmlMapper;

    @Test
    public void testAccountIntMapper() {
        List<Account> accountList = accountIntMapper.getAccoutList(0, 20);
        Assert.assertTrue(accountList != null);
    }

    @Test
    public void testAccountXmlMapper() {
        List<Account> accountList = accountXmlMapper.getAccountList(0, 20);
        Assert.assertTrue(accountList != null);
    }

}
