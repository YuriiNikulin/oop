package week1.drib;

/**
 * Created by yurii on 20.09.2016.
 */
public class TestDrib {
    public static void main(String[] args) {
        Drib drib1 = new Drib(10,5);
        Drib drib2 = new Drib(10,9);

        Drib res = drib1.sum(drib2);

        res.print();
    }
}
