package week1.number;

/**
 * Created by yurii on 19.09.2016.
 */
public class Number {

    private double value;

    public Number(double value) {
        this.value = value;
    }

    public Number sum(Number dodanok) {

        return new Number(this.value + dodanok.getValue());

    }

    public Number vidnyatu(Number vidyemnik) {

        return new Number(this.value - vidyemnik.getValue());

    }

    public Number mnojytu(Number mnojnuk) {

        return new Number(this.value * mnojnuk.getValue());

    }

    public Number podilutu(Number dilnuk) {

        return new Number(this.value / dilnuk.getValue());

    }

    public Number stepin(int stepin) {
//        double result = this.value;
//        for (int i = 0; i < stepin; i++) {
//            result*=this.value;
//        }
//        return new Number(result);
        return new Number(Math.pow(this.value, stepin));
    }

    public Number getFactorial() {
        return new Number(countFactorial(1, 1));
    }

    private double countFactorial(int current, double result) {
        if (this.getValue() < 1) return 0;
        if (current <= this.getValue()) {
            result *= current;
            current++;
            result = countFactorial(current, result);
        }
        return result;
    }

    //    equal =>0
    //> =>1
    //< =>-1
    public int compareTo(Number comparable) {
        if (this.value < comparable.getValue()) {
            return -1;
        } else if (this.value > comparable.getValue()) {
            return 1;
        } else {
            return 0;
        }
    }

    public double getValue() {
        return value;
    }
}
