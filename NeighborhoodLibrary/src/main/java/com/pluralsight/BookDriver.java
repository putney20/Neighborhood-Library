package com.pluralsight;

import java.util.Scanner;

public class BookDriver {
    public static void main(String[] args) {
        Book[] books = new Book[20];
        Scanner scanner = new Scanner(System.in);
        //Create an array of 20 books
        books[0] = new Book(1, "1273849576849", "Family Guy", false, "");
        books[1] = new Book(2, "1273849576849", "The Office", false, "");
        books[2] = new Book(3, "1273849576849", "Love and War", true, "");
        books[3] = new Book(4, "1273849576849", "South Park", false, "");
        books[4] = new Book(5, "1273849576849", "American Dad", false, "");
        books[5] = new Book(6, "1273849576849", "One Piece", false, "");
        books[6] = new Book(7, "1273849576849", "Demon Slayer", true, "");
        books[7] = new Book(8, "1273849576849", "Fantastic Mr. Fox", true, "");
        books[8] = new Book(9, "1273849576849", "Looney Toons", false, "");
        books[9] = new Book(10, "1273849576849", "Cat In The Hat", false, "");
        books[10] = new Book(11, "1273849576849", "The Lorax", false, "");
        books[11] = new Book(12, "1273849576849", "Naruto", false, "");
        books[12] = new Book(13, "1273849576849", "Dragon Ball Z", false, "");
        books[13] = new Book(14, "1273849576849", "Python Programming", false, "");
        books[14] = new Book(15, "1273849576849", "Learn SQL", false, "");
        books[15] = new Book(16, "1273849576849", "Java Programming", true, "");
        books[16] = new Book(17, "1273849576849", "Learn MongoDB", false, "");
        books[17] = new Book(18, "1273849576849", "JavaScript Programming", false, "");
        books[18] = new Book(19, "1273849576849", "C++ Programming Basics", false, "");
        books[19] = new Book(20, "1273849576849", "Inception", true, "");

        //Home Screen displays options for user input
        System.out.println("Which option would you like to choose (enter 1, 2, or 3)?");
        System.out.println(" 1 - Show Available Books");
        System.out.println(" 2 - Show Checked Out Books");
        System.out.println(" 3 - Exit Application");
        System.out.println("Please enter a number: ");
        int input = scanner.nextInt();
            switch (input) {
                case 1:
                    listAvailableBooks(books);
                    break;
                case 2:
                    listCheckedOutBooks(books);
                    break;
                case 3:
                    return;
            }
    }

    private static void listAvailableBooks(Book[] books) {
        for (Book book: books) {
            if (!book.isCheckedOut()) {
                System.out.println("Id: " + book.getId() + " ISBN: " + book.getIsbn() + " Title: " + book.getTitle());
                            }
        }
    }

    private static void listCheckedOutBooks(Book[] books) {
        for (Book book: books) {
            if (book.isCheckedOut()) {
                System.out.println("Id: " + book.getId() + " ISBN: " + book.getIsbn() + " Title: " + book.getTitle());
            }
        }
    }

    private static void checkInBooks(Book[] books) {
        Scanner scanner = new Scanner(System.in);
        for (Book book: books) {
            System.out.println("What is the id of the book you are checking in?");
            int bookID = scanner.nextInt();
            if (book.getId() == bookID){
                System.out.println("You have checked in your book.");
            }
        }
    }



}
