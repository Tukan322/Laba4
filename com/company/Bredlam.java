package com.company;

public abstract class Bredlam extends RichMans{

    private static long StandSalary = Math.round(Math.random() * 100000);
    public long Salary;

    public static long getStandSalary(){
        return StandSalary;
    }
    public static void setStandSalary(long settedq){
        StandSalary = settedq;
    }

    public boolean equals(Object object){
        if (object == null || object.getClass() != getClass()) {
            return false;
        }
        else {
            Bredlam bredlam = (Bredlam) object;
            return ((this.Salary == bredlam.Salary) & (this.Money == bredlam.Money));
        }
    }

    public String toString(){
        return("Зарплата " + this.Salary + ". Деньги " + this.Money);
    }

    public int hashCode(){
        int result;
        result = (int)((this.Salary + this.Money)*31);
        return result;
    }
}
