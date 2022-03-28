package pl.coderslab.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Book;
import pl.coderslab.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    private static final Logger logger
        = LoggerFactory.getLogger(SampleLoggerController.class);

//    BookService service = new SecondMockBookService();

    @RequestMapping("/helloBook")
    public Book helloBook(){
        Book book = new Book("9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
        book.setId(1L);
        return book;
    }

    @GetMapping("")
    @ResponseBody
    public List<Book> get(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Book findById(@PathVariable Long id){
        logger.info("<<<<<<<<<<<<<<<<< id : " + id + " " + service.getById(id));
        return service.getById(id);
    }

    @PostMapping()
    public void addBook(@RequestBody Book book){
        service.add(book);
    }
    @PutMapping()
    public void updateBook(@RequestBody Book book){
        service.update(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.remove(id);
    }
}

