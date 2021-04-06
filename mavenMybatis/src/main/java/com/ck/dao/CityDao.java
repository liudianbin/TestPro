package com.ck.dao;

import com.ck.entity.city;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * created  on 2021/3/29 10:44
 */
public interface CityDao {

    @Select("SELECT * FROM t_city")
    @ResultMap("citymapper")
    public List<city> queryAll();
}
