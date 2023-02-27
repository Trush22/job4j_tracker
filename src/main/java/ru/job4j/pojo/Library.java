package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("First", 100);
        Book book2 = new Book("Second", 222);
        Book book3 = new Book("Third", 333);
        Book book4 = new Book("Clean code", 444);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " book has " + bk.getPages() + " pages.");
        }
        Book temp = books[3];
        books[3] = books[0];
        books[0] = temp;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " book has " + bk.getPages() + " pages.");
        }
        System.out.println("Shown only Clean code book");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName() + " book has " + bk.getPages() + " pages.");
            }
        }
    }
}
