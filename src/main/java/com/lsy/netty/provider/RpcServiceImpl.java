package com.lsy.netty.provider;

import com.lsy.netty.api.IRpcService;

/**
 * @author lsy
 * @date 2020/10/30 18:59
 */
public class RpcServiceImpl implements IRpcService {


    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mult(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }
}
