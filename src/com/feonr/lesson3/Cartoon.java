package com.feonr.lesson3;


class Art {
    Art() {
        System.out.println(("Art constructor"));
        System.out.println("I'm ART");}
}
class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}
public class Cartoon extends Drawing {

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}