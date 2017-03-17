package com.jayden.Test;

import com.jayden.Filter.FileFilterBySuffix;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SOONG on 2017/3/17.
 * 练习：建立指定文件（目录）的清单文件。将指定目录下的指定文件（包含子目录）的路径写入到一个文件中。
 * 该文件就作为指定文件的清单文件。
 */
public class ListFileTest {
    /*
     * 思路：1、指定目录下的指定文件——过滤器
     *       2、包含子目录——递归
     *       3、写入文件——FileWriter
     */
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Codes\\Java\\bxdjava");
        List<File> list = new ArrayList<>();
        getFiles(file,list);
        getFilesList(list);
    }

    private static void getFilesList(List<File> list) throws IOException {
        File file = new File("FileList.txt");
        BufferedWriter bufferedWriter = null;
        try{
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (File file1 : list) {
                bufferedWriter.write(file1.getAbsolutePath());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }finally {
            if (bufferedWriter != null)
                try {
                    bufferedWriter.close();
                }catch (IOException e) {
                    throw new RuntimeException("关闭失败");
                }
        }
    }

    private static void getFiles(File file, List<File> list) {
//        1、listFiles() 方法，获取指定目录下的文件对象。
        File[] files = file.listFiles();
        FileFilterBySuffix filter = new FileFilterBySuffix(".java");
        StringBuilder sb = new StringBuilder();

        if (files != null)
//            2、遍历文件对象数组
            for (File file1 : files){
//                3、判断是否是目录，若是，则递归
                if (file1.isDirectory())
                    getFiles(file1,list);
                else
                    if (filter.accept(file1))
                        list.add(file1);
            }
    }
}
