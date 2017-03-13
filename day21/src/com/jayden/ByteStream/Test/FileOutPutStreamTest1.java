package com.jayden.ByteStream.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;


/**
 * Created by DaiLiang on 2017/3/13.
 * 文件输出流练习——将系统信息写入到一个 txt 文件中。
 */
public class FileOutPutStreamTest1 {
    public static void main(String[] args) throws IOException {
//        1、获取系统信息。
        Properties prop = System.getProperties();
//        2、返回此属性列表中的键集
        Set<String> keySet = prop.stringPropertyNames();
//        3、foreach 取得字符串
        StringBuilder sb = new StringBuilder();
        for (String key : keySet) {
            String value = prop.getProperty(key);
            sb.append(key).append("  ----------  ").append(value).append("\n");
        }
//        4、创建输出流文件
        FileOutputStream fos = new FileOutputStream("temp_files\\java_information.txt");
//        5、调用写方法
        fos.write(sb.toString().getBytes());
//        6、释放资源
        fos.close();
    }
}
