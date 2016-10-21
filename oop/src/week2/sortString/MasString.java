package week2.sortString;

import java.util.ArrayList;

/**
 * Created by yurii on 24.09.2016.
 */
public class MasString {
    private ArrayList<String> masString;

    public MasString(ArrayList<String> masString) {
        this.masString = masString;
    }

    private void sortNeighboring(int pozition) {
        char[] first = masString.get(pozition).toCharArray();
        char[] second = masString.get(pozition + 1).toCharArray();

        int i = 0;
        int f = 0;

        if (masString.get(pozition).length() > masString.get(pozition + 1).length()) {
            f = masString.get(pozition + 1).length();
        } else {
            f = masString.get(pozition).length();
        }

        while (i < f - 1) {
            if ((int) first[i] > (int) second[i]) {
                String element = masString.get(pozition);
                masString.set(pozition, masString.get(pozition + 1));
                masString.set(pozition + 1, element);
                break;
            } else {
                i++;
            }
        }
    }

    public void sortList() {
        for (int i = 0; i < masString.size(); i++) {
            for (int j = 0; j < masString.size() - 1; j++) {
                sortNeighboring(j);
            }
        }
    }

    public void print() {
        for (int i = 0; i < masString.size(); i++) {
            System.out.print(masString.get(i) + " ");
        }
        System.out.println();
    }


    public void setMasString(ArrayList<String> masString) {
        this.masString = masString;
    }
}
