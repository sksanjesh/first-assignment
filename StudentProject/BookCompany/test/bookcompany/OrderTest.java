/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookcompany;

import java.sql.Connection;
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
public class OrderTest {
    
    public OrderTest() {
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
     * Test of setOrderNumber method, of class Order.
     */
    @Test
    public void testSetOrderNumber() {
        System.out.println("setOrderNumber");
        int a = 0;
        Order instance = new Order();
        instance.setOrderNumber(a);
    }

    /**
     * Test of setTotalcost method, of class Order.
     */
    @Test
    public void testSetTotalcost() {
        System.out.println("setTotalcost");
        double a = 0.0;
        Order instance = new Order();
        instance.setTotalcost(a);
    }

    /**
     * Test of setCustomerID method, of class Order.
     */
    @Test
    public void testSetCustomerID() {
        System.out.println("setCustomerID");
        int a = 0;
        Order instance = new Order();
        instance.setCustomerID(a);
    }

    /**
     * Test of getDate method, of class Order.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Order instance = new Order();
        String expResult = instance.getDate();
        String result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrderNumber method, of class Order.
     */
    @Test
    public void testGetOrderNumber() {
        System.out.println("getOrderNumber");
        Order instance = new Order();
        int expResult = 0;
        int result = instance.getOrderNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTotalcost method, of class Order.
     */
    @Test
    public void testGetTotalcost() {
        System.out.println("getTotalcost");
        Order instance = new Order();
        Double expResult = 0.0;
        Double result = instance.getTotalcost();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCustomerID method, of class Order.
     */
    @Test
    public void testGetCustomerID() {
        System.out.println("getCustomerID");
        Order instance = new Order();
        int expResult = 0;
        int result = instance.getCustomerID();
        assertEquals(expResult, result);
    }

    /**
     * Test of addOrder method, of class Order.
     */
    @Test
    public void testAddOrder() {
        System.out.println("addOrder");
        Connection con = null;
        Order instance = new Order();
        String expResult = "Error java.lang.NullPointerException";
        String result = instance.addOrder(con);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateOrder method, of class Order.
     */
    @Test
    public void testUpdateOrder() {
        System.out.println("updateOrder");
        Connection con = null;
        Order instance = new Order();
        String expResult = "Error java.lang.NullPointerException";
        String result = instance.updateOrder(con);
        assertEquals(expResult, result);
    }

    /**
     * Test of findOrder method, of class Order.
     */
    @Test
    public void testFindOrder() {
        System.out.println("findOrder");
        Order instance = new Order();
        instance.findOrder();
    }

    /**
     * Test of getOrderList method, of class Order.
     */
    @Test
    public void testGetOrderList() {
        System.out.println("getOrderList");
        Order instance = new Order();
        instance.getOrderList();
    }

    /**
     * Test of deleteOrder method, of class Order.
     */
    @Test
    public void testDeleteOrder() {
        System.out.println("deleteOrder");
        Order instance = new Order();
        instance.deleteOrder();
    }

    /**
     * Test of calculateTotalCost method, of class Order.
     */
    @Test
    public void testCalculateTotalCost() {
        System.out.println("calculateTotalCost");
        Order instance = new Order();
        instance.calculateTotalCost();
    }

    /**
     * Test of exportSalesData method, of class Order.
     */
    @Test
    public void testExportSalesData() {
        System.out.println("exportSalesData");
        Order instance = new Order();
        instance.exportSalesData();
    }
}
