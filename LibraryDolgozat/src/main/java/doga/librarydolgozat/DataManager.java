package doga.librarydolgozat;

import java.util.ArrayList;

public class DataManager extends LibraryApplication {

    public void addBook(Book b){
        books.add(b);
    }

    public ArrayList<Book> getStock(){
        return books;
    }
}