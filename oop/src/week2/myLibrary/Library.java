package week2.myLibrary;

import week2.group.Address;

/**
 * Created by yurii on 24.09.2016.
 */
public class Library {
    private Address address;
    private String name;
    private int maxReaders = 50;
    private int maxBooks = 150;
    private Reader[] readers = new Reader[maxReaders];
    private Book[] books = new Book[maxBooks];
    private int freePlaceBook = 0;
    private int freePlaceReader = 0;

    public Library(Address address, String name) {
        this.address = address;
        this.name = name;
    }


    public String readersList() {
        String res = "";
        if (freePlaceReader != 0) {
            for (int i = 0; i < freePlaceReader; i++) {
                res += readers[i].toString() + "\n";
            }
        }
        return res;
    }

    public void addBook(Book book) {
        if (freePlaceBook <= maxBooks) {
            books[freePlaceBook] = book;
            freePlaceBook++;
        } else System.out.println("error");
    }

    public void dellBook(Book book) {
        for (int i = 0; i < maxBooks; i++) {
            if (books[i].equals(book)) {
                books[i] = null;
                freePlaceBook--;
            } else System.out.println("error");
        }
    }

    public String allBooksInLibrary() {
        String res = "";
        for (int i = 0; i < maxBooks; i++) {
            if (books[i] != null) {
                res += books[i].toString() + "\n";
            }
        }
        return res;
    }

    public void addReader(Reader reader) {
        if (freePlaceReader <= maxReaders) {
            readers[freePlaceReader] = reader;
            freePlaceReader++;
        } else System.out.println("error");
    }

    public Reader takeBook(Book book, Reader reader) {
        for (int i = 0; i < maxBooks; i++) {
            for (int j = 0; j < maxReaders; j++) {
                if (books[i] != null && readers[j] != null && books[i].equals(book) && readers[j].equals(reader) && reader.getBlackList() == false) {
                    reader.takeBook(book);
                    return reader;
                }
            }
        }
        return null;
    }

    public String booksInSomeReader(Reader reader) {
        String res = "";
        for (int i = 0; i < maxReaders; i++) {
            if (readers[i] != null && readers[i].equals(reader)) {
                for (int j = 0; j <= reader.getSizeBooksInReader(); j++) {
                    if (readers[i].getReaderBooks()[j] != null) {
                        res = readers[i].getReaderBooks()[j].toString() + "\n";
                    }
                }
            }
        }
        return res;
    }

    public String booksInAllReaders() {
        String res = "";
        for (int i = 0; i < maxReaders; i++) {
            if (readers[i] != null) {
                for (int j = 0; j < (readers[i].getReaderBooks().length); j++) {
                    if (readers[i].getReaderBooks()[j] != null) {
                        res += readers[i].getReaderBooks()[j].toString() + "\n";
                    }
                }
            }
        }
        return res;
    }

    public Reader addReaderToBlacklist(Reader reader) {
        for (int i = 0; i < maxReaders; i++) {
            if (readers[i].equals(reader)) {
                reader.setBlackList(true);
                freePlaceReader--;
                return reader;
            }
        }
        return null;
    }

    public String booksSomeAuthor(String author) {
        String res = "";
        for (int i = 0; i < maxBooks; i++) {
            if (books[i]!=null&&books[i].getAutorName().equals(author)) {
                res += books[i].toString() + "\n";
            }
        }
        return res;
    }

    public String newBooks() {
        String res = "";
        for (int i = 0; i < maxBooks; i++) {
            if (books[i]!=null && books[i].getPrintYear() >= 2013) {
                res += books[i].toString() + "\n";
            }
        }
        return res;
    }


    public int getMaxReaders() {
        return maxReaders;
    }

    public int getMaxBooks() {
        return maxBooks;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Reader[] getReaders() {
        return readers;
    }

    public void setReaders(Reader[] readers) {
        this.readers = readers;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
