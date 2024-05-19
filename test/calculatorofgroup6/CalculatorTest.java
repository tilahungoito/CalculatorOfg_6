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
        double result4 = instance.multiply(-1000000000000.0, -1000000000000.0);
        assertEquals(1E24, result4, 0.0);
         double result5 = instance.multiply(1000000000000.0, 1000000000000.0);
        assertEquals(1E24, result5, 0.0);
       
       
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
    
    /**
     * Test of Logarithm method, of class Calculator.
     */
      
    @Test
    public void testLogarithm() {
        assertEquals(3.0, sample.logarithm(1000.0));
    }


    /**
     * Test of NaturalLogarithm method, of class Calculator.
     */
      
    @Test
    public void testNaturalLogarithm() {
        assertEquals(0, sample.naturalLogarithm(1.0));
    }
    
    /**
     * Test of InverseSin method, of class Calculator.
     */
    
    @Test
    public void testInverseSin() {
        assertEquals(0.707584436725, sample.inverseSin(Math.sin(0.65)), 0.0001);
    }

    /**
     * Test of InverseCos method, of class Calculator.
     */
    
    @Test
    public void testInverseCos() {
        assertEquals(0.86321189007, sample.inverseCos(Math.cos(0.65)), 0.0001);
    }

    /**
     * Test of InverseTan method, of class Calculator.
     */

    @Test
    public void testInverseTan() {
        assertEquals(0.576375220591, sample.inverseTan(Math.tan(0.65)), 0.0001);
    }

     
    /**
     * Test of factorial method, of class Calculator.
     */

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, sample.calculateFactorial(0));
    }
    
    @Test
    public void testFactorialOfThree() {
        assertEquals(6,sample.calculateFactorial(3));

    }  

     /**
     * Test of DegreesToRadians method, of class Calculator.
     */
     
     @Test
     public void testDegreesToRadians() {
               assertEquals(Math.PI / 2, sample.degreesToRadians(90), 0.001);
               assertEquals(Math.PI, sample.degreesToRadians(180), 0.001);
     }
     
     
     /**
     * Test of RadiansToDegrees method, of class Calculator.
     */
     @Test
     public void testRadiansToDegrees() {
                    assertEquals(90, sample.radiansToDegrees(Math.PI / 2), 0.001);
                    assertEquals(180, sample.radiansToDegrees(Math.PI), 0.001);
     }

}
