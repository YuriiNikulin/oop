package week3.sort;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by yurii on 28.09.2016.
 */
public class MyUtils {
    public static void swap(ArrayList list, int firstElementInd, int secondElementInd) {
        Object o = list.get(firstElementInd);
        list.set(firstElementInd, list.get(secondElementInd));
        list.set(secondElementInd, o);
    }

    public static Comparator<Integer> integerComparator(){
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
    }
}
