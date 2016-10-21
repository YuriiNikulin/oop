package week2.shool;

import week2.group.Address;
import java.util.Random;
/**
 * Created by yurii on 23.09.2016.
 */
public class Student {
    private String name;
    private Address address;
    private Predmet[] predmets = new Predmet[5];
    Random rand = new Random();

    public Student(String name, Address address, Predmet[] predmets) {
        this.name = name;
        this.address = address;
        this.predmets = predmets;
    }

    public Predmet study(String nameOfPredmet, int hours) {
        int i = 0;
        while (predmets[i] != null) {
            i++;
            if (predmets[i].equals(nameOfPredmet)) {
                predmets[i].setHoursStudentWorked(predmets[i].getHoursStudentWorked() + hours);
            predmets[i].setStudentMark(predmets[i].getHoursStudentWorked()+rand.nextInt(10));
            }
        }
        return predmets[i];
    }

    public Student addPredmet(Predmet predmet) {
        int i = 0;
        while (predmets[i] != null) {
            i++;
        }
        predmets[i] = predmet;
        return new Student(this.name, this.address, predmets);
    }

    public Student delLastPredmet() {
        for (int i = 0; i < predmets.length; i++) {
            if (predmets[i] == null) {
                predmets[i - 1] = null;
            }
        }
        return new Student(this.name, this.address, predmets);
    }

    public String showInfoAboutPredmets() {
        int i = 0;
        String res = "";
        while (predmets[i] != null) {
            i++;
            res = predmets[i].ToString();
        }
        return res;
    }

    public double seredniyBalZaPredmety() {
        int i = 0;
        int bal = 0;
        while (predmets[i] != null) {
            i++;
            bal += predmets[i].getStudentMark();
        }
        return bal / i;
    }


    public String getName() {
        return name;
    }

    public Address getAddress() {

        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Predmet[] getPredmets() {
        return predmets;
    }

    public void setPredmets(Predmet[] predmets) {
        this.predmets = predmets;
    }
}
