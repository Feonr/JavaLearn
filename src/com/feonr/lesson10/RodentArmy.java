package com.feonr.lesson10;

public class RodentArmy {
   public static Rodent rodents []=new Rodent[15];
    public static RandomRodent randomRodent=new RandomRodent();
    public static void main(String[] args) {
        for(int i=0;i<15;i++){
            rodents[i]=randomRodent.next();
            rodents[i].giveVoice();
        }
    }
}
