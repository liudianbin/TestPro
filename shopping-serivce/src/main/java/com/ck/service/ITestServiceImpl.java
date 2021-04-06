package com.ck.service;

import com.ck.dao.ITest;
import com.ck.entity.Test1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created  on 2021/4/1 16:42
 */
@Service
public class ITestServiceImpl implements ITestService {

    @Autowired
    private ITest test;

    @Override
    public List<Test1> queryAll() {
        return test.queryAll();
    }
}
