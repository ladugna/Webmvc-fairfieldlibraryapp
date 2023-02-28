package edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp;

import edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.model.Book;
import edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.model.Publisher;
import edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Lesson10WebmvcFairfieldlibraryappApplication {
//    @Autowired
//    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(Lesson10WebmvcFairfieldlibraryappApplication.class, args);
        //create new book
        // Add Book
//        var poeaa = new Book(null, "978-0001", "Patterns of Enterprise App Architecture",
//                LocalDate.of(2021, 11, 12), 10, new Money(25.0, "USD"),
//                new Publisher(null, "Pearsons, Inc", null, null, null), null);

    }

//    private Book createNewBook(Book book){
//       return bookService.addNewBook(book);
//    }

}
