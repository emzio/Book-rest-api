package pl.coderslab.entity;

import java.util.List;

public interface BookService {

    public List<Book> getAll();

    public void add(Book book);

    public void remove(Long id);

    public Book getById(Long id);

    public void update(Book book);

}
