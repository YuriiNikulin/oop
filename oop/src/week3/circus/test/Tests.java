package week3.circus.test;

import week2.group.Address;
import week2.group.MyDate;
import week3.circus.Cirkus;
import week3.circus.workers.Acrobat;
import week3.circus.workers.Clown;
import week3.circus.workers.Funambulist;
import week3.circus.workers.Magician;

/**
 * Created by yurii on 26.09.2016.
 */
public class Tests {
    public static void main(String[] args) {
        Cirkus cirkus = new Cirkus("dsfs", new Address("ua","kiev","obolon",12));


        Acrobat acrobat = new Acrobat("dash",new MyDate(1988,9,3),new Address("sdf","sdssff","erthr",8));

        cirkus.addArtist(new Clown("misha",new MyDate(1980,3,3),new Address("sdf","sdssff","erthr",4)));
        cirkus.addArtist(acrobat);
        cirkus.addArtist(new Magician("kolya",new MyDate(1998,9,13),new Address("sdf","sdssff","erthr",90)));
        cirkus.addArtist(new Funambulist("vasya",new MyDate(1981,11,10),new Address("sdf","sdssff","erthr",89)));

        System.out.println(cirkus.allArtist());

        cirkus.dellArtist();

        System.out.println();
        System.out.println(cirkus.allArtist());

        cirkus.goAct(acrobat);
        cirkus.getMoneyArtists(1000);
        System.out.println(cirkus.howManyGoAct());

        cirkus.newLokation(new Address("sdf","sdssff","erthr",89));

    }

}
