package com.wei.exception;

/**
 * 自定义异常(CustomException)
 * @author Jiawei.Mao
 * @date 2019/06/07 13:59
 */
public class CustomException extends RuntimeException {

    public CustomException(String msg){
        super(msg);
    }

    public CustomException() {
        super();
    }
}
