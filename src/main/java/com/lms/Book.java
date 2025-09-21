package com.lms;

public class Book{

    private String title;
    private String author;
    public String isbn;
    private Integer publicationYear;

    private Book(BookBuilder builder){
        this.title = builder.title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public static class BookBuilder{
        private String title;

        private String author = "";
        private String isbn = "";
        private Integer publicationYear = 0;


        public BookBuilder(String title) {
            this.title = title;
        }

        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public BookBuilder setPublicationYear(Integer publicationYear) {
            this.publicationYear = publicationYear;
            return this;
        }

        public Book build(){
            return new Book(this);
        }



    }
}