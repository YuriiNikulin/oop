package week1.number;

/**
 * Created by yurii on 19.09.2016.
 */
public class NumberTest {

    public static void main(String[] args) {
        Number number1 = new Number(10);
        Number number2 = new Number(20.5);

        Number res = number1.sum(number2);
        System.out.println(res.getValue());

        System.out.println(number1.getFactorial().getValue()+" = factorial of " + number1.getValue());
    }

}
