package com.trans.entity;

import lombok.Data;

import javax.persistence.Table;

@Table(name = "tb_line_type")
@Data
public class LineType {
    private Long id;
    private  String name;
}
