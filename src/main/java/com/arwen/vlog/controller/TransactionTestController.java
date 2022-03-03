package com.arwen.vlog.controller;

import javax.annotation.Resource;

import com.arwen.vlog.service.TransactionTestService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TransactionTestController {
    @Resource
    private TransactionTestService transService;

    @GetMapping("/transactionTest")
    @ResponseBody
    public String transactionTest() {
        transService.test1();
        transService.test2();
        return "test finished";
    }
}
