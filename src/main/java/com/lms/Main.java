package com.lms;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();
        Book physicsBook = new Book.BookBuilder("Physics")
                .setIsbn("12334-123")
                .setAuthor("HC VERMA")
                .setPublicationYear(2002)
                .build();

        Book chemistryBook = new Book.BookBuilder("Chemistry")
                .setIsbn("12434-145")
                .setAuthor("NCERT")
                .setPublicationYear(2005)
                .build();
        Book mathsBook = new Book.BookBuilder("Mathematics")
                .setIsbn("13334-145")
                .setAuthor("NCERT")
                .setPublicationYear(2010)
                .build();

        bookList.add(physicsBook);
        bookList.add(chemistryBook);
        bookList.add(mathsBook);


        Library collegeLibrary = new Library(bookList);

        Book historyBook = new Book.BookBuilder("Modern History")
                .setIsbn("25534-235")
                .setAuthor("NCERT")
                .setPublicationYear(1999)
                .build();

        collegeLibrary.addNewBook(historyBook);


    }
}