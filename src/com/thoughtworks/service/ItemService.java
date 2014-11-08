package com.thoughtworks.service;

import com.thoughtworks.dao.ItemDao;

/**
 * Created by xueqian on 11/8/14.
 */
public class ItemService {

    private ItemDao itemDao = new ItemDao();
    public String getItem(int id){
        return itemDao.getItem(id);
    }
}
