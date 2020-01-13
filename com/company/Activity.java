package com.company;

public class Activity{
    static void getActivityStatus(boolean attackq) throws ActivityException{
        if (attackq) throw new ActivityException();
    }
    public static boolean q;
}

class ActivityException extends Exception {
    ActivityException(){
        System.out.println("В этом месяце рабочие собирались бунтовать, но им помешало нападение растений.");
        System.out.println("Владельцы бредламов посовещавшись сделали объявление для всех рабочих: ");
        BigBredlam.pullTheirNoses();
    }
}
