package com.example.Student_Library_Management_System.Services;


import com.example.Student_Library_Management_System.DTOs.IssueBookRequestDto;
import com.example.Student_Library_Management_System.Repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    public  String issueBook(IssueBookRequestDto issueBookRequestDto){
        return "";
    }


}
