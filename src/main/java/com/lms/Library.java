package com.lms;

import java.util.List;

public class Library {

    private List<Patron> members;
    private Inventory inventory;

    public Library(List<Book> bookList) {
        this.inventory = new Inventory(bookList);
    }

    void addMember(Patron member){
        members.add(member);
    }

    void checkout(Book book){
        inventory.checkout(book);
    }

    public void addNewBook(Book book) {
        inventory.addNewBook(book);
    }
}
