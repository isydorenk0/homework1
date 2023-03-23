package Ex3;

public class Book {
    private Title title;
    private Author author;
    private Content content;
    public Book(Title title, Author author, Content content){
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public Title getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Content getContent() {
        return content;
    }
}
