/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno
 */
public class SumaTest {

    
    public SumaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Suma.
     */
    @Test
    public void testMain() {
        System.out.println("Obtener Suma");
        int a = 0;
        int b = 0;
        Suma instance = new Suma();
        int expResult = 0;
        int result = instance.obtenerSuma(a, b);
        assertEquals(expResult, result);
        
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
