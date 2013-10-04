/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookcompany;

import java.sql.Connection;
import java.sql.DriverManager;
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
    public void testNullConnection() {
        Connection testCon = null;
        Staff instance = new Staff();
        
        String result = instance.add(con);
        
        if (result.contains("Error:"))
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
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of update method, of class Staff.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.update(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of find method, of class Staff.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.find(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of delete method, of class Staff.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.delete(con);
        assertEquals(expResult, result);

    }
}
