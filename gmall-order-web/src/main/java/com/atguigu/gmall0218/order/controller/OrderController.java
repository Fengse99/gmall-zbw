package com.atguigu.gmall0218.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0218.bean.user.UserAddress;
import com.atguigu.gmall0218.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Reference
    private UserAddressService userAddressService;
    @RequestMapping("findAddress")
    public List<UserAddress> findAddress(String userId){
        return userAddressService.findAddress(userId);
    }
}
