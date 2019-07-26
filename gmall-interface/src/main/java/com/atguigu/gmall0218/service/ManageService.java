package com.atguigu.gmall0218.service;

import com.atguigu.gmall0218.bean.*;


import java.util.List;

public interface ManageService {
    //查询所有一级分类
    List<BaseCatalog1> getBaseCatalog1();
    //根据一级分类查询二级分类
    List<BaseCatalog2> getBaseCatalog2(String catalog1Id);
    //根据二级分类查询三级分类
    List<BaseCatalog3> getBaseCatalog3(String catalog2Id);
    //根据三级分类查询属性
    List<BaseAttrInfo> getBaseAttrInfo(String catalog3Id);
    //根据平台属性查询对应的属性值
    List<BaseAttrValue> getBaseAttrValue(String attrId);

    void saveBaseAttrInfo(BaseAttrInfo baseAttrInfo);

    BaseAttrInfo findAttrInfo(String attrId);

    List<SpuInfo> getSpuInfoList(String catalog3Id);

    List<BaseSaleAttr> getBaseSaleAttrList();
}
