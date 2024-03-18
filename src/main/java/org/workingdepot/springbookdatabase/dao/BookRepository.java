package org.workingdepot.springbookdatabase.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.workingdepot.springbookdatabase.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
