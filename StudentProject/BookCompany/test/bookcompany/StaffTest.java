/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookcompany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author s11033120
 */
public class StaffTest {
    
    public static Connection con;
    
    public StaffTest() {
        try
        {
        String filename = "C:/Users/s11033120/Desktop/BookCompany.accdb";
        sun.jdbc.odbc.JdbcOdbcDriver db1 = new sun.jdbc.odbc.JdbcOdbcDriver();
            String username = "";
            String password = "";
            String connectionString;
            String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=";
            database+= filename.trim() + ";DriverID=22;READONLY=true}";
            connectionString = database;
            con = DriverManager.getConnection(connectionString, username, password);
            
        }
        catch (Exception e)
                {
                    System.out.println("Error: " + e.getMessage());
                } 
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
    
    @Test
    public void testConnectionNotNull() {
        if (con == null)
        {
            assert false;
        }
        else
        {
            assert true;
        }
        
    }

    /**
     * Test of add method, of class Staff.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Staff instance = new Staff();
        instance.setFName("Test");
        instance.setLName("Test");
        instance.setAge(21);
        instance.setPosition("Test Position");
        instance.setSalary(20000);
        String expResult = "The Staff Has Been Added";
        String result = instance.add(con);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class Staff.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Staff instance = new Staff();
        instance.setFName("TestUpdated");
        instance.setLName("TestUpdated");
        instance.setAge(21);
        instance.setPosition("TestUpdated Position");
        instance.setSalary(20000);
        String expResult = "The Record Was Updated";
        String result = instance.update(con);
        assertEquals(expResult, result);
    }

    /**
     * Test of find method, of class Staff.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        try
        {
        Staff instance = new Staff();
        Statement S = con.createStatement();
        int testID = 1;
        
        String Query = "SELECT ID FROM PERSON";
        ResultSet rs = S.executeQuery(Query);

        while (rs.next()){
            testID = rs.getInt("ID");
        }
        
        instance.setID(testID);
        String expResult = "The Above Record Was Found";
        String result = instance.find(con);
        assertEquals(expResult, result);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
    }

    /**
     * Test of delete method, of class Staff.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        try
        {
        Staff instance = new Staff();
        Statement S = con.createStatement();
        int testID = 1;
        
        String Query = "SELECT ID FROM PERSON";
        ResultSet rs = S.executeQuery(Query);

        while (rs.next()){
            testID = rs.getInt("ID");
        }
        
        instance.setID(testID);
        String expResult = "The Record Was Deleted";
        String result = instance.delete(con);
        assertEquals(expResult, result);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }

    }
    
    /**
     * Test of find method if invalid ID is passed, of class Staff.
     */
    @Test
    public void testFindInvalidID() {
        System.out.println("find");
        Staff instance = new Staff();
        instance.setID(-1);
        String result = instance.find(con);
        if (instance.getFName() == "" && instance.getLName() == "" && !(result.contains("Error")))
        {
            assert true;
        }
        else
        {
            assert false;
        }
    }
    
    @Test
    public void testUpdateInvalidID() {
        System.out.println("find");
        Staff instance = new Staff();
        instance.setID(-1);
        String result = instance.update(con);
        if (result.contains("java.sql.SQLException"))
        {
            assert true;
        }
        else
        {
            assert false;
        }
    }
}
