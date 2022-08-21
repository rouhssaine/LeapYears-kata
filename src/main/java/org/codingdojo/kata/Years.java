package org.codingdojo.kata;

public class Years {

    public boolean isLeap(int year) {
        if(isDivisibleBy(year, 400)) return true;
        if(isDivisibleBy(year, 100)) return false;
        if(isDivisibleBy(year, 4)) return true;
        return false;
    }

    private boolean isDivisibleBy(int year, int divider) {
        return year % divider == 0;
    }

}
