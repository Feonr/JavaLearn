package com.feonr.lesson9;
import static net.feonr.util.Print.*;



public class Init {
    public static final String TAG="Init";
    Init(){
        System.out.println("I'm Initing "+TAG);

    }
}
class Another{



    public static void main(String[] args) {
        System.out.println("nothing");
        Init a;
        System.out.println(Init.TAG);
    }
}
