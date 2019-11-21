package com.trans.common.exception;


import com.trans.common.enums.ExceptionEnums;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author 飞鸟
 * @create 2019-10-24 11:24
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TransException extends RuntimeException {
    private ExceptionEnums exceptionEnums;
}

