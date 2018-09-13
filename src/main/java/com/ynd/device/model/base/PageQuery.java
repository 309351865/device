package com.ynd.device.model.base;

import java.io.Serializable;

public class PageQuery<F>
        implements Limit, Serializable
{
    private static final long serialVersionUID = 1528809857874555265L;
    public static final int DEFAULT_PAGE_SIZE = 10;
    private int pageNum;
    private int pageSize;
    private F filter;
    private String orderField;
    private boolean asc;

    public PageQuery()
    {
        this(1);
    }

    public PageQuery(int pageNum)
    {
        this(pageNum, 10);
    }

    public PageQuery(int pageNum, int pageSize)
    {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public PageQuery(int pageNum, String orderField, boolean asc)
    {
        this(pageNum, 10, orderField, asc);
    }

    public PageQuery(int pageNum, int pageSize, String orderField, boolean asc)
    {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.orderField = orderField;
        this.asc = asc;
    }

    public void adjustPageNum(int totalSize)
    {
        if (totalSize == 0) {
            this.pageNum = 1;
        } else if (this.pageNum * this.pageSize > totalSize) {
            int add = (totalSize % this.pageSize == 0) ? 0 : 1;
            this.pageNum = (totalSize / this.pageSize + add);
        }
    }

    public int getPageNum()
    {
        return this.pageNum;
    }

    public void setPageNum(int pageNum)
    {
        this.pageNum = pageNum;
    }

    public int getNextPage()
    {
        return (this.pageNum + 1);
    }

    public int getPrePage()
    {
        return ((this.pageNum > 1) ? this.pageNum - 1 : 1);
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }

    public int getPageSize()
    {
        return this.pageSize;
    }

    public String getOrderField()
    {
        return this.orderField;
    }

    public void setOrderField(String orderField)
    {
        this.orderField = orderField;
    }

    public boolean isAsc()
    {
        return this.asc;
    }

    public void setAsc(boolean asc)
    {
        this.asc = asc;
    }

    public F getFilter()
    {
        return this.filter;
    }

    public void setFilter(F filter)
    {
        this.filter = filter;
    }

    public String getOrderByClause()
    {
        return (((null == this.orderField) || (this.orderField.isEmpty())) ? null : new StringBuilder().append(this.orderField).append(" ").append((this.asc) ? "ASC" : "DESC").toString());
    }

    public int getOffset()
    {
        return (this.pageSize * (this.pageNum - 1));
    }

    public int getRows()
    {
        return this.pageSize;
    }

    public static PageQuery build(int pageNum, int pageSize, String orderField, boolean asc)
    {
        return new PageQuery(pageNum, pageSize, orderField, asc);
    }

    public static PageQuery build(int pageNum, String orderField, boolean asc)
    {
        return new PageQuery(pageNum, orderField, asc);
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("PageQuery{");
        sb.append("pageNum=").append(this.pageNum);
        sb.append(", pageSize=").append(this.pageSize);
        sb.append(", filter=").append(this.filter);
        sb.append(", orderField='").append(this.orderField).append('\'');
        sb.append(", asc=").append(this.asc);
        sb.append('}');
        return sb.toString();
    }
}
