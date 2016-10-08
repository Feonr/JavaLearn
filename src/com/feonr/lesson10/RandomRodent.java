package com.feonr.lesson10;

import java.util.Random;

public class RandomRodent {
    private Random random=new Random(22);
    public Rodent next(){
        int chNum=random.nextInt(3);

        switch (chNum){

            case 0:
                return new Mouse();
            case 1:
                return new Gebril();
            case 2:
                return new Hamster();
            default:
                return new Rodent();

        }
    }
}
