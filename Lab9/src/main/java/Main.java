/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blank47
 */
public class Main {
    
   public static void main(String[] args) {
   
       LandTract land = new LandTract(20,40);
       LandTract land2 = new LandTract(10,30);
       
       System.out.println(land.equals(land2));
      
       Undergraduate ug = new Undergraduate(2015, "098706", "Bob", "abualkhair");
     Graduate ga = new Graduate("dude", "445456", "Saif", "abualkhair");
     
       System.out.println(ug.getYear());
       System.out.println(ga.getType());
       
   } 
   
}
