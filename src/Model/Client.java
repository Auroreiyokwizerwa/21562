/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

/**
 *
 * @author aurore
 */
@Entity
public class Client implements Serializable {
   @Id @GeneratedValue
    private int clientid;
    
    private String Fname;
    private String  Lname;
    private String EmailAddress;
    private String PhoneNumber;
    private File Photo;
    private String Cat;
//    @OneToMany(mappedBy = "client",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "borrow",joinColumns = {@JoinColumn(name = "client_id" ,referencedColumnName ="clientid" ),@JoinColumn(name = "date",referencedColumnName = "dateop")},inverseJoinColumns = {@JoinColumn(name = "book_id",referencedColumnName = "bookid"),@JoinColumn(name="bookcat",referencedColumnName = "bc")})
    private List<Book> bks=new ArrayList<>();
    private String dateop;

    public String getDateop() {
        return dateop;
    }

    public void setDateop(String dateop) {
        this.dateop = dateop;
    }
    
//    @ElementCollection
    ////for table name,foreign key..
//    @CollectionId(columns ={@Column(name = "opid",nullable = true)},generator = "hilo-gen",type =@Type(type = "long"))
//    configures id and generator,datatype
//    set doesnot support collection id
//    @GenericGenerator(name = "hilo-gen",strategy ="hilo")
//    private List<Operation> operation = Collections.synchronizedList(new ArrayList<>());

    public Client() {
    }

    
    public List<Book> getBks() {
        return bks;
    }

    public void setBks(List<Book> bks) {
        this.bks = bks;
    }

    
    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }
//
//    public List<Operation> getOperation() {
//        return operation;
//    }
//
//    public void setOperation(List<Operation> operation) {
//        this.operation = operation;
//    }

    
    public Client(int clientid) {
        this.clientid = clientid;
    }

    public int getId() {
        return clientid;
    }

    public void setId(int clientid) {
        this.clientid = clientid;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public File getPhoto() {
        return Photo;
    }

    public void setPhoto(File Photo) {
        this.Photo = Photo;
    }

    public String getCat() {
        return Cat;
    }

    public void setCat(String Cat) {
        this.Cat = Cat;
    }

//    public Set<Operation> getOperation() {
//        return operation;
//    }
//
//    public void setOperation(Set<Operation> operation) {
//        this.operation = operation;
//    }


}
