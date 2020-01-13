package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args){
        int yearsCount;
        boolean skip = false;
        try {
            System.out.println("Введите количество лет, в течении которых вам будет предоставлена информации о жизни лунного города ");
            System.out.println("При вводе не числа будет предоставлена информация за 1 год");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sYearsCount = reader.readLine();
            yearsCount = Integer.parseInt(sYearsCount);
        }
        catch (IOException |NumberFormatException ex){
            yearsCount = 1;
        }
        int N = yearsCount * 12;
        BigBredlam Spruts = new BigBredlam();
        CoalWorker coalWorker = new CoalWorker();
        CoalBredlam coalRichMan = new CoalBredlam();
        SugarBredlam sugarRichMan = new SugarBredlam();
        SugarWorker sugarWorker = new SugarWorker();
        CheeseBredlam cheeseRichMan = new CheeseBredlam();
        CheeseWorker cheeseWorker = new CheeseWorker();
        boolean WasBund = false;
        System.out.println("Жизнь в лунном городе в пределах " + yearsCount + " года(лет)");
        System.out.println();
        System.out.println("Цена на сахар в лунном городе " + SugarBredlam.getSugarCost());
        System.out.println("Цена на уголь в лунном городе " + CoalBredlam.getCoalCost());
        System.out.println("Цена на сыр в лунном городе " + CheeseBredlam.getCheeseCost());
        System.out.println("Прожиточный минимум: " + Bredlam.ProjitochniyMinimum);
        System.out.println("____________________________________");
        System.out.println();
        for (int i = 0; i < N; i++) {
            if(!skip) {
                try {
                    System.out.println("Вы хотите продолжить рассматривать модель лунного города(1 - предоставить информацию за выделенный промежуток сразу, любое другое число - да, любой другой ввод - нет)");
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    String doUWantToGoFurther = reader.readLine();
                    int check = Integer.parseInt(doUWantToGoFurther);
                    if (check == 1) skip = true;
                } catch (IOException | NumberFormatException ex) {
                    System.out.println("Конец рассматриваемого промежутка");
                    System.exit(0);
                }
            }
            PlantsAttack.setPlantAttackq();
            Bund.setBundq();
            Bund.setSucBund();
            BigPlants.setAliveq();
            Bredlam.setStandSalary(Math.round(Math.random() * 100000));
            coalRichMan.Salary = Bredlam.getStandSalary() * 8;
            cheeseRichMan.Salary = Bredlam.getStandSalary() * 8;
            sugarRichMan.Salary = Bredlam.getStandSalary() * 8;
            Spruts.Salary = Bredlam.getStandSalary() * 30;
            switch (i%12) {
                case 0:
                    System.out.println("######################################");
                    System.out.println("Happy new year");
                    System.out.println("######################################");
                    System.out.println();
                    System.out.println("Январь.");
                    break;
                case 1:
                    System.out.println("Февраль");
                    break;
                case 2:
                    System.out.println("Март");
                    break;
                case 3:
                    System.out.println("Апрель.");
                    break;
                case 4:
                    System.out.println("Май.");
                    break;
                case 5:
                    System.out.println("Июнь");
                    break;
                case 6:
                    System.out.println("Июль");
                    break;
                case 7:
                    System.out.println("Август");
                    break;
                case 8:
                    System.out.println("Сентябрь");
                    break;
                case 9:
                    System.out.println("Октябрь");
                    break;
                case 10:
                    System.out.println("Ноябрь");
                    break;
                case 11:
                    System.out.println("Декабрь");
                    break;
            }
            System.out.println(i/12 + " год");
            System.out.println();
            System.out.println("Капиталисты договорились установить в этом месяце зарплату в размере " + Bredlam.getStandSalary());
            System.out.println();
            PlantsAttack.plantsAttack(i);
            if (!WasBund) switch (i%12) {
                case 0:
                case 1:
                case 11:
                    Winter.winter.CantGetToWork();
                    break;
                case 2:
                case 3:
                case 4:
                    Spring.spring.CantGetToWork();
                    break;
                case 5:
                case 6:
                case 7:
                    Summer.summer.CantGetToWork();
                    break;
                case 8:
                case 9:
                case 10:
                    Autumn.autumn.CantGetToWork();
                    break;
                default:
            }
            if (!WasBund) {
                coalWorker.Salary = Bredlam.getStandSalary();
                sugarWorker.Salary = Bredlam.getStandSalary();
                cheeseWorker.Salary = Bredlam.getStandSalary();
            }
            if (Bredlam.getStandSalary() < Bredlam.ProjitochniyMinimum) Bund.bund();
            if (Bund.getSucBund()) {
                coalWorker.Salary = 0;
                sugarWorker.Salary = 0;
                cheeseWorker.Salary = 0;
                WasBund = true;
                if (Bund.getStolenMoney() > cheeseRichMan.Money) Bund.setStolenMoney(cheeseRichMan.Money);
                coalWorker.Money += Bund.getStolenMoney();
                sugarWorker.Money += Bund.getStolenMoney();
                cheeseWorker.Money += Bund.getStolenMoney();
                coalRichMan.Money -= Bund.getStolenMoney();
                cheeseRichMan.Money -= Bund.getStolenMoney();
                sugarRichMan.Money -= Bund.getStolenMoney();
            }
            coalRichMan.Money += coalRichMan.Salary - MoonTown.RaiseProjitochniyMinimum(i, Bredlam.ProjitochniyMinimum);
            if (!Bund.getBundq()) coalWorker.Money += coalWorker.Salary;
            if (!Bund.getBundq()) cheeseWorker.Money += cheeseWorker.Salary;
            cheeseRichMan.Money += cheeseRichMan.Salary - MoonTown.RaiseProjitochniyMinimum(i, Bredlam.ProjitochniyMinimum);
            sugarRichMan.Money += sugarRichMan.Salary - MoonTown.RaiseProjitochniyMinimum(i, Bredlam.ProjitochniyMinimum);
            if (!Bund.getBundq()) sugarWorker.Money += sugarWorker.Salary;
            Spruts.Money += Spruts.Salary - MoonTown.RaiseProjitochniyMinimum(i, Bredlam.ProjitochniyMinimum);
            coalWorker.Money -= MoonTown.RaiseProjitochniyMinimum(i, Bredlam.ProjitochniyMinimum);
            cheeseWorker.Money -= MoonTown.RaiseProjitochniyMinimum(i, Bredlam.ProjitochniyMinimum);
            sugarWorker.Money -= MoonTown.RaiseProjitochniyMinimum(i, Bredlam.ProjitochniyMinimum);
            if (!Bund.getBundq()) System.out.println("Работяги получили " + coalWorker.Salary + " денег.");
            else System.out.println("Работяги лишены зарплаты в этот месяц");
            System.out.println("Владельцы бредламов получили " + coalRichMan.Salary + " денег.");
            System.out.println("Господин Спрутс получил " + Spruts.Salary + " денег.");
            System.out.println();
            if (coalWorker.Money > 0) System.out.println("Деньги работяг составляют " + coalWorker.Money);
            else System.out.println("Работяги задолжали " + Math.abs(coalWorker.Money));
            System.out.println("Деньги Владельцев бредламов составляют " + coalRichMan.Money);
            System.out.println("Деньги Спрутса составляют " + Spruts.Money);
            System.out.println();
            System.out.println("Текущий шанс успешного нападения растений: " + Math.round(Guards.getChance()*100) + " %");
            System.out.println("КОНЕЦ МЕСЯЦА");
            System.out.println("____________________________________________");
            System.out.println();
        }

    }
    
}

// TASK

//lab4 Task
//Что означают фразы: "тяните время" и "водите за нос", надо полагать, понятно каждому; слова же "собираю большой бредлам" означали, что господин Спрутс решил обсудить предложение Миги и Жулио на совете капиталистов.
//lab3 Task
//Нужно сказать, что все богачи, жившие в лунных городах, объединялись между собой в сообщества, которые назывались бредламами. Так, например, существовал сырный бредлам, в который входили владельцы сыроваренных
//фабрик; сахарный бредлам, объединявший всех сахарозаводчиков; угольный бредлам, объединявший владельцев угольных шахт, и так далее. Такие бредламы нужны были богачам для того, чтобы держать в повиновении рабочих и
//выколачивать из них как можно больше прибылей. Собравшись вместе, капиталисты договаривались между собой, какую заработную плату платить рабочим. Благодаря этому сговору никто не платил рабочим больше той суммы,
//которую капиталисты установили сообща, и рабочие, сколько ни бились, никак не могли добиться улучшения условий жизни. Кроме того, бредлам устанавливал цены на выпускаемую продукцию: например, на сахар, на хлеб, на сыр,
//на ткани, на уголь. Никто не имел права продавать товары дешевле установленной бредламом цены, благодаря чему цены постоянно держались на высоком уровне, что опять-таки было очень выгодно для фабрикантов. Помимо
//отдельных так называемых малых бредламов, существовал один так называемый большой бредлам, в который входили представители всех остальных бредламов. Председателем большого бредлама был господин Спрутс.
//lab4 task cont
//Через день после того, как секретарша оповестила всех членов большого бредлама о том, что им необходимо явиться на совещание, большой бредлам собрался в кабинете у господина Спрутса за большим круглым столом,
// и господин Спрутс сделал сообщение о причинах столь экстренного заседания. Узнав, какая беда им грозит в связи с появлением гигантских растений, члены бредлама пришли в волнение и все,
// как один, присоединились к предложению господина Спрутса, который сказал, что все дело с гигантскими растениями необходимо убить в зародыше, то есть еще до того, как оно разовьется в полную силу.