package com.example.Student_Library_Management_System.Models;


import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(unique = true)
    private String email;

    private String mobNo;

    private int age;

    private String country;


    //Plain syntax for bidirectional mapping

    //Name of variable of the Parent Entity that you have written in child class foreign key attr.
    @OneToOne(mappedBy = "studentVariableName",cascade = CascadeType.ALL)
    private Card card;
    /*
        Steps to find that variable

        1. Go the child class (In this case)
        2. Out of all the attributes select the foreign key attribute that is helping you connect
        with parent class
        (Ref :  @OneToOne
                @JoinColumn
                private Student studentVariableName;
        )
        3. Choose the variable name of the parentEnty (reference : studentVariableName)
     */


    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
