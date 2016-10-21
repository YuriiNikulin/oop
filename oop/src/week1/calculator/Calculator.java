package week1.calculator;

import week1.number.Number;

import java.util.Scanner;

/**
 * Created by yurii on 20.09.2016.
 */
public class Calculator {

    private Scanner sc = new Scanner(System.in);
    private Scanner scan = new Scanner(System.in);


    public void doCalcJob() {
        System.out.print("a = ");
        Number num1 = new Number(sc.nextDouble());
        System.out.print("b = ");
        Number num2 = new Number(sc.nextDouble());
        System.out.print("diya ");
        switch (scan.nextLine()) {
            case "+":
                System.out.println(num1.sum(num2).getValue());
                break;
            case "-":
                System.out.println(num1.vidnyatu(num2).getValue());
                break;
            case "*":
                System.out.println(num1.mnojytu(num2).getValue());
                break;
            case "/":
                System.out.println(num1.podilutu(num2).getValue());
                break;
        }
    }
}
