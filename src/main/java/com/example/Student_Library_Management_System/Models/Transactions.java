package com.example.Student_Library_Management_System.Models;


import com.example.Student_Library_Management_System.Enums.TransactionStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="transactions")
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(value = EnumType.STRING)
    private TransactionStatus transactionStatus;

    private int fine;

    private String transactionId = UUID.randomUUID().toString();

    @CreationTimestamp
    private Date transactionDate;

    private boolean isIssueOperation;

    //Things I will write for connecting it book.
    @ManyToOne
    @JoinColumn
    private Book book; //book entity pk will come here and become a foreign key.

    //We need to connect it to the Card class.
    @ManyToOne
    @JoinColumn
    private Card card;

    public Transactions() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public boolean isIssueOperation() {
        return isIssueOperation;
    }

    public void setIssueOperation(boolean issueOperation) {
        isIssueOperation = issueOperation;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
