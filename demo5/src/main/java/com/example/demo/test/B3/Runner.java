package com.example.demo.test.B3;

import java.io.FileInputStream;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        String path="D:\\java\\spring\\demo5\\src\\main\\java\\com\\example\\demo\\test\\B3\\input.txt";
        //read file input.txt
        FileInputStream fileInputStream=null;
        try{
            fileInputStream=new FileInputStream(path);
            int i=0;
            while((i=fileInputStream.read())!=-1){
                System.out.print((char)i);
            }
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
