/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author aurore
 */
@Entity
public class Registration {
    @Id
 private String username;
 private String password;
 private byte[] salt;

    public Registration() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public String getRepassword() {
//        return repassword;
//    }
//
//    public void setRepassword(String repassword) {
//        this.repassword = repassword;
//    }

    public byte[] getSalt() {
        return salt;
    }

    public void setSalt(byte[] salt) {
        this.salt = salt;
    }

    public Registration(String username, String password, byte[] salt) {
        this.username = username;
        this.password = password;
//        this.repassword = repassword;
        this.salt = salt;
    }
 
 
}
