package com.example.dzsdemo01.dynamicproxy;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.cglib.proxy.Enhancer;


import java.lang.reflect.Proxy;

public class Clent {
    public  static  void main(String[]args){
        //真实对象
        RealSubject realSubject = new RealSubject();

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);

        //代理对象
        Subject proxyClass =(Subject)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class},myInvocationHandler);

        proxyClass.sellBooks();

        proxyClass.speak();

    }
}
