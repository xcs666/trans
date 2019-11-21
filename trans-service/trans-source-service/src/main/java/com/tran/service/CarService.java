package com.tran.service;


import com.sun.org.apache.regexp.internal.RE;
import com.tran.mapper.CarMapper;
import com.tran.mapper.CarTypeMapper;
import com.tran.mapper.LineTypeMapper;
import com.trans.entity.Car;
import com.trans.entity.CarType;
import com.trans.entity.LineType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarService {

@Autowired
private CarMapper carMapper;
@Autowired
private CarTypeMapper carTypeMapper;
@Autowired
private LineTypeMapper lineTypeMapper;


    /**
     * 查询车的路线类型
     * @return
     */
    public List<LineType> getLineType() {

        return  lineTypeMapper.selectAll();
    }



    /**
     * 查询车的类型
     * @return
     */
    public List<CarType> getCarType() {

       return carTypeMapper.selectAll();

    }

    /**
     * 发布车源
     * @param car
     */
    public int insertCar(Car car) {
        int rows = carMapper.insertSelective(car);
        return  rows;
    }
}
