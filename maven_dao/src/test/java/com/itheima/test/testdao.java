package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testdao {
    @Test
    public void findAll(){



        Items items = new ClassPathXmlApplicationContext("applicationContext_dao.xml").getBean(ItemsDao.class).findById(1);
        System.out.println(items);
    }
}
