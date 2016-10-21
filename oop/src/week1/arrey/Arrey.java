package week1.arrey;

import java.util.Random;

/**
 * Created by yurii on 20.09.2016.
 */
public class Arrey {

    private int[] mas;

    public Arrey(int[] arrey) {
        this.mas = arrey;
    }

    public double minElement() {
        double min = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        return min;
    }

    public double maxElement() {
        double max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        return max;
    }

    public Arrey randomInIntervav(int a, int b) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = a + rand.nextInt(b - a);
        }
        return new Arrey(mas);
    }

    public void print() {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    public Arrey Size(int size) {
        int[] newMas = new int[size];

        for (int i = 0; i < size; i++) {
            if (i < mas.length) {
                newMas[i] = mas[i];
            } else {
                newMas[i] = 0;
            }
        }
        return new Arrey(newMas);
    }

    public Arrey sort() {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length - 1; j++) {
                if (mas[j] < mas[1 + j]) {
                    int s = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = s;
                }
            }
        }
        return new Arrey(mas);
    }


    public int[] getMas() {
        return mas;
    }
}
