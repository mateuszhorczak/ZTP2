package com.github.mateuszhorczak;

public class TableDataChar implements TableData {
    private char data;

    public TableDataChar() {
        data = (char) (rnd.nextInt(26) + 'a');
    }

    public String toString() {
        return Character.toString(data);
    }
}
