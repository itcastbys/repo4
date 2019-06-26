package cn.itcast.test;

import cn.itcast.dao.ItemsDao;
import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void daoTest(){
        //获得spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从spring容器中获得所需dao接口的代理对象
        ItemsDao itemsDao=applicationContext.getBean(ItemsDao.class);
        //调用方法
        Items items=itemsDao.findById(1);
        System.out.println(items.getName());
    }

    @Test
    public void serviceTest(){
        //获得spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从spring容器中获得所需dao接口的代理对象
        ItemsService itemsService=applicationContext.getBean(ItemsService.class);
        //调用方法
        Items items=itemsService.findById(1);
        System.out.println(items.getName());
    }
}
