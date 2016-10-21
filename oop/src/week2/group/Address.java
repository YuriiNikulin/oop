package week2.group;

/**
 * Created by yurii on 21.09.2016.
 */
public class Address {

    private String country;
    private String city;
    private String street;
    private int houseNum;

    public Address(String country, String city, String street, int houseNum) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNum = houseNum;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNum=" + houseNum +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }
}
