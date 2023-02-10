package com.example.Student_Library_Management_System.Services;


import com.example.Student_Library_Management_System.Models.Author;
import com.example.Student_Library_Management_System.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;


    public String createAuthor(Author author){

        authorRepository.save(author);
        return "Author added successfully";
    }

}
