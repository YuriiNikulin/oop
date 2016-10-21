package week2.myLibrary;

/**
 * Created by yurii on 24.09.2016.
 */
public class Book {
    private String name;
    private String autorName;
    private int printYear;
    private int numberOfBook=0;


    public Book(String name, String autorName, int printYear) {
        this.name = name;
        this.autorName = autorName;
        this.printYear = printYear;
        numberOfBook++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autorName='" + autorName + '\'' +
                ", printYear=" + printYear +
                '}';
    }





    public int getNumberOfBook() {
        return numberOfBook;
    }

    public String getName() {
        return name;
    }

    public String getAutorName() {
        return autorName;
    }

    public int getPrintYear() {
        return printYear;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }
}
