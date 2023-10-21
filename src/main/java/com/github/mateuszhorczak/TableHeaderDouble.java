package com.github.mateuszhorczak;

public class TableHeaderDouble extends TableHeader {
    public TableHeaderDouble(String type) {
        super(type);
    }

    @Override
    public TableData createTableData() {
        return new TableDataDouble();
    }
}
