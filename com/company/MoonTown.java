package com.company;

public interface MoonTown {
    long ProjitochniyMinimum = (SugarBredlam.getSugarCost() + CoalBredlam.getCoalCost() + CheeseBredlam.getCheeseCost()) * 40;

    static long RaiseProjitochniyMinimum(int i, long Proj) {
        if (i == 11 || i == 0 || i == 1) Proj = Math.round(Proj* 1.3);
        return Proj;
    }

    static void moonTownDie(){
        System.out.println("Лунный город проиграл в сражении с огромными растениями и был уничтожен. RIP");
        System.out.println("*BIG BOOM*");
        System.exit(0);
    }
}
