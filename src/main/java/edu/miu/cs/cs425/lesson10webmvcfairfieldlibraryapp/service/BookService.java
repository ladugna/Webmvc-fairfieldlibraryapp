package edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.service;


import edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.model.Book;
import edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.model.Publisher;
import org.springframework.stereotype.Service;



public interface BookService {
    Book addNewBook(Book newBook);
    Iterable<Book> getAllBooks();

}
