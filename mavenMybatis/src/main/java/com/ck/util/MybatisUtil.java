package com.ck.util;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisUtil {
    private static SqlSessionFactory sessionFactory;

        //解析mybatis核心配置文件创建数据库
        static {
            try {
                InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
                 sessionFactory = new SqlSessionFactoryBuilder().build(in);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    /**
     * 定义方法获取操作数据库对象
     * @param trancation
     * @return
     */
    public static SqlSession openSession(boolean trancation){
                return sessionFactory.openSession(trancation);
        }

}
