package com.tran.service;


import com.tran.mapper.CityMapper;
import com.trans.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityMapper cityMapper;

    /**
     * 根据一级城市cid查询二级的所有城市
     * @param cid
     * @return
     */
    public List<City> queryByCid(Long cid) {
        Example example = new Example(City.class);
        example.createCriteria().andEqualTo("pid",cid);
        List<City> cities  = cityMapper.selectByExample(example);
        return cities;
    }

    /**
     * 查询所有的一级城市
     * @return
     */
    public List<City> getAllFirstCity() {
        City city = new City();
        //讲城市类型设置为1级城市
        city.setType(Long.valueOf(1));
        List<City> cities =   cityMapper.select(city);
        return cities;
    }
}
