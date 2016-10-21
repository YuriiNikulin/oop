package week3.sort.selectSort;

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

        MySortSelect ss = new MySortSelect();
        Comparator com = MyUtils.integerComparator();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        ss.sortList(list,com);

        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

    }


}
