package com.tran.controller;

import com.tran.service.CarService;
import com.tran.service.CityService;
import com.tran.service.GoodsService;
import com.trans.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CityService cityService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private CarService carService;


    /**
     * 查询所有的一级城市
     */
    @GetMapping("/city")
    public  ResponseEntity<List<City>>  queryFirstCity(){
           List<City> cities =  cityService.getAllFirstCity();
        return ResponseEntity.ok(cities);

    }


    /**
     * 根据一级城市的cid查询二级的所有城市
     * @param cid
     */
    @GetMapping("/city/{cid}")
    public ResponseEntity<List<City>> querySecondCity(@PathVariable(name = "cid")Long cid){
         List<City> cities = cityService.queryByCid(cid);
         return ResponseEntity.ok(cities);
    }

    /**
     * 查询所有的货物类型
     * @return
     */
    @GetMapping("/goodsType")
    public  ResponseEntity<List<GoodsType>> queryGoodType(){
        return  ResponseEntity.ok(goodsService.getGoodType());
    }

    /**
     * 查询所有的车辆类型
     * @return
     */
    @GetMapping("/carType")
    public ResponseEntity<List<CarType>>  queryCarType(){
        return ResponseEntity.ok( carService.getCarType());
    }

    /**
     *  查询车的路线类型
     * @return
     */
    @GetMapping("/lineType")
   public ResponseEntity<List<LineType>>  query(){

        return ResponseEntity.ok(carService.getLineType());
   }

    /**
     * 发布车源
     * @param car
     * @return
     */
    @PostMapping("/car/source")
    public ResponseEntity<String> addCarSource(Car car){
        System.out.println(car.getTranTime());
          int rows = carService.insertCar(car);
          if (rows < 1){
               return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("发布失败");
          }
        return ResponseEntity.ok("发布成功");
    }
}
