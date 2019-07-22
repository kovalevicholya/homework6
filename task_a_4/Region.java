package com.company.task_124_A_4;

import java.util.Objects;

public class Region {

   private String capitalRegion;

    public Region(String capitalRegion) {
        this.capitalRegion = capitalRegion;
    }

    public String getCapitalRegion() {
        return capitalRegion;
    }

    public void setCapitalRegion(String capitalRegion) {
        this.capitalRegion = capitalRegion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Region)) return false;
        Region region = (Region) o;
        return getCapitalRegion().equals(region.getCapitalRegion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCapitalRegion())%10;
    }
}


