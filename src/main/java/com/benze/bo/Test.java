package com.benze.bo;

import java.util.Date;

public class Test {

    public static void main(String[] args) {
        ApplyAspect aa = new ApplyAspect();
        aa.setCreated(new Date());
        System.out.println( aa.getCreated().toString());
        System.out.println(aa.toString());
        System.out.println("all done");
    }
}
