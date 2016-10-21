package week2.myLibrary;

import week2.group.Address;

/**
 * Created by yurii on 24.09.2016.
 */
public class Test {
    public static void main(String[] args) {
        Book b1 = new Book("jopa","bryus",2030);
        Book b2 = new Book("panda","bryus",2009);
        Book b3 = new Book("book","devid",2030);

        Reader r1 = new Reader("kolya",12);
        Reader r2 = new Reader("jenya",21);
        Reader r3 = new Reader("vitya",23);

        Library l1 = new Library(new Address("UA","Kiev","peremogy sqr",34),"big libraru");

        l1.addBook(b1);
        l1.addBook(b2);
        l1.addBook(b3);

        l1.addReader(r1);
        l1.addReader(r2);
        l1.addReader(r3);

        System.out.println(l1.allBooksInLibrary());
        System.out.println(l1.readersList());

        l1.takeBook(b1,r1);
        l1.takeBook(b2,r2);



        System.out.println("l1.booksInSomeReader(r2)    "+l1.booksInSomeReader(r2));

        l1.addReaderToBlacklist(r3);

        l1.takeBook(b3,r3);

        System.out.println();
        System.out.println("booksInAllReaders   "+l1.booksInAllReaders());

        System.out.println("books  bryus ");
        System.out.println(l1.booksSomeAuthor("bryus"));

        System.out.println("books  >2013 ");
        System.out.println(l1.newBooks());
    }
}
