package com.feonr.lesson7;


public class Frog extends Amphibian {
    @Override
    protected void speak() {
        System.out.println("Whebeet");
    }
    private void giveVoice(Amphibian a){
        a.speak();
    }

    public static void main(String[] args) {
        Frog frog=new Frog();
        frog.giveVoice(frog);

    }
}
