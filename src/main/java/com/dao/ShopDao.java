package com.dao;

import com.bean.Shop;
import com.common.DatabaseType;
import com.common.DatabasesContextHolder;
import com.dao.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

/**
 * Create by LiuXinCheng on 2018/5/20
 */
@Repository
@ComponentScan("com.dao")
public class ShopDao {

    @Autowired
    private ShopMapper shopMapper;

    /**
     * 获取shop
     */
    public Shop getShop(int id) {
        DatabasesContextHolder.setDatabaseType(DatabaseType.databases);
        return shopMapper.getShop(id);
    }

    /**
     * 方法实现说明  基于切面形式获取数据
     * @author      作者姓名mac
       No such property: code for class: Script1
     * @return
     * @exception
     * @date        2018/5/20 22:18
     */
    public Shop getSingleShop(int id){
        return shopMapper.getShop(id);
    }
}
