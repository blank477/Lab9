/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blank47
 */
import java.util.Scanner;

public class InsuranceEstimator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age");

         

        try {
           int age = keyboard.nextInt();
            double lifeInsuranceCost = calculateLifeInsurance(age);
            System.out.println("Your estimate is " + lifeInsuranceCost);
        } catch (InvalidAgeException ex) {
            System.out.println("You entered an invalid age!");   
        }   
        catch (Exception ex) {
            System.out.println("Generic error! ");
        }
    }

    public static double calculateLifeInsurance(int age) throws InvalidAgeException {
        if (age < 5 || age > 110) {
            throw new InvalidAgeException("Invalid Age!! ");
        }

        double insuranceCost = (5 * age) + 300;
        return insuranceCost;

    }
}
