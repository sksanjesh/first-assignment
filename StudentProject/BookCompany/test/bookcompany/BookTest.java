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
        DBConnection DB = new DBConnection("C:/Users/aadhikthikar/Desktop/BookCompany.accdb");
        Connection con = DB.con;
        Book instance = new Book();    
        instance.setISBN("5");
        String expResult = "The Above Record Was Found";
        String result = instance.findBook(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of findBook method, of class Book.
     */
    @Test
    public void testFindBook_noConn() {
        System.out.println("findBook");
        DBConnection DB = new DBConnection("C:/Users/aadhikthikar/Desktop/BookCompany.accdb");
        Connection con = DB.con;
        Book instance = new Book();        
        instance.setISBN("xxxxx");
        String expResult = "The Above Record Was Found";
        String result = instance.findBook(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of findBook method, of class Book.
     */
    @Test
    public void testFindBook_noResult() {
        System.out.println("findBook");
        //DBConnection DB = new DBConnection("C:/Users/aadhikthikar/Desktop/BookCompany.accdb");
        Connection con = null;
        Book instance = new Book(); 
        //instance.setISBN("x");
        String expResult = "Error: java.lang.NullPointerException";
        String result = instance.findBook(con);        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of updateBook method, of class Book.
     */
    @Test
    public void testUpdateBook() {
        System.out.println("updateBook");
        DBConnection DB = new DBConnection("C:/Users/aadhikthikar/Desktop/BookCompany.accdb");;
        Connection con = DB.con;
        Book instance = new Book();
        String expResult = "The Record Was Updated";
        String result = instance.updateBook(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addBook method, of class Book.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        DBConnection DB = new DBConnection("C:/Users/aadhikthikar/Desktop/BookCompany.accdb");;
        Connection con = DB.con;
        Book instance = new Book();
        String expResult = "The Book Has Been Added";
        String result = instance.addBook(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBook method, of class Book.
     */
    @Test
    public void testDeleteBook() {
        System.out.println("deleteBook");
        DBConnection DB = new DBConnection("C:/Users/aadhikthikar/Desktop/BookCompany.accdb");;
        Connection con = DB.con;
        Book instance = new Book();
        String expResult = "The Record Was Deleted";
        String result = instance.deleteBook(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}