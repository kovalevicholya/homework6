package com.company.task_124_A_4;

public class City {

    private String name;
    private double square;
    private double population;
    private boolean capital;
    private boolean regionalCenter;

    private State[] city = new State[50];

    public City(String name, double square, double population, boolean capital, boolean regionalCenter) {
        this.name = name;
        this.square = square;
        this.population = population;
        this.capital = capital;
        this.regionalCenter = regionalCenter;
    }

    public City() {

    }

    public void conclusionRegionalCenters (City[] city) {
      for(int i=0; i<7; i++) {
          if(regionalCenter){
              System.out.println(name);
          }
      }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public boolean isRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(boolean regionalCenter) {
        this.regionalCenter = regionalCenter;
    }
}
