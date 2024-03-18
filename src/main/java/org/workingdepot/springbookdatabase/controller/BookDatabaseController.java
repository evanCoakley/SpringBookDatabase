package org.workingdepot.springbookdatabase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.workingdepot.springbookdatabase.entity.Book;
import org.workingdepot.springbookdatabase.service.BookService;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookDatabaseController {

    private BookService theBookService;

    public BookDatabaseController(BookService theBookService) {
        this.theBookService = theBookService;
    }

    @GetMapping("/list")
    public String bookCollection(Model theModel){
        List<Book> theBooks = theBookService.findAll();
        theModel.addAttribute("books", theBooks);
        return "books/book-archive";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){
        Book theBook = new Book();
        theModel.addAttribute("book", theBook);
        return "books/book-form";
    }

    @PostMapping("/save")
    public String saveBook(@ModelAttribute("book") Book theBook){
        theBookService.save(theBook);
        return "redirect:/books/list";
    }

    @GetMapping("/showFormForUpdate")
    public String editBookInfo(@RequestParam("bookId") int theId, Model theModel){
        Book theBook = theBookService.findById(theId);
        theModel.addAttribute("book", theBook);
        return "/books/book-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("bookId") int theId){
        theBookService.deleteById(theId);
        return "redirect:/books/list";
    }
}
