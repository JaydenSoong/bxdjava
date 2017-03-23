package com.jayden.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

/**
 * Created by DaiLiang on 2017/3/23.
 */
public class MyWindow {
    public static final String LINE_SEPARATOR = System.getProperty("line.separator");
    private JButton 确定Button;
    private JPanel panel1;
    private JTextField textField1;
    private JList list1;
    private JTextArea textArea1;

    public MyWindow() {
        确定Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                showDir();
            }
        });
        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    showDir();
                }
            }
        });
    }

    private void showDir() {
        String tstr = textField1.getText();
        File dir = new File(tstr);
        if(dir.exists() && dir.isDirectory()) {
            textArea1.setText("");
            String[] strings = dir.list();
            for (String name : strings) {
                textArea1.append(name + LINE_SEPARATOR);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyWindow");
        frame.setContentPane(new MyWindow().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
