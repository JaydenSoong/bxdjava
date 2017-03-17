package com.jayden.Filter;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by SOONG on 2017/3/17.
 * 文件过滤器——通过后指定缀名
 */
public class FileFilterBySuffix implements FileFilter{
    private String suff;

    public FileFilterBySuffix(String suff) {
        this.suff = suff;
    }

    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(suff);
    }
}
