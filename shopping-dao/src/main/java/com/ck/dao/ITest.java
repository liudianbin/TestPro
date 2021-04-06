package com.ck.dao;

import com.ck.entity.Test1;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.maven.scm.provider.perforce.command.update.PerforceUpdateCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * created  on 2021/4/1 16:35
 */
public interface ITest {

    @Select("select * from test1")
    @ResultMap("itestmappers")
     List<Test1> queryAll();

}
