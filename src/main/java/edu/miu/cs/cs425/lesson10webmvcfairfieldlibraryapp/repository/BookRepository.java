package edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.repository;


import edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
