/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectarrayexample;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ObjectArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of book");
        int num = scan.nextInt();
        scan.nextLine();
        Book[] book = new Book[num];
        for(int i=0;i<num;i++){
            System.out.println("Book:"+(i+1));
            System.out.print("Enter Book ID:");
            String bid = scan.nextLine();
            System.out.print("Enter Book Title:");
            String btitle = scan.nextLine();
            System.out.print("Enter Book Price:");
            double biprice = scan.nextDouble();
            scan.nextLine();
            book[i] = new Book(bid, btitle, biprice);
        }
        
        System.out.println("Print back");
        for(int i=0;i<num;i++){
            System.out.println("Book: "+(i+1));
            System.out.println("Book ID:"+book[i].getBookid());
            System.out.println("Book Title:"+book[i].getTitle());
            System.out.println("Book Price:"+book[i].getPrice());
            
        }
        
    }
    
}
