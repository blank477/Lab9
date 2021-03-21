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
public class employee {

    private String name;
    private int idNumber;
    private String department;
    private String position;

    public employee(String name, int idNumber, String department, String position) {

        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;

    }

    public employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }

    public employee() {

        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";

    }
    
 public void print (){
 System.out.println("Name: "+ name + "\nID: " + idNumber + "\nDepartment: " + department + "\nPosition: " + position );
 }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    
}
