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
 * @author aadhikthikar
 */
public class BookTest {
    public static Connection con;
    
    public BookTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        DBConnection DB = new DBConnection("C:/Users/aadhikthikar/Desktop/BookCompany.accdb");
       con = DB.con;
    }
    
    @After
    public void tearDown() {
    }

     /**
     * Test of findBook method, of class Book.
     */
    @Test
    public void testFindBook() {
        System.out.println("findBook");
        Book instance = new Book();
        String expResult = "The Above Record Was Found";
        String result = instance.findBook(con);
        assertFalse(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of updateBook method, of class Book.
     */
    @Test
    public void testUpdateBook() {
        System.out.println("updateBook");        
        Book instance = new Book();
        String expResult = "The Record Was Updated";
        String result = instance.updateBook(con);
        assertFalse(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addBook method, of class Book.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");        
        Book instance = new Book();
        String expResult = "The Book Has Been Added";
        String result = instance.addBook(con);
        assertFalse(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of deleteBook method, of class Book.
     */
    @Test
    public void testDeleteBook() {
        System.out.println("deleteBook");        
        Book instance = new Book();
        String expResult = "The Record Was Deleted";
        String result = instance.deleteBook(con);
        assertFalse(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        
    }
}