package week3.sort.insertSort;

import week3.sort.MyUtils;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by yurii on 28.09.2016.
 */
public class MyInsertSort {

    public void sortList(ArrayList list, Comparator comparator){
        MyUtils u = new MyUtils();


        for (int i = 1; i < list.size(); i++) {
            for (int j = i; j > 0; j--) {
                Object o = list.get(j);
                if (comparator.compare(o,list.get(j-1))<0){
                    u.swap(list,j,j-1);
                }
            }
        }
    }
}
