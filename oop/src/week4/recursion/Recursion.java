package week4.recursion;

/**
 * Created by yurii on 09.10.2016.
 */
public class Recursion {

    public static void main(String[] args) {
        Recursion f = new Recursion();
        System.out.println(f.powerN(2, 3));
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {

            return n * factorial(n - 1);
        }
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies == 1) {
            return 2;
        } else {
            return 2 + bunnyEars(bunnies - 1);
        }
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 != 0) {
            return 2 + bunnyEars2(bunnies - 1);
        } else {
            return 3 + bunnyEars2(bunnies - 1);
        }
    }

    public int triangle(int rows) {
        if (rows == 0) {
            return 0;
        }
        return rows + triangle(rows - 1);
    }

    public int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 10) {
            return n;
        }

        return sumDigits(n / 10) + n % 10;
    }

    public int count7(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 10 && n != 7) {
            return 0;
        }
        if (n < 10 && n == 7) {
            return 1;
        }
        if (n % 10 == 7) {
            return 1 + count7(n / 10);
        }
        return count7(n / 10);
    }

    public int count8(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 10 == 8 && (n / 10) % 10 == 8) {
            return 2 + count8(n / 10);
        } else if (n % 10 == 8) {
            return 1 + count8(n / 10);
        }
        return count8(n / 10);

    }

    public int powerN(int base, int n) {
        if (n == 0) {
            return 1;
        }
        return base * powerN(base, n - 1);
    }
}
