package week3.sort.bubblleSort;

import week3.sort.MyUtils;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by yurii on 26.09.2016.
 */
public class MySortBubble {

    public void sortList(ArrayList list, Comparator comparator) {
        MyUtils u = new MyUtils();

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (compareTo(list, comparator, j)>0){
                    u.swap(list,j,j+1);
                }
            }
        }
    }


    private int compareTo(ArrayList list, Comparator comparator, int j) {
        return comparator.compare(list.get(j),list.get(j+1));
    }
}
