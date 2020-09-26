package pl.sdacademy.zdjavapol33.java.zaawansowana.stream;

import java.util.List;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 26.09.2020
 **/
class Statistics {
    private double average;
    private List<Integer> values;

    public Statistics(final double average, final List<Integer> values) {
        this.average = average;
        this.values = values;
    }

    public double getAverage() {
        return average;
    }

    public List<Integer> getValues() {
        return values;
    }
}