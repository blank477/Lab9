/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Blank47
 */
public class Main {

    public static void main(String[] args) {

        employee employee1 = new employee("Susan Meyers", 47899 , "Accounting", "Vice President");
        employee employee2 = new employee("Mark Jones", 39119, "IT", "Programmer");
        employee employee3 = new employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        
        employee1.print();
        employee2.print();
        employee3.print();
        
    }
}
