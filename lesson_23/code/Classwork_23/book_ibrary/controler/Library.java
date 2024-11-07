package Classwork_23.book_ibrary.controler;

import Classwork_23.book_ibrary.model.Book;

public class Library {

    public Object addBook;
    // fields
    private Book[] book;
    private int size; // текущее кол-во книг


    // constructor
    public Library(int capacity) {
        this.book = new Book[capacity];
        this.size = 0;
    }

    // CRUD methods

    // boolean addBook(Book book)
    // size++

    // void printBooks()


    public Book findBook(long isbn){

        Book foundBook = null;

        return foundBook;
    }



    // Book removeBook(long isbn)
    // size--

    // boolean updateBook()


    public int size(){
        return size;
    }


}
