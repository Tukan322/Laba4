package com.company;

public class WinterAttack {
    public static void getWinterq(int i) throws WinterException{
        if (i%12==0 || i%12 == 1 || i%12 == 11) throw new WinterException();
    }
}

class WinterException extends Exception{
    public WinterException(){
    }
}
