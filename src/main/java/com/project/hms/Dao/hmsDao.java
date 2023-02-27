package com.project.hms.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hms.Model.Book;

public interface hmsDao extends JpaRepository<Book, String> {
    
}
