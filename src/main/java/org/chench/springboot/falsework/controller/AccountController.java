package org.chench.springboot.falsework.controller;

import org.chench.springboot.falsework.model.Account;
import org.chench.springboot.falsework.model.JsonResp;
import org.chench.springboot.falsework.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.controller.AccountController
 * @date 8/24/19 3:52 PM
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private AccountService accountService;

    @GetMapping("/list")
    public Object list(HttpServletRequest req, HttpServletResponse resp,
                       @RequestParam("start") int start,
                       @RequestParam("offset") int offset) {
        //List<Account> accountList = accountService.getAccoutListByInt(start, offset);
        List<Account> accountList = accountService.getAccountListByXML(start, offset);
        if(logger.isDebugEnabled()) {
            logger.debug("account list: {}", accountList);
        }
        return JsonResp.httpCode(resp, JsonResp.CODE_SUCCESS).success(accountList == null ? Collections.emptyList() : accountList);
    }
}
