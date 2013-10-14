/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookcompany;

import static bookcompany.DBConnection.con;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author khan_ir
 */
public class CustomerTest {
    public static Connection con;
    
    public CustomerTest() {
        String filename = "C:/Users/Rajnesh/Documents/GitHub/first-assignment/StudentProject/BookCompany.accdb";
        try{
            sun.jdbc.odbc.JdbcOdbcDriver db1 = new sun.jdbc.odbc.JdbcOdbcDriver();
            String username = "";
            String password = "";
            String connectionString;
            String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=";
            database+= filename.trim() + ";DriverID=22;READONLY=true}";
            connectionString = database;
            con = DriverManager.getConnection(connectionString, username, password);
        }
        catch(Exception e){
            // Display error message
            System.err.println("\tError: " + e);
        }
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
     * Test of setAddress method, of class Customer.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String ad = "";
        Customer instance = new Customer();
        instance.setAddress(ad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhone method, of class Customer.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String ph = "";
        Customer instance = new Customer();
        instance.setPhone(ph);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Customer.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhone method, of class Customer.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Customer.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        try
        {   
            
            Customer instance = new Customer();

            instance.setFName("FirstName");
            instance.setLName("LastName");
            instance.setAge(20);
            instance.setAddress("My Home");
            instance.setPhone("6799999999");

            String expResult = "The Customer Has Been Added";
            String result = instance.add(con);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            //fail("The test case is a prototype.");
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
    }

    /**
     * Test of update method, of class Customer.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        try
        {
            Customer instance = new Customer();
        
            instance.setFName("FirstName");
            instance.setLName("LastName");
            instance.setAge(20);
            instance.setAddress("My Home");
            instance.setPhone("6799999999");
            instance.setID(6);

            String expResult = "The Record Was Updated";
            String result = instance.update(con);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            //fail("The test case is a prototype.");
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
    }

    /**
     * Test of find method, of class Customer.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        try
        {       
            Customer instance = new Customer();

            Statement st = con.createStatement();
            int findID = 6;

            ResultSet resultSet = st.executeQuery("SELECT ID FROM Person");
            while(resultSet.next()){
                findID = resultSet.getInt("ID");
            }

            instance.setID(findID);

            String expResult = "The Above Record Was Found";
            String result = instance.find(con);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            //fail("The test case is a prototype.");
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
    }

    /**
     * Test of delete method, of class Customer.
     */
    @Test
    public void testDelete(){
        System.out.println("delete");        
        
        try
        {
            Customer instance = new Customer();

            Statement st = con.createStatement(); //con.createStatement();
            int deleteID = 5;
            String Query = "SELECT ID FROM Person";
            ResultSet resultSet = st.executeQuery(Query);
            while(resultSet.next()){
                deleteID = resultSet.getInt("ID");
            }

            instance.setID(deleteID);
            String expResult = "The Record Was Deleted";
            String result = instance.delete(con);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            //fail("The test case is a prototype.");
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
    }

    /**
     * Test of createNewOrder method, of class Customer.
     */
    @Test
    public void testCreateNewOrder() {
        System.out.println("createNewOrder");
        Customer instance = new Customer();
        instance.createNewOrder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showAllOrders method, of class Customer.
     */
    @Test
    public void testShowAllOrders() {
        System.out.println("showAllOrders");
        Customer instance = new Customer();
        instance.showAllOrders();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}