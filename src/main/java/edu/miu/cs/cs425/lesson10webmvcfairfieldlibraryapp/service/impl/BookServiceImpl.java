package edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.service.impl;


import edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.model.Book;
import edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.model.Publisher;
import edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.repository.BookRepository;
import edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public Book addNewBook(Book newBook) {
        return bookRepository.save(newBook);
    }
    @Override
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
