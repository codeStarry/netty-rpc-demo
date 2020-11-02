package com.lsy.netty.protocol;

import lombok.Data;

import java.io.Serializable;

/**
 * 自定义传输协议
 * @author lsy
 * @date 2020/10/30 18:56
 */
@Data
public class InvokerProtocol implements Serializable {

    /**
     * 类名
     */
    private String className;
    /**
     * 函数名称
     */
    private String methodName;
    /**
     * 参数类型
     */
    private Class<?> [] parames;
    /**
     * 参数列表
     */
    private Object [] values;
}
