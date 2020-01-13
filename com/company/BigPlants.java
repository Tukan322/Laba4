package com.company;

public class BigPlants implements Monsters {
    private static boolean aliveq;

    public static void setAliveq(){
        aliveq = Math.random() > 0.80;
    }

    public static boolean getAliveq(){
        return aliveq;
    }

    public static class Roots{

        public static void getOutOfEarth(){
            System.out.println("Корни вырвались из земли и растения начали движения");
        }

    }

    @Override
    public void BattleRoar() {
        System.out.println("RRHAARGH");
    }

}
