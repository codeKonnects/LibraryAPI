package com.codeKonnects.libraryapi.repositories;

import com.codeKonnects.libraryapi.models.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
