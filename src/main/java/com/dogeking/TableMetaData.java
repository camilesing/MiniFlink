package com.dogeking;

import java.util.*;

public class TableMetaData {

    private List<ColumnMetaData> columnMetaDataList = new ArrayList<>();

    public List<ColumnMetaData> getColumnMetaDataList() {
        return columnMetaDataList;
    }

    public void setColumnMetaDataList(List<ColumnMetaData> columnMetaDataList) {
        this.columnMetaDataList = columnMetaDataList;
    }
}

