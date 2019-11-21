package com.tran.service;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;
import com.tran.mapper.GoodsKindMapper;
import com.tran.mapper.GoodsMapper;
import com.tran.mapper.GoodsTypeMapper;
import com.trans.entity.Goods;
import com.trans.entity.GoodsKind;
import com.trans.entity.GoodsType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {

    @Autowired
    private GoodsTypeMapper goodsTypeMapper;
    @Autowired
    private GoodsMapper goodsMapper;
   @Autowired
   private GoodsKindMapper goodsKindMapper;
    /**
     * 查询所有的货物类型
     * @return
     */
    public List<GoodsType> getGoodType() {
        return  goodsTypeMapper.selectAll();
    }

    /**
     * 发布货源
     * @param goods
     * @return
     */
    public int insert(Goods goods) {

       return  goodsMapper.insertSelective(goods);
    }

    /**
     * 查询所有的货物种类
     * @return
     */
    public List<GoodsKind> getGoodsKind() {

        return goodsKindMapper.selectAll();

    }
}
