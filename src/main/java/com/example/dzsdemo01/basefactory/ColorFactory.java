package com.example.dzsdemo01.basefactory;

public class ColorFactory {
    public   Color getColorInstance(String color){
        if(color==null){
          return null;
        }
        if(color.equalsIgnoreCase("Bule")){
            return new Bule();
        }else if(color.equalsIgnoreCase("Red")){
            return new Red();
        }
        return null;
    }
}
