package com.ck.service;

import com.ck.dao.CityDao;
import com.ck.entity.city;
import com.ck.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created  on 2021/3/29 10:46
 */
@Service
public class CityServiceImpl implements CityService {


    @Override
    public List<city> queryAll() {
        SqlSession sqlSession = MybatisUtil.openSession(false);
        CityDao mapper = sqlSession.getMapper(CityDao.class);
        return mapper.queryAll();
    }
}
