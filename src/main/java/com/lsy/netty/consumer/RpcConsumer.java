package com.lsy.netty.consumer;

import com.lsy.netty.api.IRpcHelloService;
import com.lsy.netty.api.IRpcService;
import com.lsy.netty.consumer.proxy.RpcProxy;

/**
 * @author lsy
 * @date 2020/10/30 20:46
 */
public class RpcConsumer {
    public static void main(String[] args) {
        IRpcHelloService rpcHello = RpcProxy.create(IRpcHelloService.class);
        System.out.println(rpcHello.hello("Tom老师"));

        IRpcService service = RpcProxy.create(IRpcService.class);

        System.out.println("8 + 2 = " + service.add(8, 2));
        System.out.println("8 - 2 = " + service.sub(8, 2));
        System.out.println("8 * 2 = " + service.mult(8, 2));
        System.out.println("8 / 2 = " + service.div(8, 2));
    }
}
