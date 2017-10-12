package com.base;

import java.io.UnsupportedEncodingException;

class A {
 
    static {
        System.out.print("1");
    }
 
    public A() {
        System.out.print("2");
    }
}
 
class B extends A{
 
    static {
        System.out.print("a");
    }
 
    public B() {
        System.out.print("b");
    }
}
 
public class Hello {
 
    public static void main(String[] args) throws UnsupportedEncodingException {
        A ab = new B();
        ab = new B();
        String s1 = "你好";
        String s2 = new String(s1.getBytes("GB2312"), "ISO-8859-1");
    }
 
}