package com.trans.entity;

import lombok.Data;

import javax.persistence.Table;

@Table(name = "tb_good_type")
@Data
public class GoodsType {
  private  Long id;
  private String name;

}
