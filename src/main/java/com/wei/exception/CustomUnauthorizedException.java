package com.wei.exception;

/**
 * 自定义401无权限异常(UnauthorizedException)
 * @author Jiawei.Mao
 * @date 2019/06/07 13:59
 */
public class CustomUnauthorizedException extends RuntimeException {

    public CustomUnauthorizedException(String msg){
        super(msg);
    }

    public CustomUnauthorizedException() {
        super();
    }
}
