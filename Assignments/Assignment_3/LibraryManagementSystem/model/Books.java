package Assignment_3.LibraryManagementSystem.model;

public class Books {
    private String title;
    private String subTitle = "";
    private static int booksCount;

    public static int getBooksCount() {
        return booksCount;
    }

    public void display() {
        System.out.println("Title : " + this.title);
        if (!(this.subTitle.isEmpty())) {
            System.out.println("Subtitle : " + this.subTitle);
        }
    }

    public Books(String title) {
        this.title = title;
        booksCount++;
    }

    public Books(String title, String subTitle) {
        this.title = title;
        this.subTitle = subTitle;
        booksCount++;
    }
}
