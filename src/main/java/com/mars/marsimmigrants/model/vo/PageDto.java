package com.mars.marsimmigrants.model.vo;

import java.util.List;

public class PageDto<T> {
    //总条数
    private Long total;
    //当前页面，从一开始
    private  Integer pageNo;
    //每页的最大数量，不是dat集合的长度
    private Integer pageSize;
    //总页数
    private Integer pages;
    //当前页的数据集合
    private List<T> data;

    //是否由前一页
    private boolean hasPreviousPage=false;
    //是否有下一页
    private  boolean hasNextPage=false;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public boolean isHasPreviousPage() {
        return hasPreviousPage;
    }

    public void setHasPreviousPage(boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public PageDto() {
    }

    public PageDto(Long total, Integer pageNo, Integer pageSize, Integer pages, List<T> data, boolean hasPreviousPage, boolean hasNextPage) {
        this.total = total;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.pages = pages;
        this.data = data;
        this.hasPreviousPage = hasPreviousPage;
        this.hasNextPage = hasNextPage;
    }
}
