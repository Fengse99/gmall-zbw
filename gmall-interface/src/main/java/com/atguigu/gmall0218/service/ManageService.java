package com.atguigu.gmall0218.service;

import com.atguigu.gmall0218.bean.classify.BaseAttrInfo;
import com.atguigu.gmall0218.bean.classify.BaseCatalog1;
import com.atguigu.gmall0218.bean.classify.BaseCatalog2;
import com.atguigu.gmall0218.bean.classify.BaseCatalog3;

import java.util.List;

public interface ManageService {
    //查询所有一级分类
    public List<BaseCatalog1> getBaseCatalog1();
    //根据一级分类查询二级分类
    public List<BaseCatalog2> getBaseCatalog2(String catalog1Id);
    //根据二级分类查询三级分类
    public List<BaseCatalog3> getBaseCatalog3(String catalog2Id);
    //根据三级分类查询属性
    public List<BaseAttrInfo> getBaseAttrInfo(String catalog3Id);
}
