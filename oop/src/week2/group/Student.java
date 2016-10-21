package week2.group;

/**
 * Created by yurii on 21.09.2016.
 */
public class Student {
    private static double monthMoney = 790;
    private static int idCounter = 0;
    private String idNum;
    private String name;
    private int rank;

    private MyDate birthday;
    private Address address;
    private Contact contact;

    public Student(String name, int rank) {
        this.idNum = String.valueOf(idCounter);
        idCounter++;
        this.rank = rank;
        this.name = name;
    }

    public Student(String name, MyDate birthday, Address address, Contact contact) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.contact = contact;
    }

    public String studentToString(){
        return String.format("%s %s %s",name,birthday.getYear(),address.getCity());
    }



    public static double getMonthMoney() {
        return monthMoney;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
