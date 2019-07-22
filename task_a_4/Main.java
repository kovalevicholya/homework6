package com.company.task_124_A_4;

public class Main {
    public static void main(String[] args) {

        Area[] areas = new Area[2];
        areas[0] = new Area(12350);
        areas[1] = new Area(25682);

        City[] cities = new City [7];

        cities[0] = new City ("Минск");
        cities[1] = new City ("Брест");
        cities[2] = new City ("Витебск");
        cities[3] = new City ("Гомель");
        cities[4] = new City ("Барановичи");
        cities[5] = new City ("Бобруйск");
        cities[6] = new City ("Молодечно");

        Region[] regiones = new Region[2];
        regiones[0] = new Region (cities[1].getCityName());
        regiones[1] = new Region (cities[2].getCityName());

        State country = new State(areas, cities[0].getCityName(), regiones);
        System.out.println("Площадь государства");
        System.out.println(country.regionSquare());

        System.out.println("Cтолица государства");
        System.out.println( country.getCapital());

        System.out.println("Областные центры");
        country.getRegionsCapital();

        System.out.println("Количество областей");
        System.out.println(country.getNumberRegion());

        System.out.println(country.toString());
        System.out.println(regiones[0].hashCode());
        System.out.println(regiones[1].hashCode());
        System.out.println(regiones[0].equals(regiones[0]));
        System.out.println(regiones[0].equals(regiones[1]));


    }
}
