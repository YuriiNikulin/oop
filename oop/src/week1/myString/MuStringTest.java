package week1.myString;

/**
 * Created by yurii on 21.09.2016.
 */
public class MuStringTest {
    public static void main(String[] args) {
        char[] mas = {'a','s',' ','h'};
        char[] mas1 = {'a','s',' '};
        MyString line = new MyString(mas);
        MyString lin = new MyString(mas1);

        line.delitProb().print();
        line.toUpper().print();
        line.toLower().print();
        line.concatenation(line).print();
        System.out.println(line.poshuk(lin));
        System.out.println(line.porivnyanna(lin));
    }
}
