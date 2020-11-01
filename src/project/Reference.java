/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

public class Reference extends Book {

    public Reference() {
        super();
        this.category = "Reference";
    }

    public Reference(String name, String authorName, String publisher, double price, String dateOfPucharse, int rackNumber) {
        super(name, authorName, publisher, price, dateOfPucharse, rackNumber);
        this.category = "Reference";
    }
}
