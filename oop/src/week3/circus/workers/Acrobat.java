package week3.circus.workers;

import week2.group.Address;
import week2.group.MyDate;
import week3.circus.Artist;

/**
 * Created by yurii on 28.09.2016.
 */
public class Acrobat extends Artist {
    public Acrobat(String name, MyDate birthday, Address address) {
        super(name, birthday, address);
    }

    @Override
    public void makeShow() {
        System.out.println("ya acrobat");
    }


}
