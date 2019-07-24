package com.company.task_126_B_4;

public class Main {

    public static void main(String[] args) {
        Vegetables[] vegetables = new Vegetables[6];

        vegetables[0] = new Vegetables("Морковь", 37, 100);
        vegetables[1] = new Vegetables("Огурец", 14, 110);
        vegetables[2] = new Vegetables("Перец", 27, 80);
        vegetables[3] = new Vegetables("Томаты", 23, 100);
        vegetables[4] = new Vegetables("Авокадо", 169, 50);
        vegetables[5] = new Vegetables("Капуста", 26, 200);

        System.out.println("Приготовление салата");
        Cook cook = new Cook();

        cook.washVegetable();
        cook.pellVegetable();
        cook.сutVegetable();
        cook.addRef();
        cook.mixVegetable();
        cook.calculationCalorie(vegetables);
        System.out.println("Овощи в салате, соответствующие заданному диапазону калорийности");
        cook.OutByCalorie(vegetables, 14, 100);
        System.out.println();
        cook.sorting(vegetables);
        cook.OutVegetables(vegetables);


    }
}
