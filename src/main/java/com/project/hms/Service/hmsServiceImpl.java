package com.project.hms.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hms.Dao.hmsDao;
import com.project.hms.Model.Book;

@Service
public class hmsServiceImpl implements hmsService {

    @Autowired
    hmsDao hmsdao;

    @Override
    public Book bookdata(Book book) {
        Book book1=hmsdao.save(book);
        System.out.println("Record save"+book1);
        return book;
    }
    


}
