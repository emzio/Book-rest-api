package pl.coderslab.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class SecondMockBookService implements BookService {
    private  List<Book> bookList;



    public SecondMockBookService() {
        bookList = new ArrayList<>();
        bookList.add(new Book("134", "Title", "Zysk", "childs", "JK Rowling"));
        bookList.add(new Book("334", "2Title", "2Zysk", "2childs", "23JK Rowling"));
        bookList.add(new Book("334", "3Title", "3Zysk", "3childs", "3JK Rowling"));
        bookList.add(new Book("434", "4Title", "4Zysk", "4childs", "4JK Rowling"));
        bookList.add(new Book("534", "5Title", "5Zysk", "5childs", "5JK Rowling"));
    }

    @Override
    public List<Book> getAll() {
        return bookList;
    }

    @Override
    public void add(Book book) {
        Book bookToAdd = new Book(book.getIsbn(), book.getTitle(), book.getPublisher(), book.getType(), book.getAuthor());
        bookList.add(bookToAdd);
    }

    @Override
    public void remove(Long id) {
        bookList = bookList.stream().filter(book -> book.getId() != id)
                .collect(Collectors.toList());
    }

    @Override
    public Book getById(Long id) {
//        Book result = bookList.stream().filter(book -> book.getId() == id)
//                .findAny().orElseGet(() -> null);

        Book result = bookList.stream().filter(book -> book.getId().equals(id)).findAny().orElseThrow(() -> {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "BARDZO CIEKAWE ŚĆŃŻŹ entity not found"
            );
        });
        return result;
    }

    @Override
    public void update(Book book) {
        Long id = book.getId();
        Book bookToAdd = getById(book.getId());

        this.remove(id);

        bookToAdd.setIsbn(book.getIsbn());
        bookToAdd.setTitle(book.getTitle());
        bookToAdd.setPublisher(book.getPublisher());
        bookToAdd.setType(book.getType());
        bookToAdd.setAuthor(book.getAuthor());
        bookToAdd.setId(id);
        bookList.add(bookToAdd);
        bookList = bookList.stream().sorted((Book book1, Book t1) -> {
            return book1.getId().compareTo(t1.getId());
        }).collect(Collectors.toList());
    }
}
