package com.trans.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_car")
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long carTypeId;//车的类型
    private Long goodsTypeId;//运输的货物类型
    private Double carLength;//车的长度
    private Double carWeight;//车的承载中量
    private Long tranType;//运输类型(专程、回程)
    private  Long startId;//起始的一级城市
    private Long startId2;//起始的二级城市
    private Long endId;//目的地一级城市
    private Long endId2;//目的地一级城市
    private String title;//描述
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date tranTime;//发布时间
}
