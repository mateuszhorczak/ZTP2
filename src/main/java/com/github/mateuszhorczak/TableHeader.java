package com.github.mateuszhorczak;

abstract class TableHeader {
    private String type;

    public TableHeader(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }

    public abstract TableData createTableData();


}
