package week3.circus;

import week2.group.Address;
import week3.circus.workers.Funambulist;

import java.util.ArrayList;

/**
 * Created by yurii on 28.09.2016.
 */
public class Cirkus {

    private String name;
    private Address address;
    private ArrayList<Artist> artists;
    private int artistNum = 0;

    public Cirkus(String name, Address address) {
        this.name = name;
        this.address = address;
        artists = new ArrayList<>();
    }

    public Artist addArtist(Artist worker){
        return artists.add(worker) ? worker: null;
    }

    public String allArtist(){
        return artists.toString();
    }

    public Artist dellArtist(){

        int maxDrink = 0;
        int maxDrinkNum = 0;
        for (int i = 1; i < artists.size(); i++) {
            if (artists.get(i).getDrink()>maxDrink){
                maxDrink = artists.get(i).getDrink();
                maxDrinkNum = i;
            }
        }
        return artists.remove(maxDrinkNum);
    }

    public void goAct(Artist artist){
        artist.goAct();
    }

    public String howManyGoAct(){
        String res = "";

        for (int i = 0; i < artists.size(); i++) {
            res += artists.get(i).toString() +
                    " "+ artists.get(i).getAct()+"\n";
        }
        return res;
    }

    public void getMoneyArtists(int money){
        for (int i = 0; i < artists.size(); i++) {
            if (artists.get(i) instanceof Funambulist){
                artists.get(i).setMoney((money * 1.5) + artists.get(i).getManey());
            }
            artists.get(i).setMoney(money + artists.get(i).getManey());
        }
    }

    public void newLokation(Address address){
        this.address = address;
    }



    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
