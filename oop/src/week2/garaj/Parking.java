package week2.garaj;

import week2.group.Address;

/**
 * Created by yurii on 23.09.2016.
 */
public class Parking {
    private boolean open_close = true;
    private int allPlace;
    private String name;
    private Moto[] masMoto;
    private int freePlace = 0;
    private Address adressa = new Address("ua", "kiev", "peremogu", 30);


    public Parking(boolean open_close, int allPlace) {
        this.open_close = open_close;
        this.allPlace = allPlace;
        masMoto = new Moto[allPlace];
    }

    public Moto addMotoOnLastFrePlase(Moto moto) {
        if (open_close == true && freePlace <= allPlace) {
            masMoto[freePlace] = moto;
            freePlace++;
            return moto;
        }
        return null;
    }

    public Moto takeLastMoto(Moto moto) {
        if (open_close == true && freePlace != 0) {
            freePlace--;
            this.masMoto[freePlace] = null;
            return moto;
        }
        return null;
    }

    public Moto addMotoByPlaceNumber(Moto moto, int placeNumber) {
        placeNumber -= 1;
        if (open_close == true && masMoto[placeNumber] == null && placeNumber <= allPlace) {
            masMoto[placeNumber] = moto;
            freePlace++;
        }
        return moto;
    }

    public Moto takeMotoByPlaceNumber(int placeNumber) {
        placeNumber -= 1;
        if (open_close == true && masMoto[placeNumber] != null && placeNumber <= allPlace) {
            masMoto[placeNumber] = null;
            freePlace--;
        }
        return masMoto[placeNumber];
    }

    public boolean clearGaragePlaces() {
        boolean res = true;
        if (open_close == true && freePlace != 0) {
            for (int i = 0; i < allPlace; i++) {
                masMoto[i] = null;
                res = true;
            }
        } else res = false;
        return res;
    }

    public boolean open() {
        return open_close = true;
    }

    public boolean close() {
        return open_close = false;
    }

    public Address changeAddress(Address newAdresa) {
        return this.adressa = newAdresa;
    }

    public String showAllInGarage() {
        String res = "";
        for (int i = 0; i < allPlace; i++) {
            if (masMoto[i] == null) {
                res += (i + 1) + " place null\n";
            } else {
                res += (i + 1) + " place " + masMoto[i].toString() + "\n";
            }

        }

        return res;
    }


    public int getAllPlace() {
        return allPlace;
    }

    public boolean isOpen_close() {

        return open_close;
    }

    public void setOpen_close(boolean open_close) {
        this.open_close = open_close;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Moto[] getMasMoto() {
        return masMoto;
    }

    public void setMasMoto(Moto[] masMoto) {
        this.masMoto = masMoto;
    }
}
