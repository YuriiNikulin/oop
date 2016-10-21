package week3.sort.selectSort;

import week3.sort.MyUtils;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by yurii on 28.09.2016.
 */
public class MySortSelect {
    public void sortList(ArrayList list, Comparator comparator) {
        MyUtils u = new MyUtils();

        int minEl = 0;

        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i ; j < list.size(); j++) {
                if (comparator.compare(list.get(minEl), list.get(j)) > 0) {
                    minEl = j;
                }
            }
            u.swap(list, minEl, i);
            minEl = i+1;
        }
    }
}
