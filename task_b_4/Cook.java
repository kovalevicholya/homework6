package com.company.task_126_B_4;

public class Cook {
    private Vegetables[] c = new Vegetables[20];

    public void washVegetable() {
        System.out.println("Овощи помыты");
    }

    public void pellVegetable() {
        System.out.println("Овощи почищены");
    }

    public void сutVegetable() {
        System.out.println("Овощи порезаны");
    }

    public void mixVegetable() {
        System.out.println("Овощи перемешаны");
    }

    public void addRef() {
        System.out.println("В салат добавлен соус");
    }

    public void calculationCalorie(Vegetables[] c) {
        double calorie=0;
        for (Vegetables m : c) {
            if (m != null) {
                calorie=calorie+(m.getCalorie() * (m.getWight()) / 100);
            }
        }
        System.out.println("Калорийность салата = "+calorie+" Ккал ");
    }

    public void OutByCalorie(Vegetables[] c, double calorie, double calorie2) {
        for (Vegetables m : c) {
            if (m != null) {
                if (m.getCalorie()>calorie&&(m.getCalorie()<calorie2)) {
                    System.out.print("name: "+m.getName()+", ");
                    System.out.print("calorie: "+m.getCalorie()+", ");
                    System.out.print("wight: "+m.getWight()+", ");
                    System.out.println();
                }
            }
        }
    }
    public void OutVegetables(Vegetables[] c) {
        for (Vegetables m : c) {
            System.out.print("name: "+m.getName()+", ");
            System.out.print("calorie: "+m.getCalorie()+", ");
            System.out.print("wight: "+m.getWight()+", ");
            System.out.println();
        }
    }
    public void sorting (Vegetables[] c) {
        Vegetables d;
        for (int i=0; i<(c.length-1); i++) {
            for (int j=0; j<(c.length-1-i); j++) {
                if (c[j].getCalorie()>c[j+1].getCalorie()) {
                    d=c[j];
                    c[j]=c[j+1];
                    c[j+1]=d;
                }
            }
        }
    }
}
