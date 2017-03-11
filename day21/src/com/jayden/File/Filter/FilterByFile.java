package com.jayden.File.Filter;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by DaiLiang on 2017/3/11.
 * File Filter
 */
public class FilterByFile implements FileFilter{
    @Override
    public boolean accept(File pathname) {
        return pathname.isFile();
    }
}
