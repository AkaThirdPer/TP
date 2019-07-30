package com.example.dzsdemo01.baseSingleton;

/**
 * 懒汉式，线程安全
 */
public class BaseSingletonIsSafe {
    private static BaseSingletonIsSafe instance=null;
    private BaseSingletonIsSafe(){};
    public  static  synchronized  BaseSingletonIsSafe getInstance(){
        if(instance==null){
            instance= new BaseSingletonIsSafe();
            return instance;
        }else{
            return instance;
        }
    }
    public  static  void main (String[]args){
        System.out.print(BaseSingletonIsSafe.getInstance().hashCode()+"\n");
        System.out.print(BaseSingletonIsSafe.getInstance().hashCode()+"\n");
        System.out.print(BaseSingletonIsSafe.getInstance().hashCode());
    }
}
