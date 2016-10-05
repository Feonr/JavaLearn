package com.feonr.lesson8;

import java.util.Random;

public class Finall {
    public static Random random=new Random(12);
    public static final int first=random.nextInt();
    public final int second=random.nextInt();

    @Override
    public String toString() {
        return "first "+first+" second "+second;
    }

    public static void main(String[] args) {
        Finall t1=new Finall();
        Finall t2=new Finall();
        System.out.println(t1);
        System.out.println(t2);
    }
}
