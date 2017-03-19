package com.jayden.IO;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by SOONG on 2017/3/19.
 * 带行号的字符流
 */
public class MyLineNumberReader extends MyBufferedReader {
    private int lineNum;
    public MyLineNumberReader(Reader r) {
        super(r);
    }

    @Override
    public String myReadline() throws IOException {
        lineNum ++;
        return super.myReadline();
    }

    public int getLineNum() {
        return lineNum;
    }

    public void setLineNum(int lineNum) {
        this.lineNum = lineNum;
    }
}
