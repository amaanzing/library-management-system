package com.lms;

import java.util.List;

public class LendingProcess {

    private List<Book> availableBookList;
    private List<Book> borrowedBookList;

    public LendingProcess(List<Book> availableBookList, List<Book> borrowedBookList) {
        this.availableBookList = availableBookList;
        this.borrowedBookList = borrowedBookList;
    }

    void checkout(Book book){
        if(availableBookList.contains(book)){
            availableBookList.remove(book);
            borrowedBookList.add(book);
        }else{
            System.out.println("Book not available");
        }
    }

    void returnBook (Book book){
        if(borrowedBookList.contains(book)){
            borrowedBookList.remove(book);
            availableBookList.add(book);
        }
    }
}
