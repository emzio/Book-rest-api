package pl.coderslab.service;

import pl.coderslab.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> getAll();

    public void add(Book book);

    public void remove(Long id);

    public Book getById(Long id);

    public void update(Book book);

}
