package com.tran.controller;

import com.tran.service.GoodsService;
import com.trans.entity.Goods;
import com.trans.entity.GoodsKind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    /**
     * 查询的所有的货物种类
     * @return
     */
   @GetMapping("/goodsKind")
   public ResponseEntity<List<GoodsKind>> queryGoodsKind(){

       return ResponseEntity.ok( goodsService.getGoodsKind());
   }
    /**
     * 发布货源
     * @param goods
     * @return
     */
    @PostMapping("/goods")
     public ResponseEntity<String> addGoods(Goods goods){
            int rows =    goodsService.insert(goods);
            if (rows < 1)
                 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("发布失败");
        return ResponseEntity.ok("发布成功");
    }



}
