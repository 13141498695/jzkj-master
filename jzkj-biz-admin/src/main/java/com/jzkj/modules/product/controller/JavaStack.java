package com.jzkj.modules.product.controller;

public class JavaStack {
    //fs在方法区
    final String fs="常在河边走，哪有不是写";
    int count=0;
    public void king(int money) {
        money=money-1000;
        count++;
        if(count>9000)  return;
        king(money);
    }
}
