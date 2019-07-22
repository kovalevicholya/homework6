package com.company.task_124_A_4;

import java.util.Arrays;
import java.util.Objects;

public class State {
    private String capital;
    private Area[] areaRegion = new Area[2];
    private Region[] regions = new Region[2];
    private int numberRegion;
    double localSquare = 0;

    public State( Area[] areaRegion, String capital, Region[] regions ) {
        this.areaRegion = areaRegion;
        this.capital=capital;
        this.regions = regions;
    }

    public void getRegionsCapital() {
        for (int i = 0; i<regions.length; i++) {
            System.out.println(regions[i].getCapitalRegion());
        }
    }

    public String getCapital() {
        return capital;
    }

    public double regionSquare() {
        for (int i = 0; i<areaRegion.length; i++) {
            localSquare = localSquare+areaRegion[i].getSquareArea();
        }
        return localSquare;
    }

    public int getNumberRegion() {
        numberRegion=regions.length;
        return numberRegion;
    }

    @Override
    public String toString() {
        return "State{"+
                "capital='"+capital+'\''+
                ", areaRegion='"+localSquare +
                ", numberRegion="+numberRegion+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof State)) return false;
        State state = (State) o;
        return getNumberRegion() == state.getNumberRegion() &&
                Double.compare(state.localSquare, localSquare) == 0 &&
                getCapital().equals(state.getCapital()) &&
                Arrays.equals(areaRegion, state.areaRegion) &&
                Arrays.equals(regions, state.regions);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getCapital(), getNumberRegion(), localSquare);
        result = 31 * result+Arrays.hashCode(areaRegion);
        result = 31 * result+Arrays.hashCode(regions);
        return result;
    }
}
