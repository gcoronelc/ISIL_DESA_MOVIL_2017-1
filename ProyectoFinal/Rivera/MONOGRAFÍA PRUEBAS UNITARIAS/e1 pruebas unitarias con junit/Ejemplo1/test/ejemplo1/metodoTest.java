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
 * @author La Marjorit
 */
public class metodoTest {
    
    public metodoTest() {
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
     * Test of clasificacion method, of class metodo.
     */
    @Test
    public void testClasificacion() {
        System.out.println("clasificacion");
        String tipo = "niños"; /**agregar*/
        metodo instance = new metodo();
        String expResult = "E todo publico"; /**agregar*/
        String result = instance.clasificacion(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        /**ponemos que el resultado no sea igual porque vamos a controlar la excepcion que hay en el fail*/
        if (!result.equals(expResult)){ 
        /** el fail sera lanzado solo si el resultado del metodo no es igual al resultado esperado*/
        fail("The test case is a prototype.");
    }
    }
    
    /**
     * Test of precioenvio method, of class metodo.
     */
    @Test
    public void testPrecioenvio() {
        System.out.println("precioenvio");
        double precio = 300.0; /**modificar una entrada*/
        metodo instance = new metodo();
        double expResult = 399.0; /**debemos esperar una salida*/
        double result = instance.precioenvio(precio);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (result !=expResult ){ /**realizamos el iff para controlar el fail*/
        /**el fail se va siempre y cuando no sean iguales el result con el resultado esperado*/
            fail("The test case is a prototype.");
    }
    }
    
}
