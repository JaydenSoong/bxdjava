package com.jayden.File.Filter;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by DaiLiang on 2017/3/10.
 * 后缀名过滤器
 */
public class FilterBySuffix implements FilenameFilter{
    private String suf;

    /**
     * @param suf 希望过滤出的后缀名
     */
    public FilterBySuffix(String suf) {
        this.suf = suf;
    }

    @Override
    public boolean accept(File path, String name) {
        return name.endsWith(suf);
    }
}
