package com.company;

import java.rmi.activation.ActivateFailedException;

class Bund {
    private static long StolenMoney;
    private static boolean bundq = false;
    private static boolean SucBund = false;

    static boolean getBundq(){
        return bundq;
    }

    static void setBundq(){
        bundq = false;
    }

    static boolean getSucBund(){
        return SucBund;
    }

    static void setSucBund(){
        SucBund = false;
    }

    static long getStolenMoney(){
        return StolenMoney;
    }

    static void setStolenMoney(long q){
        StolenMoney = q;
    }

    static void bund() {
        try {
            Activity.getActivityStatus(PlantsAttack.getPlantAttackq());
            long RB = Bredlam.getStandSalary();
            System.out.println("БУУУУУУУУНД!!111!!11!");
            System.out.println("Зарплата в размере " + RB + " слишком мала для работяг.");
            class FieldsEditor{
                private void setBundqInside(){
                    bundq = true;
                }
            }
            FieldsEditor editor = new FieldsEditor();
            editor.setBundqInside();
            System.out.println("Рабочие начали волнения.");
            System.out.println("Грядет бунд.");
            System.out.println("План готов. Начинается бунд");
            System.out.println("Рабочие начали нападения на Бредламы");
            if (Math.random() > 0.99) {
                System.out.println("Рабочим удалось вытащить часть денег из кармана жадных владельцев бредламов.");
                StolenMoney = Math.round(RB * Math.random() * 40);
                System.out.println("Рабочие получили " + StolenMoney + " денег");
                System.out.println("Однако теперь рабочие были уволены.");
                SucBund = true;
            } else {
                System.out.println("Рабочие безуспешно совершили нападения на бредламы.");
                System.out.println("Рабочие остались с пустыми руками и были лишены зарплаты за один месяц.");
            }
            System.out.println();
        }
        catch (ActivityException ex){
        }
    }

}
