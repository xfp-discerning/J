package com.xfp.controller;

import com.xfp.pojo.Books;
import com.xfp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller层调用service层
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    //查询所有书籍，并返回一个书籍展示页面
    @RequestMapping("/allBook")
    public String queryAll(Model model){
        List<Books> list = bookService.queryAllBooks();
        model.addAttribute("list",list);
        return "allBook";
    }
    //跳转到添加书籍页面
    @RequestMapping("/toAddPage")
    public String toAddPage(){
        return  "addBook";
    }

    @RequestMapping("/addBook")
    //添加书籍的请求
    public  String addBook(Books books){
        System.out.println(books);
        bookService.addBook(books);
        //redirect:/book/allBook/ 一定不能写成redirect:/book/allBook，最后的/线必须加
        return "redirect:/book/allBook";//重定向到@RequestMapping("/allBook/")请求，防止重复提交
    }
    //跳转到修改页面
    @RequestMapping("/toUpdatePage")
    public String toUpdatePage(int id, Model model){
        Books books = bookService.queryOneBook(id);
        model.addAttribute("QBook", books);
        return "updateBook";
    }
    //修改操作
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }
    //删除操作
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id){
        bookService.deleteBook(id);
        return "redirect:/book/allBook";
    }

    //查询书籍
    @RequestMapping("queryBook")
    public String queryBook(String queryBookName,Model model){
        Books books = bookService.queryBookByName(queryBookName);
//        if (books == null){
//            model.addAttribute("err","没有查到");
//            return "redirect:/book/allBook";
//        }
        //上述方式，拿不到span标签拿不到err，无法显示span
        List<Books> list = new ArrayList<Books>();
        list.add(books);
        if(books == null){
            list = bookService.queryAllBooks();
            model.addAttribute("err","没有查到");
        }
        model.addAttribute("list",list);
        return "allBook";
    }
}
