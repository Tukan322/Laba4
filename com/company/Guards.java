package com.company;

class Guards extends Humans {
    private static double chance;

    static double getChance(){
        return chance;
    }

    private static void Inspire(){
        double upchance = Math.round(Math.random()*5) / 100.0;
        chance -= upchance;
        System.out.println("Стражник воодушевлен и шанс успешной защиты увеличен на " + upchance * 100 + " %");
        System.out.println();
    }

    static void setChance(){
        Monsters innerMonster = () -> {
            double downchance =  Math.round(Math.random()*5)/100.0;
            System.out.println("Мысли стража:");
            System.out.println("Ты не справишься с этим...");
            System.out.println("Ты не вынесешь это...");
            System.out.println();
            chance += downchance;
            System.out.println("Из-за неуверенности стража шанс успешной защиты умаеньшен на " + downchance * 100 + " %");
            System.out.println();
        };

        double randomed = Math.random();
        if (randomed> 0.9) {
            chance += 0.06;
            System.out.println("Однако стража была значительно ослаблена ");
            System.out.println("Шанс успешной защиты уменьшен на 6%");
            System.out.println();
        }

        if (randomed < 0.4) {
            chance += 0.03;
            System.out.println("Однако стража было слегка ослаблена ");
            System.out.println("Шанс успешной защиты уменьшен на 3%");
            System.out.println();
        }

        if ((randomed >= 0.4) & (randomed <= 0.9)){
            System.out.println("Стража осталась невредимой в этой схватке");
            System.out.println();
        }

        if (Math.random() > 0.8)
            innerMonster.BattleRoar();

        if (Math.random() > 0.8){
            Inspire();
        }
    }

    static void die(){
       RichMans.die();
   }

}
