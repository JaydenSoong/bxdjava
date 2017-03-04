package com.jayden.comparator;

import java.util.Comparator;

/**
 * Created by DaiLiang on 2017/3/4.
 */
public class CompareByLength implements Comparator {

    /**
     * @param o1，字符串对象
     * @param o2，字符串对象
     * @return 1， -1， 0。
     * 对字符串按长度进行比较，若长度不等，按长度排序；若长度相等，按字符串自然排序。
     */

    @Override
    public int compare(Object o1, Object o2) {
        int temp = ((String)o1).length() - ((String)o2).length();
        return temp == 0 ? ((String)o1).compareTo((String)o2) : temp;
    }
}
