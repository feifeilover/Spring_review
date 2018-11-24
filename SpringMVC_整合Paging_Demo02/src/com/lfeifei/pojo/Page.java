package com.lfeifei.pojo;

import java.util.List;

/**
 * @author :feifei
 * @date 2018/11/23 21:51
 * @Deprecated
 */
public class Page<T> {
    private int currPage;
    private int pageSize;
    private int rowsCount;
    private int pageCount;
    private List<T> data;

    public Page() {
    }

    public Page(int currPage, int pageSize) {
        this.currPage = currPage;
        this.pageSize = pageSize;
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getRowsCount() {
        return rowsCount;
    }

    public void setRowsCount(int rowsCount) {
        this.rowsCount = rowsCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
