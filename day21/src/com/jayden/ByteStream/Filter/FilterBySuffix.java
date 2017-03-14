package com.jayden.ByteStream.Filter;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by DaiLiang on 2017/3/14.
 * 文件过滤器
 */
public class FilterBySuffix implements FileFilter {
    private String suff;

    public FilterBySuffix(String suff) {
        this.suff = suff;
    }

    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(suff);
    }
}
