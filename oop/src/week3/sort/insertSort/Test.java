package week3.sort.insertSort;

import week3.sort.MyUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/**
 * Created by yurii on 28.09.2016.
 */
public class Test {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList();


        for (int i = 0; i < 9; i++) {
            list.add(i, rand.nextInt(20));
        }

        MyInsertSort is = new MyInsertSort();
        Comparator com = MyUtils.integerComparator();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        is.sortList(list,com);

        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

    }
}
