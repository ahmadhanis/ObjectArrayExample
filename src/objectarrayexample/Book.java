/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectarrayexample;

/**
 *
 * @author user
 */
public class Book {
    private String bookid,title;
    private double price;
    
    Book(String bookid,String title,double price){
        this.bookid = bookid;
        this.title = title;
        this.price = price;
    }
    
    public String getBookid(){
        return bookid;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
