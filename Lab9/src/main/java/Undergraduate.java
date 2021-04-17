/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Blank47
 */
public class Undergraduate extends Student {
    
    int year;

    public Undergraduate(int year, String firstName, String lastName, String studentID) {
        
        super(firstName, lastName, studentID);
        this.year = year;
        
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
