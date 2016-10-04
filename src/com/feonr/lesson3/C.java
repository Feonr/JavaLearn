package com.feonr.lesson3;


public class C extends A {
    public B b=new B(2);
    C(){
        super(1);
    }
    public static void main(String[] args) {
        C c=new C();
    }
}
