package week3.circus;

import week2.group.Address;
import week2.group.MyDate;

/**
 * Created by yurii on 29.09.2016.
 */
public class Derektor extends Artist {
    public Derektor(String name, MyDate birthday, Address address) {
        super(name, birthday, address);
    }

    @Override
    public void makeShow() {
        System.out.println("dyakyyu za uvagu");
    }


}
