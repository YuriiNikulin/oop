package week1.drib;

import week1.number.Number;

/**
 * Created by yurii on 20.09.2016.
 */
public class Drib {

    private int chyselnyk;
    private int znamenyk;
    private Number value;

    public Drib(int chyselnyk, int znamenyk) {
        this.znamenyk = znamenyk;
        this.chyselnyk = chyselnyk;
        this.value = new Number(((double) chyselnyk) / ((double) znamenyk));
    }


    public Drib sum(Drib dodanok) {
        int newChyselnyk = 0;
        int newZnamenyk = 0;

        if (this.getZnamenyk() == dodanok.getZnamenyk()) {
            newChyselnyk = this.chyselnyk + dodanok.getChyselnyk();
            newZnamenyk = dodanok.getZnamenyk();
        } else {
            int nok = NOK(this.znamenyk, dodanok.getZnamenyk());
            newZnamenyk = nok;
            newChyselnyk = (this.chyselnyk * nok / this.znamenyk + dodanok.getChyselnyk() * nok / dodanok.getZnamenyk());
        }
        return new Drib(newChyselnyk, newZnamenyk);
    }


    public Drib minys(Drib vidyemnuk) {
        int newChyselnyk = 0;
        int newZnamenyk = 0;

        if (this.getZnamenyk() == vidyemnuk.getZnamenyk()) {
            newChyselnyk = this.chyselnyk - vidyemnuk.getChyselnyk();
            newZnamenyk = vidyemnuk.getZnamenyk();
        } else {
            int nok = NOK(this.znamenyk, vidyemnuk.getZnamenyk());
            newZnamenyk = nok;
            newChyselnyk = (this.chyselnyk * nok / this.znamenyk - vidyemnuk.getChyselnyk() * nok / vidyemnuk.getZnamenyk());
        }
        return new Drib(newChyselnyk, newZnamenyk);
    }

    public Drib pomnojutu(Drib mnojnuk) {

        return new Drib(this.chyselnyk * mnojnuk.getChyselnyk(), this.znamenyk * mnojnuk.getZnamenyk());
    }

    public Drib podilutu(Drib dilnuk) {

        return new Drib(this.chyselnyk * dilnuk.getZnamenyk(), this.znamenyk * dilnuk.getChyselnyk());
    }

    public int compareTo(Drib comparable) {

        if (this.value.getValue() > comparable.getValue().getValue()) {
            return 1;
        } else if (this.value.getValue() < comparable.getValue().getValue()) {
            return -1;
        } else {
            return 0;
        }

    }

    public String toString() {
        return this.getChyselnyk() + "/" + this.getZnamenyk();
    }

    public void print() {
        System.out.println("result= " + toString());
    }

    public Number getValue() {
        return value;
    }

    public int getChyselnyk() {
        return chyselnyk;
    }

    public int getZnamenyk() {
        return znamenyk;
    }

    private int NOD(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) a = a % b;
            else b = b % a;
        }
        a = a + b;
        return a;
    }

    private int NOK(int a, int b) {
//НСК=a*b/НОД(a,b)
        int aa, bb;
        if (a > b) {
            aa = a;
            bb = b;
        } else {
            aa = b;
            bb = a;
        }
        return aa / NOD(a, b) * bb;
    }
}
