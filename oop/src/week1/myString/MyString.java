package week1.myString;

/**
 * Created by yurii on 20.09.2016.
 */
public class MyString {

    private char[] line;

    public MyString(char[] line) {
        this.line = line;
    }

    public void print() {
        for (int i = 0; i < line.length; i++) {
            System.out.print(line[i]);
        }
        System.out.println();
    }

    public MyString concatenation(MyString sekondLine) {
        char[] newLine = new char[sekondLine.getLine().length + this.line.length];
        for (int i = 0; i < this.line.length; i++) {
            newLine[i] = this.line[i];
        }
        for (int i = 0; i < sekondLine.getLine().length; i++) {
            newLine[i + this.line.length] = sekondLine.getLine()[i];
        }
        return new MyString(newLine);
    }

    public MyString toLower() {
        char[] newLine = new char[this.line.length];
        for (int i = 0; i < this.line.length; i++) {
            newLine[i] = Character.toLowerCase(this.line[i]);
        }
        return new MyString(newLine);
    }

    public MyString toUpper() {
        char[] newLine = new char[this.line.length];
        for (int i = 0; i < this.line.length; i++) {
            newLine[i] = Character.toUpperCase(this.line[i]);
        }
        return new MyString(newLine);
    }

    public boolean poshuk(MyString podstroka) {
        boolean res = true;
        if (this.line.length < podstroka.getLine().length || podstroka.getLine().length == 0) {
            return false;
        }
        for (int i = 0; i < this.line.length - podstroka.getLine().length; i++) {
            if (podstroka.getLine()[0] == this.line[i]) {
                for (int j = 0; j < podstroka.getLine().length; j++) {
                    if (podstroka.getLine()[j] == this.line[j + i]) {
                        res = true;
                    } else {
                        res = false;
                    }
                }
            }
        }
        return res;
    }

    public MyString delitProb() {
        char[] newLine = new char[this.line.length];
        int j = 0;
        for (int i = 0; i < this.line.length; i++) {
            if (this.line[i] != ' ') {
                j++;
                newLine[j] = this.line[i];
            }
        }
        return new MyString(newLine);
    }

    public boolean porivnyanna(MyString secondLine) {
        boolean res = true;
        if (this.line.length != secondLine.getLine().length) {
            return false;
        }
        for (int i = 0; i < this.line.length; i++) {
            if (secondLine.getLine()[i] == this.line[i]) {
                res = false;
            }
        }
        return res;
    }


    public char[] getLine() {
        return line;
    }
}
