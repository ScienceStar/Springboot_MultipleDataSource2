package com.action;

import com.bean.Shop;
import com.service.ShopService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by LiuXinCheng on 2018/5/20
 */
@RestController
@RequestMapping("/shop")
@Api("shopControl相关API")
@ComponentScan("com.service")
public class ShopControl {

    @Autowired
    private ShopService shopService;

    @ApiOperation("获取Shop信息,测试多数据源")
    @RequestMapping(value = "/getShop",method = RequestMethod.GET)
    public Shop getShop(@RequestParam("id") int id){
        Shop shop = shopService.getSingleShop(id);
        return shop;
    }
}
