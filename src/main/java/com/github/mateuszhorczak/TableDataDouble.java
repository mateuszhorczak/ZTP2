package com.github.mateuszhorczak;

public class TableDataDouble implements TableData{
    private double data;

    public TableDataDouble() {
        data = rnd.nextDouble(5, 100);
    }

    public String toString() {
        return Double.toString(data);
    }
}
