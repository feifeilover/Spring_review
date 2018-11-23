package com.lfeifei.pojo;

import java.util.List;

/**
 * @author :feifei
 * @date 2018/11/23 18:18
 * @Deprecated :分页实体类
 */
public class Paging<T> {
    /**当前页*/
    private int currPage;
    /**每页几个*/
    private int pageSize;
    /**总记录数*/
    private int rowsCount;
    /**总页数*/
    private int pageCount;
    /**分页的记录数据*/
    private List<T> data;

    public Paging() {
    }

    public Paging(int currPage, int pageSize) {
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

    @Override
    public String toString() {
        return "Paging{" +
                "currPage=" + currPage +
                ", pageSize=" + pageSize +
                ", rowsCount=" + rowsCount +
                ", pageCount=" + pageCount +
                ", data=" + data +
                '}';
    }
}
