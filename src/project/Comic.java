/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package project;

/**
 *
 * @author vuong.thai22
 */
public class Comic extends Book {

    public Comic() {
        super();
        this.category = "Comic";
    }

    public Comic(String name, String authorName, String publisher, double price, String dateOfPucharse, int rackNumber) {
        super(name, authorName, publisher, price, dateOfPucharse, rackNumber);
        this.category = "Comic";
    }
}
