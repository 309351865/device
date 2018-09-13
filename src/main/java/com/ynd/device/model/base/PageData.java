package com.ynd.device.model.base;


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;

public class PageData<T>
        implements Serializable
{
    private static final long serialVersionUID = -2871359727765549367L;

    @JsonIgnore
    private PageQuery pageQuery;
    private List<T> dataList;
    private int totalSize;

    public PageData(int pageNum, int pageSize, int totalSize)
    {
        this(new PageQuery(pageNum, pageSize), null, totalSize);
    }

    public PageData(int pageNum, int pageSize, int totalSize, List<T> dataList)
    {
        this(new PageQuery(pageNum, pageSize), dataList, totalSize);
    }

    public PageData(PageQuery pageQuery, List<T> dataList, int totalSize)
    {
        this.pageQuery = pageQuery;
        this.dataList = dataList;
        this.totalSize = totalSize;
    }

    public int getPageNum()
    {
        return this.pageQuery.getPageNum();
    }

    public int getPageSize()
    {
        return this.pageQuery.getPageSize();
    }

    public int getTotalSize()
    {
        return this.totalSize;
    }

    public int getTotalPage()
    {
        int t = (this.totalSize % getPageSize() > 0) ? this.totalSize / getPageSize() + 1 : this.totalSize / getPageSize();
        if (t <= 0) {
            t = 1;
        }
        return t;
    }

    public int getNextPage()
    {
        return ((this.pageQuery.getPageNum() == getTotalPage()) ? this.pageQuery.getPageNum() : this.pageQuery.getNextPage());
    }

    public int getPrePage()
    {
        return this.pageQuery.getPrePage();
    }

    public List<T> getDataList()
    {
        return this.dataList;
    }

    public void setDataList(List<T> dataList)
    {
        this.dataList = dataList;
    }

    public boolean containData()
    {
        return (getTotalSize() > 0);
    }

    public PageQuery getPageQuery() {
        return this.pageQuery;
    }

    public Object getFilter() {
        return ((this.pageQuery == null) ? null : this.pageQuery.getFilter());
    }

    public static <T> PageData<T> build(int pageNum, int pageSize, int totalSize, List<T> dataList)
    {
        return build(new PageQuery(pageNum, pageSize), totalSize, dataList);
    }

    public static <T> PageData<T> build(PageQuery pageQuery, int totalSize, List<T> dataList)
    {
        return new PageData(pageQuery, dataList, totalSize);
    }
}
