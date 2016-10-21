package week2.garaj;

/**
 * Created by yurii on 24.09.2016.
 */
public class Test {
    public static void main(String[] args) {
        Moto m1 = new Moto("yava",20000,90);
        Moto m2 = new Moto("honda",200000,100);

        Biker b1 = new Biker("Kolya",30000);
        Biker b2 = new Biker("Misha", 1000000);

        Parking p1 = new Parking(true,5);

        b1.buyMoto(m1);
        b1.buyMoto(m2);

        b2.buyMoto(m1);
        b2.buyMoto(m2);

        System.out.println(b1.allMotoString());
        System.out.println(b2.allMotoString());

        b2.sellMoto(m2);

        System.out.println(b2.allMotoString());

        b2.fixMoto(m1,20);

        System.out.println(b1.allMotoString());

        p1.close();
        p1.open();

        p1.addMotoOnLastFrePlase(m1);
        p1.addMotoByPlaceNumber(m2,2);
        p1.addMotoByPlaceNumber(m2,4);
        //p1.takeMotoByPlaceNumber(4);
        //p1.clearGaragePlaces();

        System.out.println(p1.showAllInGarage());



    }
}
