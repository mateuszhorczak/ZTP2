package com.github.mateuszhorczak;

public class TableHeaderInt extends TableHeader {

    public TableHeaderInt(String type) {
        super(type);
    }

    @Override
    public TableData createTableData() {
        return new TableDataInt();
    }
}
