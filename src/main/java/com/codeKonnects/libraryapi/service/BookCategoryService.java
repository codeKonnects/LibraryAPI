package com.codeKonnects.libraryapi.service;

import com.codeKonnects.libraryapi.payload.response.ApiResponse;
import com.codeKonnects.libraryapi.payload.response.BookCategoryResponse;
import com.codeKonnects.libraryapi.models.BookCategory;

import java.util.List;

public interface BookCategoryService {
    List<BookCategoryResponse> getAllCategories();
    BookCategoryResponse getCategory(Long id);
    BookCategoryResponse addCategory(BookCategory category);
    BookCategoryResponse updateCategory(Long id, BookCategory newCategory);
    ApiResponse deleteCategory(Long id);
}
