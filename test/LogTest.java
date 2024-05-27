/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class LogTest {
    
    public LogTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of log method, of class Log.
     */
    @Test
    public void testLog() {
         Log log=new Log();
        System.out.println("log");
        double x = 0.0;
        double expResult = 0.0;
         double result1 = log.log(0.9876897);
        assertEquals(-0.00537947519, result1, 0.0);
        double result = log.log(x);
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of factorial method, of class Log.
     */
    @Test
    public void testFactorial() {
        Log log=new Log();
        System.out.println("factorial");
        double x = 0.0;
        double expResult = 0.0;
        double result = log.factorial(x);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of sine method, of class Log.
     */
    @Test
    public void testSine() {
         Log log=new Log();
        System.out.println("sine");
        double x = 0.0;
        double expResult = 0.0;
        double result = log.sine(x);
        assertEquals(expResult, result, 0.0);
         double result1 = log.sine(0.005);
        assertEquals(0.0000872, result1, 0.0);
       
       
    }

    /**
     * Test of cosine method, of class Log.
     */
    @Test
    public void testCosine() {
         Log log=new Log();
        System.out.println("cosine");
        double x = 0.0;
        double expResult = 0.0;
        double result = log.cosine(x);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of tangent method, of class Log.
     */
    @Test
    public void testTangent() {
        System.out.println("tangent");
        Log log=new Log();
        double x = 0.0;
        double expResult = 0.0;
        double result = log.tangent(x);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of main method, of class Log.
     */
  
}
