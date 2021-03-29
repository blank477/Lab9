/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Blank47
 */
public class InsuranceEstimatorTest {
    
    public InsuranceEstimatorTest() {
    }

    

    @Test
    public void testCalculateLifeInsurance() throws Exception {
        System.out.println("calculateLifeInsurance");
        int age = 5;
        double expResult = 325.0;
        double result = InsuranceEstimator.calculateLifeInsurance(age);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testCalculateLifeInsurance2() throws Exception {
        System.out.println("calculateLifeInsurance");
        int age = 111;
        double expResult = 0.0;
        double result = InsuranceEstimator.calculateLifeInsurance(age);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
