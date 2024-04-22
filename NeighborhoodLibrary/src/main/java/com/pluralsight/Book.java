package com.pluralsight;
/*
Create a book class with an id, isbn, isCheckedOut,and a checkOutTo variables for the constructor class.
This will whether a specific book is checked out or not, and if it is checked out it will show who currently has the book.
 */
public class Book {
    //id variable
    private int id;
    //isbn variable
    private String isbn;
    //title variable
    private String title;
    //isCheckedOut variable
    private boolean isCheckedOut;
    //checkedOutTo variable
    private String checkedOutTo;
    //create a book constructor class to hold the values of the book.


    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId: " + id +
                ", Isbn: " + isbn +
                "Title: " + title +
                "Checked Out: " + isCheckedOut +
                "Checked out to: " + checkedOutTo +
                "}";
    }


    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }


    public void checkOut(String name) {
        if (!isCheckedOut) {
            isCheckedOut = true;
            checkedOutTo = name;
            System.out.println("You have checked out");
        } else {
            System.out.println("This book has been checked out by " + name);
        }
    }

    public void checkIn() {
        if (isCheckedOut) {
            checkedOutTo = "";
            isCheckedOut = false;
            System.out.println("You have checked in your book.");
        } else {
            System.out.println("Your book is still checked out.");
        }
    }




    //create a checkIn method that shows a book is currently in stock
    //Create a home screen with a list of options the user can choose from
    //available books option
    //checkedOut books option
    //exit option (closes app)
}

