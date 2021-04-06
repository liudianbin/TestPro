package com.ck;

import static org.junit.Assert.assertTrue;

import com.ck.entity.city;
import com.ck.service.CityServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void  test1(){
        CityServiceImpl cityService = new CityServiceImpl();
        List<city> cities = cityService.queryAll();
        System.out.println(cities);

    }
}
