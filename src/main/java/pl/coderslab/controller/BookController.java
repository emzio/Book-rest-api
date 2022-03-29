package pl.coderslab.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
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
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Book findById(@PathVariable Long id){
        return service.findById(id).orElseThrow(() -> {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "BARDZO CIEKAWY WYJĄTEK>>>>>>>>>>>>>>>>>>> entity not found"
            );
        });
    }

    @PostMapping()
    public void addBook(@RequestBody Book book){
        service.save(book);
    }
    @PutMapping()
    public void updateBook(@RequestBody Book book){
        service.update(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.deleteById(id);
    }
}

