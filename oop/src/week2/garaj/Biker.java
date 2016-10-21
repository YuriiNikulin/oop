package week2.garaj;

import week2.group.Address;

/**
 * Created by yurii on 23.09.2016.
 */
public class Biker {
    private String name;
    private double money;
    private Moto[] motos = new Moto[5];
    private int frePlace = 0;

    public Biker(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public Moto buyMoto(Moto moto) {
        if (this.money >= moto.getPrise()) {
            motos[frePlace] = moto;
            this.money -= moto.getPrise();
            frePlace++;
            return moto;
        }
        return null;
    }

    public Moto sellMoto(Moto moto) {
        for (int i = 0; i < frePlace; i++) {
            if (this.motos[i].equals(moto)) {
                motos[i] = null;
            }
            while (motos[i + 1] != null) {
                i++;
                motos[i] = motos[i + 1];
                this.money += moto.getPrise();
            }
            frePlace--;
        }
        return moto;
    }

    public Moto fixMoto(Moto moto, int fix) {
        for (int i = 0; i < frePlace; i++) {
            if (this.motos[i].equals(moto)) {
                this.motos[i].setStan(motos[i].getStan() + fix);
            }
            if (motos[i].getStan() >= 100) {
                motos[i].setStan(100);
            }
            motos[i].setPrise(fix / 10 * 2000 + motos[i].getPrise());
        }
        return moto;
    }

    public String allMotoString() {
        String res = "";
        for (int i = 0; i <frePlace; i++) {
            res+=motos[i].toString()+"\n";
        }
        return res;
    }


    public String getName() {
        return name;
    }

    public double getMoney() {

        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Moto[] getMotos() {
        return motos;
    }

    public void setMotos(Moto[] motos) {
        this.motos = motos;
    }
}
