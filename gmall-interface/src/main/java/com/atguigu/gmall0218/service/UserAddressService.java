package com.atguigu.gmall0218.service;

import com.atguigu.gmall0218.bean.UserAddress;

import java.util.List;

public interface UserAddressService {
    public List<UserAddress> findAddress(String userId);
}
