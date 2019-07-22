package com.company.task_124_A_4;

public class Main {

    public static void main(String[] args) {

        City[] cities = new City [7];

        cities[0] = new City ("Минск", 348, 1992685, true, true);
        cities[1] = new City ("Брест", 350616, 145, false, true);
        cities[2] = new City ("Витебск", 378459, 124, false, true);
        cities[3] = new City ("Гомель", 535693, 139, false, true);
        cities[4] = new City ("Барановичи", 179166, 85, false, false);
        cities[5] = new City ("Бобруйск", 217546, 96.4, false, false);
        cities[6] = new City ("Молодечно", 95011, 30, false, false);

        Region[] regiones = new Region [4];
        regiones[0] = new Region("Минская",39854,1428530);
        regiones[1] = new Region("Брестская",32787,1380391);
        regiones[2] = new Region("Витебская",40051,1171523);
        regiones[2] = new Region("Гомельская",40372,1409890);

        City c = new City();

        System.out.println("Областные центры");
        c.conclusionRegionalCenters(cities);


    }
}
