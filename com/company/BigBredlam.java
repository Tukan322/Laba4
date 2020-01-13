package com.company;

class BigBredlam extends Bredlam {
    static void makeMoreTime() {
        System.out.println("Денег нет, но вы держитесь");
    }

    static void pullTheirNoses() {
        System.out.println("Сейчас от нас требуется тихо сидеть и не барахтаться. Есть инфа от человека выше, что зарплаты скоро поднимутся, как только все внешние проблемы будут решены, а они будут решены скорее всего в следующем месяце");
        System.out.println();
    }

    public static class Table{

        private int legsCount = 4;
        private int humanCapacity = 8;
        private boolean isBroken = false;
        void burn() {
            System.out.println("Table says");
            System.out.println("I'm on fire");
            isBroken = true;
        }

        void repairTable(){
            isBroken = false;
        }
    }

    static void callBigBredlam() {
        CoalBredlam coalRichMan = new CoalBredlam();
        CheeseBredlam cheeseRichMan = new CheeseBredlam();
        SugarBredlam sugarRichMan = new SugarBredlam();
        Table table = new Table();

        System.out.println("Спрутс вызвал большой бредлам на сбор");

        if (table.isBroken & Math.random() > 0.5){
            table.repairTable();
            System.out.println("Кто-то починил стол");
        }

        if (!table.isBroken) {
            System.out.println("Собрание прошло за круглым столом");
        }
        else System.out.println("Собрание было проведено в пустой комнате с выжженным столом");

        if (Math.random() > 0.95){
            System.out.println("Одмн из членов заседания не соблюдал технику пожарной безопасности ");
            table.burn();
        }

        System.out.println("One day after");
        if (sugarRichMan.getAgree() & cheeseRichMan.getAgree() & coalRichMan.getAgree()) {
            System.out.println("Собранием большого бредлама было решено выставить стражу на защиту города");
            System.out.println();
        }

    }

    BigBredlam() {
        this.agree = true;
    }

    boolean getAgree() {
        return this.agree;
    }

    private boolean agree;
    protected static long CheeseCost = Math.round(Math.random() * 100 + 10);
    protected static long CoalCost = Math.round(Math.random() * 100 + 10);
    protected static long SugarCost = Math.round(Math.random() * 100 + 10);
}
