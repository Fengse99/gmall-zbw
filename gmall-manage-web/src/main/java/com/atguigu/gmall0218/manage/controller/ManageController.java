package com.atguigu.gmall0218.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0218.bean.*;
import com.atguigu.gmall0218.service.ManageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ManageController {
    @Reference
    private ManageService manageService;

    @RequestMapping("getCatalog1")
    public List<BaseCatalog1> getCatalog1(){
        return manageService.getBaseCatalog1();
    }

    @RequestMapping("getCatalog2")
    public List<BaseCatalog2> getCatalog2(String catalog1Id){
        return manageService.getBaseCatalog2(catalog1Id);
    }

    @RequestMapping("getCatalog3")
    public List<BaseCatalog3> getCatalog3(String catalog2Id){
        return manageService.getBaseCatalog3(catalog2Id);
    }

    @RequestMapping("attrInfoList")
    public List<BaseAttrInfo> getBaseAttr(String catalog3Id){
        return manageService.getBaseAttrInfo(catalog3Id);
    }
    @RequestMapping("getAttrValueList")
    public List<BaseAttrValue> getAttrValue(String attrId){
        BaseAttrInfo baseAttrInfo = manageService.findAttrInfo(attrId);
        //List<BaseAttrValue> baseAttrValue = manageService.getBaseAttrValue(attrId);

        return baseAttrInfo.getAttrValueList();
    }
    @RequestMapping("saveAttrInfo")
    public void update(@RequestBody BaseAttrInfo baseAttrInfo){
        manageService.saveBaseAttrInfo(baseAttrInfo);
    }
    @RequestMapping("spuList")
    public List<SpuInfo> spuList(String catalog3Id){
        return manageService.getSpuInfoList(catalog3Id);
    }
    //baseSaleAttrList
    @RequestMapping("baseSaleAttrList")
    public List<BaseSaleAttr> baseSaleAttrList(){
        return manageService.getBaseSaleAttrList();
    }
}

