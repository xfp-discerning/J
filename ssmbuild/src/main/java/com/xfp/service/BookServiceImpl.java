package com.xfp.service;

import com.xfp.dao.BookMapper;
import com.xfp.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{

    //service调用dao层,
    //这里就是代理模式，往上面走就是spring里面的AOP
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryOneBook(int id) {
        return bookMapper.queryOneBook(id);
    }

    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    @Override
    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
