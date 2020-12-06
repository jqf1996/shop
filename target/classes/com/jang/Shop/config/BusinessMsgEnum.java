package com.jang.Shop.config;


import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public enum BusinessMsgEnum {
    /** 参数异常 */
    PARMETER_EXCEPTION("102", "参数异常!"),
    /** 等待超时 */
    SERVICE_TIME_OUT("103", "服务调用超时！"),
    /** 参数过大 */
    PARMETER_BIG_EXCEPTION("102", "输入的图片数量不能超过50张!"),
    /** 500 : 发生异常 */
    UNEXPECTED_EXCEPTION("500", "系统发生异常，请联系管理员！");
    /**
     * 消息码
     */
    private String code;
    /**
     * 消息内容
     */
    private String msg;
    private BusinessMsgEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public String code() {
        return code;
    }
    public String msg() {
        return msg;
    }
}
//在全局统一异常处理类中，我们一般会对自定义的业务异常最先处理，然后去处理一些常
//        见的系统异常，最后会来一个一劳永逸（Exception 异常）。

