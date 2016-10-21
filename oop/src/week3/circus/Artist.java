package week3.circus;

import week2.group.Address;
import week2.group.MyDate;
import java.util.Random;

/**
 * Created by yurii on 26.09.2016.
 */
public abstract class Artist {

    private String name;
    private MyDate birthday;
    private Address address;
    private int drink;
    private Random random = new Random();
    private int act = 0;
    private double money;

    public Artist(String name, MyDate birthday, Address address) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.drink = random.nextInt(100);
    }


    public void goAct(){
        makeShow();
        act++;
    }

    public  abstract void makeShow();

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address=" + address + ", money=" + money +
                '}'+"\n";
    }


    public double getManey() {
        return money;
    }

    public void setMoney(double maney) {
        this.money = maney;
    }

    public int getAct() {
        return act;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getDrink() {
        return drink;
    }
}
