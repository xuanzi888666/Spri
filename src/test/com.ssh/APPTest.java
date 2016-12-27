package com.ssh;

import com.ssh.entity.Dept;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/12/27.
 */
public class APPTest {
    @Test
    public void fun1(){
        ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
       SessionFactory sessionFactory= (SessionFactory) act.getBean("sqlSessionFactory");
        Session session = sessionFactory.getCurrentSession();

    }
    @Test
    public void fun2() {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sessionFactory = (SessionFactory) act.getBean("sqlSessionFactory");

        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.getTransaction();
        try {
            transaction.begin();

            //从主动方开始查，只查一次
            Dept dept = new Dept(1, "1111111", "1111111");
            session.persist(dept);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
        }
    }
}
