package com.company.task_87_A_5;



public class Book {
    private int id;
    private String name;
    private String author;
    private String publishing;
    private int publicationDate;
    private int numberPage;
    private double price;
    private String typeBinding;

    public Book(int id, String name, String author, String publishing, int publicationDate, int numberPage, double price, String typeBinding) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.publicationDate = publicationDate;
        this.numberPage = numberPage;
        this.price = price;
        this.typeBinding = typeBinding;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeBinding() {
        return typeBinding;
    }

    public void setTypeBinding(String typeBinding) {
        this.typeBinding = typeBinding;
    }
}
