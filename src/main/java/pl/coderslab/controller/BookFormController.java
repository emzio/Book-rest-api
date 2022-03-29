package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.service.BookService;

@Transactional
@Controller
public class BookFormController {
    private final BookService bookService;

    public BookFormController(BookService bookService) {
        this.bookService = bookService;
    }
}
