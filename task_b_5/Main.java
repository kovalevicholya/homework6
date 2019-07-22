package com.company.task_90_B_5;

public class Main {

    public static void main(String[] args) {
        Interval[] intervals = new Interval[3];

        intervals[0] = new Interval(1, 9, true);
        intervals[1] = new Interval(-5, 12, false);
        intervals[2] = new Interval(-9, -7, true);

        for (int i = 0; i<intervals.length; i++) {
            for (int j = i+1; j<intervals.length; j++) {
                intervals[i].combine(intervals[j]);
                //intervals[i].crossing(intervals[i+1]);
            }
        }
    }
}

