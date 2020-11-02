package com.lsy.netty.provider;

import com.lsy.netty.api.IRpcHelloService;

/**
 * @author lsy
 * @date 2020/10/30 18:58
 */
public class RpcHelloServiceImpl implements IRpcHelloService {

    @Override
    public String hello(String name) {
        return "Hello " + name + "!";
    }
}
