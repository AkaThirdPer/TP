package com.example.dzsdemo01.baseSingleton;

/**
 * 单例模式，线程不安全
 */
public class BaseSingleton {

    private static BaseSingleton basesingle=null;
    //私有构造器
    private BaseSingleton(){}
    public static BaseSingleton getInstance(){
        if(null==basesingle){
            basesingle=new BaseSingleton();
            return  basesingle;
        }else{
            return basesingle;
        }

    }
    public  static  void main (String[]args){
        System.out.print(BaseSingleton.getInstance().hashCode()+"\n");
        System.out.print(BaseSingleton.getInstance().hashCode()+"\n");
        System.out.print(BaseSingleton.getInstance().hashCode());
    }
}
