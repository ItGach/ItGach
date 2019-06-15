package com.itheima.service;

import com.itheima.domain.Items;
import com.itheima.service.Impl.ItemsServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testservice {


    @Test
    public void findAll() {
        //为什么实现类会报错
        Items items = new ClassPathXmlApplicationContext("applicationContext_service.xml").getBean(ItemsService.class).findById(1);

        //Items items2 = new ClassPathXmlApplicationContext("applicationContext_service.xml").getBean(ItemsServiceImpl.class).findById(1);
        System.out.println(items);
    }
}
