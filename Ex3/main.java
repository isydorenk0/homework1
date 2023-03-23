package Ex3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title: ");
        String title = scanner.nextLine();
        System.out.println("Enter author: ");
        String author = scanner.nextLine();
        System.out.println("Enter content: ");
        String content = scanner.nextLine();
        Book book = new Book(new Title(title), new Author(author), new Content(content));
        book.getTitle().show();
        book.getAuthor().show();
        book.getContent().show();
    }
}
