/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Blank47
 */
public class Graduate extends Student{
    
    String type;

    public Graduate(String type, String firstName, String lastName, String studentID) {
         super(firstName, lastName, studentID);
        this.type = type;
        
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
