//package pl.coderslab.controller;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.bind.annotation.*;
//import pl.coderslab.entity.Book;
//import pl.coderslab.entity.MockBookService;
//import java.util.List;
//
//@RestController
//@RequestMapping("/books")
//public class BookController {
//    MockBookService mockBookService = new MockBookService();
//
//    private static final Logger logger
//            = LoggerFactory.getLogger(SampleLoggerController.class);
//
//    @RequestMapping("/helloBook")
//    public Book helloBook() {
//        Book book = new Book("9788324631766", "Thinking in Java",
//                "Bruce Eckel", "Helion", "programming");
//        book.setId(1L);
//        return book;
//
//        }
//    @GetMapping()
//            public List<Book> findAll(){
//        return mockBookService.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Book findById(@PathVariable Long id){
//        logger.info("test?????????>>>>>>>>>>>>>> id: " + id);
//        return mockBookService.findById(id);
//    }
//
//
//    @PostMapping()
//    public void addBook(@RequestBody Book book){
//        mockBookService.add(book);
//    }
//
//    @PutMapping()
//    public void updateBook(@RequestBody Book book){
//        mockBookService.update(book);
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Long id){
//        mockBookService.remove(id);
//    }
//}
