package com.lms;

import java.util.List;
import java.util.Map;

public class Inventory {
    private Map<String, Book> books;

    private List<Book> bookList;
    private List<Book> availableBookList;
    private List<Book> borrowedBookList;
    private LendingProcess lendingProcess;


    public Inventory( List<Book> bookList) {
        this.bookList = bookList;
        this.availableBookList = bookList;
        this.lendingProcess = new LendingProcess(availableBookList, borrowedBookList);
    }


    //search by title or Author or Isbn
    String searchByTitleOrAuthorOrIsbn(String query){
        for(Book book : bookList){
            if(book.getTitle().equals(query) || book.getAuthor().equals(query) || book.getIsbn().equals(query) ){
                System.out.println("Result:" + book.getTitle() + " " + book.getAuthor() + " " + book.getIsbn() + " " + book.getPublicationYear());
            }
        }
        return "Book not found";
    }


    public void checkout(Book book) {
        lendingProcess.checkout(book);
    }

    public void addNewBook(Book book){
        availableBookList.add(book);
    }

    public void removeBook(Book book){
        availableBookList.remove(book);
    }

}
