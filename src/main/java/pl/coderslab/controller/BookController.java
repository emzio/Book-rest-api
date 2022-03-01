package pl.coderslab.controller;

import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Book;
import pl.coderslab.entity.MockBookService;
import static pl.coderslab.controller.SampleLoggerController.*;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    MockBookService mockBookService = new MockBookService();

    @RequestMapping("/helloBook")
    public Book helloBook() {
        Book book = new Book("9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
        book.setId(1L);
        return new Book("9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");

        }
    @GetMapping()
            public List<Book> findAll(){
        return mockBookService.findAll();
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable Long id){
        return mockBookService.findById(id);
    }


    @PostMapping()
    public void addBook(@RequestBody Book book){
//    public void addBook(@RequestParam String isbn, @RequestParam String title, @RequestParam String publisher, @RequestParam String type,
//    @RequestParam String author){
//        {"isbn":"34321","title":"Thinking in Java", "publisher":"Helion","type":"programming", "author":"Bruce Eckel"}
//        Book book = new Book(isbn, title, publisher, type,author);

        mockBookService.add(book);
//        logger.info("test?????????>>>>>>>>>>>>>>");
    }

    @PutMapping()
    public void updateBook(@RequestBody Book book){
        mockBookService.update(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        mockBookService.remove(id);
    }
}
