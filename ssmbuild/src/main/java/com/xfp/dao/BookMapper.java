package com.xfp.dao;

import com.xfp.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    int addBook(Books books);
    int deleteBook(@Param("bookID") int id);
    int updateBook(Books books);
    Books queryOneBook(@Param("bookID")int id);
    List<Books> queryAllBooks();
    Books queryBookByName(@Param("bookName") String bookName);

}
