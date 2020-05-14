/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

/**
 *
 * @author aurore
 */
@Entity
public class Book implements Serializable {
    @Id//works when the object is serializable
    @GeneratedValue
    private int bookid;
    private String Title;
    private String PublishingHouse;   
    private String Author;
    private String DateOfPublication;
    private String pages;
    private String bc;
//    @EmbeddedId
//    private Operation op;
    @ManyToOne
//    @JoinTable(name = "borrow",joinColumns = @JoinColumn(name = "book_id" ,referencedColumnName ="bookid" ),inverseJoinColumns = @JoinColumn(name = "client_id",referencedColumnName = "clientid"))
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    public Book() {
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

//    public Operation getOp() {
//        return op;
//    }
//
//    public void setOp(Operation op) {
//        this.op = op;
//    }

    public Book(int bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getPublishingHouse() {
        return PublishingHouse;
    }

    public void setPublishingHouse(String PublishingHouse) {
        this.PublishingHouse = PublishingHouse;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getDateOfPublication() {
        return DateOfPublication;
    }

    public void setDateOfPublication(String DateOfPublication) {
        this.DateOfPublication = DateOfPublication;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getBc() {
        return bc;
    }

    public void setBc(String bc) {
        this.bc = bc;
    }
    
    
}
