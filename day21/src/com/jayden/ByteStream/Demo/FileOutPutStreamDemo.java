package com.jayden.ByteStream.Demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by DaiLiang on 2017/3/11.
 * 文件输出流演示
 */
public class FileOutPutStreamDemo {
    public static void main(String[] args) throws IOException {
//        创建 FileOutPutStream 操作的文件对象
        File dir = new File("temp_files");
        if (!dir.exists())
            dir.mkdir();

//        创建 FileOutPutSteam 对象
        FileOutputStream fos = new FileOutputStream(dir + "\\fos.txt");

//        调用 FileOutPutStream 对象的写方法
        fos.write("Hello, World!".getBytes());

//        释放资源
        fos.close();
    }
}
