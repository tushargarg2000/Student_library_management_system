package com.example.Student_Library_Management_System.DTOs;

public class IssueBookRequestDto {

    private int bookId;
    private int cardId;

    public IssueBookRequestDto() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }
}
