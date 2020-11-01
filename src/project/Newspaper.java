/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author ROG STRIX
 */
public class Newspaper extends Book {

    public Newspaper() {
        super();
        this.category = "Newspaper";
    }
    
    public Newspaper(String name, String authorName, String publisher, double price, String dateOfPucharse, int rackNumber) {
        super(name, authorName, publisher, price, dateOfPucharse, rackNumber);
        this.category = "Newspaper";
    }
}
