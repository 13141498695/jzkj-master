package com.jzkj.modules.product.controller;


import java.util.LinkedList;
import java.util.List;

public class JvmTest {

    int count =0;
    public  void king(int money ){
        money=money-20;
        count++;
        king(money);

    }

    public static void main(String[] args) {

//        JavaStack  javactc=new JavaStack();
//
//                try{
//
//                    javactc.king(100000);
//                }catch(Throwable e) {
//                    System.out.println("异常"+javactc.count);
//
//                    throw e;
//        }

        List<Object> list=new LinkedList<>();//本地变量表
        int j=0;
        int i=0;
        while(true){
            if(j%10000==0){
                i++;
                System.out.println("i="+i);
                System.out.println("J"+list.size());
                list.add(new Object());
            }

        }



    }
}
