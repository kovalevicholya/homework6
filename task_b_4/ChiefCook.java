package com.company.task_126_B_4;
import java.util.ArrayList;
import java.util.List;

public class ChiefCook {
    public static void main(String[] args) {
        Salad salad1 =new Salad("Вкусный", new Solid("Морковь", 100), new WithPeel
                ("Лук", 2), new Soft("Салат", 100), new Soft("Помидор", 50)
                ,new Soft("Перец", 50),new Solid("Картофель", 200));

        System.out.println(salad1);
        System.out.println();
        System.out.println();


        List<Salad> salad2 = new ArrayList<>();
        salad2.add(new Salad()
                .setName("Весенний")
                .setComponent(new Solid("Морковь", 100))
                .setComponent(new Soft("Чеснок", 1))
        );
        System.out.println(salad2);
    }

}
