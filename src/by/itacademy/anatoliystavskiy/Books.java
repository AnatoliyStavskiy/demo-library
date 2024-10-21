package by.itacademy.anatoliystavskiy;

import java.util.ArrayList;
import java.util.List;

public class Books {

    List<Book> bookslist = new ArrayList<>();

    public void addBook(Book book) {
        bookslist.add(book);
    }

    public void FindAuthor(String author) {
        System.out.println("Список книг " + author + ":");
        int value = 1;
        for (Book book : bookslist) {
            if (author.equalsIgnoreCase(book.getAuthor())) {
                System.out.println(value + ": " + book.getName());
                value++;
            }
        }
        System.out.println();
    }

    public void FindStartDate(int startDate) {
        System.out.println("Список книг после " + startDate + " года издания:");
        int value1 = 1;
        for (Book book : bookslist) {
            if (book.getYear() > startDate) {
                System.out.println(value1 + ": " + book.getName() + " " + book.getYear() + " год");
            } else continue;
            value1++;
        }
        System.out.println();
    }

    public void FindPublishing(String checkPublishing) {
        System.out.println("Книги " + " издательства " + checkPublishing + ":");
        int value2 = 1;
        for (Book book : bookslist) {
            if (checkPublishing.equalsIgnoreCase(book.getPublishingHouse())) {
                System.out.println(value2 + ": " + book.getName());
                value2++;
            }
        }
    }
}


