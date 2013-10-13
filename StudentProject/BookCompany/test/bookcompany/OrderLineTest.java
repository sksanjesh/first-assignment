/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookcompany;

import java.sql.Connection;
import java.sql.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author San
 */
public class OrderLineTest {
    
    public OrderLineTest() {
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
     * Test of setOrderNumber method, of class OrderLine.
     */
    @Test
    public void testSetOrderNumber() {
        System.out.println("setOrderNumber");
        int a = 0;
        OrderLine instance = new OrderLine();
        instance.setOrderNumber(a);
    }

    /**
     * Test of setOrderLineNumber method, of class OrderLine.
     */
    @Test
    public void testSetOrderLineNumber() {
        System.out.println("setOrderLineNumber");
        int a = 0;
        OrderLine instance = new OrderLine();
        instance.setOrderLineNumber(a);
    }

    /**
     * Test of setQuantiy method, of class OrderLine.
     */
    @Test
    public void testSetQuantiy() {
        System.out.println("setQuantiy");
        int a = 0;
        OrderLine instance = new OrderLine();
        instance.setQuantiy(a);
    }

    /**
     * Test of setISBN method, of class OrderLine.
     */
    @Test
    public void testSetISBN() {
        System.out.println("setISBN");
        String a = "";
        OrderLine instance = new OrderLine();
        instance.setISBN(a);
    }

    /**
     * Test of getOrderNumber method, of class OrderLine.
     */
    @Test
    public void testGetOrderNumber() {
        System.out.println("getOrderNumber");
        OrderLine instance = new OrderLine();
        int expResult = 0;
        int result = instance.getOrderNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrderLineNumber method, of class OrderLine.
     */
    @Test
    public void testGetOrderLineNumber() {
        System.out.println("getOrderLineNumber");
        OrderLine instance = new OrderLine();
        int expResult = 0;
        int result = instance.getOrderLineNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getQuantiy method, of class OrderLine.
     */
    @Test
    public void testGetQuantiy() {
        System.out.println("getQuantiy");
        OrderLine instance = new OrderLine();
        int expResult = 0;
        int result = instance.getQuantiy();
        assertEquals(expResult, result);
    }

    /**
     * Test of getISBN method, of class OrderLine.
     */
    @Test
    public void testGetISBN() {
        System.out.println("getISBN");
        OrderLine instance = new OrderLine();
        String expResult = "";
        String result = instance.getISBN();
        assertEquals(expResult, result);
    }

    /**
     * Test of addOrderLine method, of class OrderLine.
     */
    @Test
    public void testAddOrderLine() {
        System.out.println("addOrderLine");
        Connection con = null;
        OrderLine instance = new OrderLine();
        String expResult = "Error java.lang.NullPointerException"; //excpected since the instance of connection isn't initialized
        String result = instance.addOrderLine(con);
        assertEquals(expResult, result);
    }
    
    
}
