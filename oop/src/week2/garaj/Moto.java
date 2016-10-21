package week2.garaj;

/**
 * Created by yurii on 23.09.2016.
 */
public class Moto {
    private String name;
    private double prise;
    private int stan;

    public Moto(String name, double prise, int stan) {
        this.name = name;
        this.prise = prise;
        this.stan = stan;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                ", stan=" + stan +
                '}';
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public String getName() {

        return name;
    }

    public double getPrise() {
        return prise;
    }

    public int getStan() {

        return stan;
    }

    public void setStan(int stan) {
        this.stan = stan;
    }
}
