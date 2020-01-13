package com.company;

public enum Winter implements Nature {
    winter;
    public void CantGetToWork() {
        int k = 0;
        for (int i = 0; i < 30 ; i++){
            if (Math.random() > 0.98)
                k++;
        }
        long lost = Math.round(Bredlam.getStandSalary() * (k / 30.0));
        if (k > 0) System.out.println("Из-за морозов работяги пропустили " + k + " дней и потеряли " + lost + " денег");
        Bredlam.setStandSalary(Bredlam.getStandSalary() - lost);
        System.out.println();
    }
}
