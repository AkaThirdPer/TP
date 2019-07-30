package com.example.dzsdemo01.baseSingleton;

/**
 * 双检锁/双重校验锁
 * 在多线程中仍保持较高性能
 */
public class BaseSingletonDcl {
    private volatile static BaseSingletonDcl instance=null;
    private BaseSingletonDcl(){}
    public static  BaseSingletonDcl getInstance(){
        if(instance==null){
            synchronized (BaseSingletonDcl.class){
                instance=new BaseSingletonDcl();
                return instance;
            }
        }else{
            return instance;
        }
    }

}
