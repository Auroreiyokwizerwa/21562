/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author aurore
 */
@Embeddable
public class OperationId implements Serializable {
    @Column(name="clientid")
    private int client_id;
    @Column(name="bookid")
    private int book_id;

    public OperationId() {
    }

    public OperationId(int client_id, int book_id) {
        this.client_id = client_id;
        this.book_id = book_id;
    }

    
    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }
    
    
}
