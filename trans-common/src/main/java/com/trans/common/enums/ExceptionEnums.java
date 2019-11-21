package com.trans.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnums {
    //1XXXX:用户问题
    //2XXXX:商品问题
    //3XXXX:分类问题
    //4XXXX:品牌问题
    //5XXXX:规格问题
    //6XXXX:搜索问题
    INVALID_VERFIY_CODE(1000,"验证码错误"),
    INVALID_USERNAME_PASSWORD(1001,"用户名或密码错误！"),
    NO_AUTHORIZED(1002,"未授权用户！"),
    GOODS_SPU_IS_EMPTY(2000,"该商品不存在！"),
    GOODS_SKU_IS_EMPTY(2001,"该型号的商品不存在！"),
    GOODS_DETAIL_IS_EMPTY(2002,"该商品详情为空！"),
    UPDATE_SPU_IS_ERROR(2003,"修改商品失败！"),
    UPDATE_SPU_DETAIL_IS_ERROR(2004,"修改商品详情失败！"),
    UPDATE_SKU_IS_ERROR(2005,"修改商品型号失败！"),

    PRICE_CANNOT_BE_NULL(400,"价格不能为空"),


    CATEGORY_IS_EMPTY(30000, "该分类不存在"),

    BRAND_IS_EMPTY(4000, "品牌为空！"),

    SPECIFICATION_GROUP_IS_EMPTY(5000, "规格组为空！"),
    SPECIFICATION_PARAMS_IS_EMPTY(5000, "规格属性为空！");

    private int code;
    private String msg;
}
