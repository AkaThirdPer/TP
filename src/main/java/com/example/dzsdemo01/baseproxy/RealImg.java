package com.example.dzsdemo01.baseproxy;

public class RealImg implements Image{
    private String fileName;
    public RealImg(String fileName){
        this.fileName=fileName;
        loadFormDisk(fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying"+fileName);
    }
    private void loadFormDisk(String fileName){
        System.out.println("loading"+fileName);
    }
}
