package week1.arrey;

/**
 * Created by yurii on 20.09.2016.
 */
public class Test {
    public static void main(String[] args) {
        int[] mas = {1,2,3,4,5};

        Arrey m = new Arrey(mas);

        m.minElement();

        m.randomInIntervav(3,7).print();

        System.out.println("max "+m.maxElement());
        System.out.println("min "+m.minElement());

        m.Size(9).print();

        m.sort().print();
    }
}
