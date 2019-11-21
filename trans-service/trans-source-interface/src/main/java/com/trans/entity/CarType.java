package com.trans.entity;

import lombok.Data;

import javax.persistence.Table;


@Table(name = "tb_car_type")
@Data
public class CarType {

    private Long id;
    private String name;
}
