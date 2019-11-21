package com.trans.entity;

import lombok.Data;

import javax.persistence.Table;

@Table(name = "tb_goods_kind")
@Data
public class GoodsKind {
    private Long id;
    private String name;
}
