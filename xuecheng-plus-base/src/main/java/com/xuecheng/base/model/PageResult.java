package com.xuecheng.base.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/*
        @describe 分页查询结果模型类  响应模型类
 */
@Data
@ToString
public class PageResult<T> implements Serializable {
    //泛型的原因是：里面的字段不一样查询的内容也不一样

    private List<T> items;
    //数据列表

    private long counts;
    //总记录数

    private long page;
    //当前页码

    private long pageSize;
    //每页记录数


    public PageResult(List<T> items, long counts, long page, long pageSize) {
        this.items = items;
        this.counts = counts;
        this.page = page;
        this.pageSize = pageSize;
    }
}
