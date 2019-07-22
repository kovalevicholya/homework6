package com.company.task_126_B_4;

public abstract class Vegetable {
    private int calorie;
    private int weight;
    private String name;
    private VgtblList list = VgtblList.Vgtbl;
    private enum VgtblList {Vgtbl,Морковь, Лук, Чеснок, Перец, Капуста, Салат, Помидор, Огурец, Картошка}

    Vegetable(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }

    abstract String preparation();

    int getCalor() {
        switch (list.valueOf(name)){
            case Морковь:	calorie=33; break;
            case Лук:	calorie=43; break;
            case Чеснок:	calorie=106; break;
            case Перец:	calorie=25; break;
            case Капуста:	calorie=30; break;
            case Салат:		calorie=14; break;
            case Помидор:	calorie=19; break;
            case Огурец:	calorie=15; break;
            case Картошка:	calorie=83; break;
            default: calorie=0; System.out.println("калорийность не известна");
        }

        return calorie;
    }

    int getWght() {
        return weight;
    }

    String getName() {
        return name;
    }

}