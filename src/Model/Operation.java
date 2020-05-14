/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author aurore
 */
@Entity
//@Embeddable
public class Operation implements Serializable {
    @Id @GeneratedValue
    private int id;
    @Embedded
    private OperationId opid;
//    @JoinColumn(name = "clientid")
//    private int clien_id;
//    @JoinColumn(name = "bookid")
//    private int boo_id;
    private int status;
    private String date;
//    @ElementCollection//this means that book would be an attribute
    //of operation
//    @OneToMany
//    private Set<Book> opbook=new HashSet<>();

//    public Set<Book> getOpbook() {
//        return opbook;
//    }
//
//    public void setOpbook(Set<Book> opbook) {
//        this.opbook = opbook;
//    }
//
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public Operation(OperationId opid) {
        this.opid = opid;
    }
//
//    
    public OperationId getOpid() {
        return opid;
    }
//
    public void setOpid(OperationId opid) {
        this.opid = opid;
    }

//    public int getClien_id() {
//        return clien_id;
//    }
//
//    public void setClien_id(int clien_id) {
//        this.clien_id = clien_id;
//    }
//
//    public int getBoo_id() {
//        return boo_id;
//    }
//
//    public void setBoo_id(int boo_id) {
//        this.boo_id = boo_id;
//    }

    
    public Operation() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    

//    public Set<Book> getOpbook() {
//        return opbook;
//    }
//
//    public void setOpbook(Set<Book> opbook) {
//        this.opbook = opbook;
//    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
