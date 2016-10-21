package week2.sortString;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by yurii on 24.09.2016.
 */
public class Test {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();

        a.add("авг");
        a.add("абвгд");
        a.add("бвг");
        a.add("аабвг");
        a.add("абввг");

        MasString ms = new MasString(a);

        ms.print();
        System.out.println();
        ms.sortList();
        ms.print();
    }
}
