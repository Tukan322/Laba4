package com.company;

class PlantsAttack {
    private static boolean plantAttackq = false;

    static boolean getPlantAttackq(){
        return plantAttackq;
    }

    static void setPlantAttackq(){
        plantAttackq = false;
    }

    static void plantsAttack(int i){
        try{
            if(BigPlants.getAliveq()) {
                WinterAttack.getWinterq(i);
                BigPlants bigPlants = new BigPlants();
                plantAttackq = true;
                class LocalPlantAttack{
                    private void localSetPlantAttackq(){
                        plantAttackq = true;
                    }
                }
                LocalPlantAttack localVar = new LocalPlantAttack();
                localVar.localSetPlantAttackq();
                System.out.println("ALARM!!!!!!!!!!");
                bigPlants.BattleRoar();
                System.out.println("Древнее зло пробудилось");
                System.out.println();
                BigBredlam.callBigBredlam();
                BigPlants.Roots.getOutOfEarth();
                System.out.println("Большие растения начали нападения на лунный город");
                System.out.println("Сражения происходили во всех частях города");
                System.out.println("Ожесточенная битва изматывала обе стороны");
                System.out.println("Но в итоге...");
                System.out.println();
                if (Math.random() > (1 - Guards.getChance())) Guards.die();
                else {
                    System.out.println("Нападение Больших растений было успешно отражено ");
                    Guards.setChance();
                }
            }
        }
        catch (WinterException ex){
            System.out.println("Растения пытались разрастись, но суровые условия зимы не позволили им этого сделать");
        }
    }
}
