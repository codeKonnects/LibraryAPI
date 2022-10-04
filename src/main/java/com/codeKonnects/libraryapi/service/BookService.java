package com.codeKonnects.libraryapi.service;

import com.codeKonnects.libraryapi.payload.request.BookRequest;
import com.codeKonnects.libraryapi.payload.response.ApiResponse;
import com.codeKonnects.libraryapi.payload.response.BookResponse;

import java.util.List;

public interface BookService {

    List<BookResponse> getAllBooks();
    List<BookResponse> getBooksByCategory(Long categoryId);
    BookResponse getBook(Long id);
    BookResponse addBook(BookRequest bookRequest);
    BookResponse updateBook(Long id, BookRequest newGameRequest);
    ApiResponse deleteBook(Long id);
}
