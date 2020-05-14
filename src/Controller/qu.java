/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.BookCategory;
import Model.ClientCategory;


/**
 *
 * @author aurore
 */
public class qu {
    public static void main(String[] args) {

        String st1="2020-05-01";
        String st2="2020-05-02";
        if(st1.compareTo(st2)<1){
            System.out.println("less");
            
        }
        String st3="2020-05-01";
        String st4="2020-05-02";
        System.out.println(""+BookCategory.BIO);
        System.out.println(""+ClientCategory.valueOf("STUDENT"));
     
    }
}
