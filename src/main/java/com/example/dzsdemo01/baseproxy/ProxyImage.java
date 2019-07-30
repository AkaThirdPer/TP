package com.example.dzsdemo01.baseproxy;

public class ProxyImage  implements Image{

    private RealImg realImg;
    private String fileName;
    public ProxyImage(String fileName){
        this.fileName=fileName;
    }
    public  void display(){
        if(realImg==null){
            realImg=new RealImg(fileName);
        }
        realImg.display();
    }
}
