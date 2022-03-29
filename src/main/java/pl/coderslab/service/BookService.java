package pl.coderslab.service;

import pl.coderslab.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    public List<Book> findAll();

    public void save(Book book);

    public void deleteById(Long id);

    public Optional<Book> findById(Long id);

    public void update(Book book);

}
