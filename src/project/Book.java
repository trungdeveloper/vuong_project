/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
// Name convention in Java: https://www.geeksforgeeks.org/java-naming-conventions/#:~:text=Java%20uses%20CamelCase%20as%20a,letter%2C%20rest%20all%20with%20capital.

public abstract class Book {

    // Camel case for attributes and methods
    protected int id;
    protected String name;
    protected String authorName;
    protected String publisher;
    protected String category;
    protected double price;
    protected String dateOfPurchase;
    protected int rackNumber;

    // Static is the variable of class
    private static int count = 0;

    public Book() {
        this.id = ++Book.count;
    }

    public Book(String name, String authorName, String publisher, double price, String dateOfPurchase, int rackNumber) {
        this.id = ++Book.count;
        this.name = name;
        this.authorName = authorName;
        this.publisher = publisher;
        this.price = price;
        this.dateOfPurchase = dateOfPurchase;
        this.rackNumber = rackNumber;
    }

    public String getCategory() {
        return category;
    }

    public int getRackNumber() {
        return rackNumber;
    }

    public void setRackNumber(int rackNumber) {
        this.rackNumber = rackNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPucharse) {
        this.dateOfPurchase = dateOfPucharse;
    }

    public void display() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Category: " + getCategory());
        System.out.println("Price: " + getPrice());
    }
}

