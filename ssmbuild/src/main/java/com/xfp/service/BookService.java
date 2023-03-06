package com.xfp.service;

import com.xfp.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    int addBook(Books books);
    int deleteBook(int id);
    int updateBook(Books books);
    Books queryOneBook(int id);
    List<Books> queryAllBooks();
}
