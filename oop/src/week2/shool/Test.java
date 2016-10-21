package week2.shool;

import week2.group.Address;

/**
 * Created by yurii on 23.09.2016.
 */
public class Test {
    public static void main(String[] args) {

        Predmet p1 = new Predmet("mova",40);
        Predmet p2 = new Predmet("fizyka",40);
        Predmet p3 = new Predmet("literatura",40);

        Predmet[] allP = {p1,p2,p3};

        Student s1 = new Student("Kolya",new Address("UA","Kiev","peremogy sqr",34),allP);

    }
}
