package com.library.backend.Controller;

import com.library.backend.Entity.bookEntity;
import com.library.backend.Service.bookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "book")
@AllArgsConstructor
public class bookController {

    private final bookService bookService;

    //Create New Book
    @PostMapping
    public void registerNewBook(@RequestBody bookEntity book){
        bookService.addNewBook(book);
    }

    //Delete Book
    @DeleteMapping(path = "/delete/{bookId}")
    public void deleteBook(@PathVariable("bookId") Integer bookId){
        bookService.deleteBook(bookId);
    }

    //Update Book
    @PutMapping(path = "/update/{bookId}")
    public void updateBook(@PathVariable("bookId") Integer bookId,
                           @RequestParam(required = false) String name,
                           @RequestParam(required = false) String price){
        bookService.updateBook(bookId, name, price);
    }
}
