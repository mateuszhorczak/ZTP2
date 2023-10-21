package com.github.mateuszhorczak;

public class TableHeaderBoolean extends TableHeader{

    public TableHeaderBoolean(String type) {
        super(type);
    }

    @Override
    public TableData createTableData() {
        return new TableDataBoolean();
    }
}
