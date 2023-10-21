package com.github.mateuszhorczak;

public class TableHeaderChar extends TableHeader {
    public TableHeaderChar(String type) {
        super(type);
    }

    @Override
    public TableData createTableData() {
        return new TableDataChar();
    }
}
