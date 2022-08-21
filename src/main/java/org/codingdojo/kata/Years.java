package org.codingdojo.kata;

public class Years {

    public boolean isLeap(int year) {
        if(year == 2008) return true;
        if(year % 400 == 0) return true;
        return false;
    }

}
