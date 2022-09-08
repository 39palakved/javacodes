package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class javalibrary {
    public String[] available_books = new String[20];
    int j = 7;
    int n;

    javalibrary() {

        available_books[0] = "One night call centre";
        available_books[1] = " 1. Infinity";
        available_books[2] = " 2. Beloved ";
        available_books[3] = "3. Ulysses";
        available_books[4] = "4. Middle march";
        available_books[5] = "5. Invisible man";
        available_books[6] = "6. catch-22";
    }

    void show_available_books() {
        System.out.println("Here is the list of available books");
        for (int i = 0; i <= n; i++) {
            System.out.println(available_books[i]);
        }

    }

    void add_book(String book_name) {
        n++;
        available_books[n] = book_name;

        System.out.println("Thank you for your contribution Your book" + book_name + "added to the library");

    }

    void issue_book() {
        int flag = 0;
        System.out.println("enter the name of book you want to issue");
        Scanner sc = new Scanner(System.in);
        String issued_book = sc.nextLine();
        for (int k = 0; k < j; k++) {
            if (issued_book == available_books[k]) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("you book" + issued_book + "is issued from library");
            n--;
            System.out.println("Now available books in library are");
            show_available_books();
        } else {
            System.out.println(" Sorry!the book you want to issue is not available in library");
        }


    }

    void return_book() {
        System.out.println("enter the name of book you are returning");
        Scanner rn = new Scanner(System.in);
        String return_book = rn.nextLine();
        n++;
        available_books[n] = return_book;
        System.out.println("your book is returned successfully");
    }


    public static void main(String[] args) {
        javalibrary l1 = new javalibrary();
        l1.show_available_books();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-d");
        l1.add_book("my_story");
        System.out.println("after adding new book ..available books in library");
        l1.show_available_books();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-d");
        l1.issue_book();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-d");
        l1.return_book();
        System.out.println("after  returning  book ..available books in library");
        l1.show_available_books();

    }
}





