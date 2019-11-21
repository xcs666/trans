package com.trans.common.advice;


import com.trans.common.enums.ExceptionEnums;
import com.trans.common.exception.TransException;
import com.trans.common.pojo.ExceptionResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author 飞鸟
 * @create 2019-10-24 11:12
 */
@ControllerAdvice
public class CommonExceptionHandler {
    //该方法表示处理的异常类型
    @ExceptionHandler(TransException.class)
    public ResponseEntity<ExceptionResult> handleException(TransException e){
        ExceptionEnums exceptionEnums = e.getExceptionEnums();
        ExceptionResult result = new ExceptionResult(exceptionEnums);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

}
