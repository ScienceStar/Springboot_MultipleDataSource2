package com.service.impl;

import com.bean.Shop;
import com.dao.ShopDao;
import com.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by LiuXinCheng on 2018/5/20
 */
@Service
public class ShopServiceImpl implements ShopService{

    @Autowired
    private ShopDao shopDao;

    @Override
    public Shop getSingleShop(int id) {
        return shopDao.getSingleShop(id);
    }
}
