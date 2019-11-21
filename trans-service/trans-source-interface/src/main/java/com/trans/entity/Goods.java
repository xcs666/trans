package com.trans.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_goods")
@Data
public class Goods {

    private  Long id;
    private  Long goodsTypeId;
    private  String name;
    private  Long amount;
    private  Double weight;
    private  Double price;
    private Long tranType;//运输类型(专程、回程)
    private  Long startId;//起始的一级城市
    private Long startId2;//起始的二级城市
    private Long endId;//目的地一级城市
    private Long endId2;//目的地一级城市
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date tranTime;//发布时间
    private Long goodsKindId;
}
