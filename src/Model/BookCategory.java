/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aurore
 */
public enum BookCategory {
    MATH(1),BIO(2);

    private Integer catnumber;

    private BookCategory(Integer catnumber) {
        this.catnumber = catnumber;
    }

    public Integer getCatnumber() {
        return catnumber;
    }


    
    @Override
    public String toString() {
        return ""+catnumber;
    }
    
    
    
}
