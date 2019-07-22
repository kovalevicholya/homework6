package com.company.task_90_B_5;

public class Interval {
    private double x1;
    private double x2;
    private boolean isInclude;
    private final double d = 0.001;

    public Interval(double x1, double x2, boolean isInclude) {
        this.x1 = x1;
        this.x2 = x2;
        this.isInclude = isInclude;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        if (isInclude) {
            this.x1 = x1;
        } else {
            if (x1 >= 0) {
                this.x1 = x1-d;
            } else {
                this.x1 = x1+d;
            }
        }
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        if (isInclude) {
            this.x2 = x2;
        } else {
            if (x2 >= 0) {
                this.x2 = x2-d;
            } else {
                this.x2 = x2+d;
            }
        }
    }

    public boolean isInclude() {
        return isInclude;
    }

    public void setInclude(boolean include) {
        isInclude = include;
    }

    public double getD() {
        return d;
    }

    public void crossing(Interval inter) {
        System.out.println(this+"\t"+inter);
        int x = (int) Math.max(x1, inter.getX1());
        int y = (int) Math.min(x2, inter.getX2());
        if (x<y) System.out.println("Интервалы пересекаются");
        else System.out.println("Интервалы не пересекаются");
    }

    @Override
    public String toString() {
        String s1, s2;
        if (isInclude) {
            s1 = "[";
            s2 = "]";
        } else {
            s1 = "(";
            s2 = ")";
        }
        return s1+x1+"; "+x2+s2;
    }

    void combine(Interval inter) {
        System.out.println(this+"\t"+inter);
        if (x1<inter.getX2() && inter.getX1()<x2) {
            int x = (int) Math.min(x1, inter.getX1());
            int y = (int) Math.max(x2, inter.getX2());
            System.out.println("Интервалы пересекаются");
            System.out.println("Объединение интервалов: "+x+"..."+y);
        } else {
            System.out.println("Интервалы не пересекаются");
            System.out.println("Объединения у интервалов нет");
        }
    }
}

