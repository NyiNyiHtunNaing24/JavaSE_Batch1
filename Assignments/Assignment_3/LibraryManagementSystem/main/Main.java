package Assignment_3.LibraryManagementSystem.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Assignment_3.LibraryManagementSystem.model.Books;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Books[] booksArr = new Books[1000];

    public static void registerBooks() throws IOException {

        Books book;
        String title;
        String subTitle;
        Boolean validFlag;
        System.out.println("Enter details for a new book.");

        do {
            validFlag = true;
            System.out.print("Title : ");
            title = br.readLine();
            if (title.isEmpty()) {
                System.out.println("Title cannot be empty.Please enter the book title!");
                validFlag = false;
            }
        } while (!validFlag);

        System.out.print("Subtitle (or press Enter to skip) : ");
        subTitle = br.readLine();

        if (subTitle.isEmpty()) {
            subTitle = "";
            book = new Books(title);
        } else {
            book = new Books(title, subTitle);
        }

        booksArr[Books.getBooksCount() - 1] = book;
    }

    public static void displayBooks() {
        System.out.println("Library inventory : \n");
        for (int i = 0; i < Books.getBooksCount(); i++) {
            System.out.println("Book " + (i + 1) + " : ");
            booksArr[i].display();
            System.out.println();
        }
        System.out.println("Total numbers of books created : " + Books.getBooksCount());
    }

    public static void main(String[] args) throws IOException {
        String flag;
        do {
            registerBooks();
            System.out.print("\nDo you want to enter another book? (yes/no) : ");
            flag = br.readLine();
        } while (flag.equalsIgnoreCase("yes"));
        displayBooks();
    }
}
