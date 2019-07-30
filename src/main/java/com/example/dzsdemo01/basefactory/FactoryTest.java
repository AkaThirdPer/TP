package com.example.dzsdemo01.basefactory;

/**
 * 工厂模式，基本模型
 */
public class FactoryTest {
    public static void main(String[] args) {
        ColorFactory colorFactory = new ColorFactory();
        Color bule = colorFactory.getColorInstance("Bule");
        bule.getColor();
        Color red = colorFactory.getColorInstance("Red");
        red.getColor();

    }
}
