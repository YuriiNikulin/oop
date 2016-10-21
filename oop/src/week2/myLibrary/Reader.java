package week2.myLibrary;

/**
 * Created by yurii on 24.09.2016.
 */
public class Reader {
    private String name;
    private int age;
    private Book[] readerBooks = new Book[3];
    private int numberOrReader = 0;
    private int sizeBooksInReader = 0;
    private boolean blackList = false;

    public Reader(String name, int age) {
        this.name = name;
        this.age = age;
        numberOrReader++;
    }


    public Book takeBook(Book book) {
        for (int i = 0; i < 3; i++) {
            if (readerBooks[i] == null) {
                readerBooks[i] = book;
                sizeBooksInReader++;
                return book;
            }
        }
        return null;
    }

    public String booksInReader() {
        String res = "";
        for (int i = 0; i < sizeBooksInReader; i++) {
            res += readerBooks[i].toString() + "\n";
        }
        return res;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                '}';
    }




    public boolean getBlackList() {
        return blackList;
    }

    public void setBlackList(boolean blackList) {
        this.blackList = blackList;
    }

    public int getSizeBooksInReader() {
        return sizeBooksInReader;
    }

    public String getName() {
        return name;
    }

    public int getNumberOrReader() {
        return numberOrReader;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Book[] getReaderBooks() {
        return readerBooks;
    }

    public void setReaderBooks(Book[] readerBooks) {
        this.readerBooks = readerBooks;
    }
}
