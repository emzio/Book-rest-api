package pl.coderslab.entity;

import javax.persistence.*;

@Entity
public class Book implements Comparable<Book>{
    @Transient
    private static Long idIndex=0L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isbn;
    private String title;
    private String publisher;
    private String type;
    private String author;


    public Book() {
    }



    public Book(String isbn, String title, String publisher, String type, String author) {
        idIndex++;
        this.id=idIndex;
        this.isbn = isbn;
        this.title = title;
        this.publisher = publisher;
        this.type = type;
        this.author = author;
    }

//    public Book(Long id, String isbn, String title, String publisher, String type, String author) {
//        this.id = id;
//        this.isbn = isbn;
//        this.title = title;
//        this.publisher = publisher;
//        this.type = type;
//        this.author = author;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn=" + isbn +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                '}';
    }


    @Override
    public int compareTo(Book book) {
        return id>=book.id ? 1 : -1;
    }
}
