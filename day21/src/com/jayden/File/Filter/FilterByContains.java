package com.jayden.File.Filter;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by DaiLiang on 2017/3/11.
 * 包含关键字过滤器
 */
public class FilterByContains implements FilenameFilter {
    private String con;

    /**
     *
     * @param con 希望过滤出的名称包含的关键字
     */
    public FilterByContains(String con) {
        this.con = con;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.contains(con);
    }
}
