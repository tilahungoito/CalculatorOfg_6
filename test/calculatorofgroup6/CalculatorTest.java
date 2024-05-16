/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorofgroup6; 
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
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double a = 0.0;
        double b = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result1 = instance.add(a, b);
        assertEquals(expResult, result1, 0.0);
        double result2 = instance.add(999999999999999.5, 999999999999999.9);
        assertEquals(1999999999999999.4, result2, 0.0);
        double result3 = instance.add(-999999999999999.5, -999999999999999.9);
        assertEquals(-1999999999999999.4, result3,0.0);
        double results = instance.add(-56.5, 245.9);
        assertEquals(189.4, results,0.0);
        double result4 = instance.add(-999999999999999.5, 999999999999999.9);
         assertEquals(0.4, result4,0.0);
        

    }
    
    


    /**
     * Test of subtract method, of class Calculator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        double a = 999999999999999.5;
        double b = 999999999999999.9;
        Calculator instance = new Calculator();
        double expResult =0.0 ;
       // double result = instance.subtract(a, b);
       // assertEquals(expResult, result, 0.0);
         double result3 = instance.subtract(-999999999999999.5, 999999999999999.9);
        assertEquals(-1999999999999999.2, result3,0.0);   //comparism two floating numbers  
        double result4 = instance.subtract(-999999999999999.5, -999999999999999.9);
         assertEquals(-1999999999999999.4, result3,0.0);
        
        
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double a = 0.0;
        double b = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.multiply(a, b);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double a = 0.0;
        double b = 0.00000000000000005;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.divide(a, b);
        assertEquals(0.0, result, 0.0);
       double result1 = instance.divide(999999999999999.9, -0.0000000000001);
         assertEquals(-9.999999999999999E27, result1, 0.0);
          double result2 = instance.divide(999999999999999.9, 0.0000000000000001);
          assertEquals(9.999999999999999E30, result2, 0.0);
    }

    /**
     * Test of remainder method, of class Calculator.
     */
    @Test
    public void testRemainder() {
        System.out.println("remainder");
        double a = 0.0;
        double b = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.remainder(a, b);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of absolute method, of class Calculator.
     */
    @Test
    public void testAbsolute() {
        System.out.println("absolute");
        double a = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.absolute(a);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of floor method, of class Calculator.
     */
    @Test
    public void testFloor() {
        System.out.println("floor");
         Calculator instance = new Calculator();
        double a = 0.0;
        double expResult = 0.0;
        double result = instance.floor(a);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of ceil method, of class Calculator.
     */
    @Test
    public void testCeil() {
        System.out.println("ceil");
        double a = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.ceil(a);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of exponent method, of class Calculator.
     */
    @Test
    public void testExponent() {
        System.out.println("exponent");
        double a = 0.0;
        double b = 0.0;
        Calculator instance = new Calculator();
        double expResult = 1;
        double result = instance.exponent(a, b);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of sqrt method, of class Calculator.
     */
    @Test
    public void testSqrt() {
        System.out.println("sqrt");
        double a = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.sqrt(a);
        assertEquals(expResult, result, 0.0);
        
    }

   
    /* @Test
    public void testLog() {
        System.out.println("sqrt");
        double a = 0.0;
       Log instance = new Log();
        double expResult = 0.0;
        double result = instance.sqrt(a);
        assertEquals(expResult, result, 0.0);
        
    }*/
}
