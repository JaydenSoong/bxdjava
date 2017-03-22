package com.jayden.otherIO.ObjectStream;

import com.jayden.entity.Person;

import java.io.*;

/**
 * Created by DaiLiang on 2017/3/22.
 * ObjectStream 演示
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        writeObject();  //对象的序列化
        readObject();   //对象的反序列化
    }

    private static void readObject() throws IOException, ClassNotFoundException {
//        1、定义流对象关联存储了对象的文件
        FileInputStream fis = new FileInputStream("temple_files\\obj.object");

//        2、建立用于读取对象的功能对象
        ObjectInputStream ooi = new ObjectInputStream(fis);

//        3、调用读取对象的方法
        Person p = (Person) ooi.readObject();
        System.out.println(p);
    }

    private static void writeObject() throws IOException {
//        1、明确存储对象的文件
        FileOutputStream fos = new FileOutputStream("temple_files\\obj.object");

//        2、给操作文件对象加入写入对象功能
        ObjectOutputStream oos = new ObjectOutputStream(fos);

//        3、调用写入对象方法
        oos.writeObject(new Person("Jay", 30));

//        4、关流
        oos.close();
    }
}
