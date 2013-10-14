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
     * Test of findBook method, of class Book, null object.
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
     * Test of findBook method, of class Book, not exist.
     */
    @Test
    public void testFindBook_NotExist() {
        System.out.println("findBook");
        Book instance = new Book();
        instance.setISBN("xxx");
        String expResult = "The Above Record Was Found";
        String result = instance.findBook(con);
        assertFalse(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    /**
     * Test of findBook method, of class Book, database verification.
     */
    @Test
    public void testFindBook_DBCheck() {
        System.out.println("findBook");
        Book instance = new Book();
        instance.setISBN("1");
        String expResult = "Harry Potter";
        String result = instance.findBook(con);
        assertEquals(expResult, instance.getTitle());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of updateBook method, of class Book, null object.
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
     * Test of updateBook method, of class Book, Not Existing.
     */
    @Test
    public void testUpdateBook_NotExist() {
        System.out.println("updateBook");        
        Book instance = new Book();
        instance.setISBN("xxx");
        instance.setTitle("Howling Reborn");
        String expResult = "The Record Was Updated";
        String result = instance.updateBook(con);
        assertFalse(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    /**
     * Test of updateBook method, of class Book, null object.
     */
    @Test
    public void testUpdateBook_DBCheck() {
        System.out.println("updateBook");        
        Book instance = new Book();
        instance.setISBN("44");
        instance.setTitle("Test XXX");
        String expResult = "The Record Was Updated";
        String result = instance.updateBook(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addBook method, of class Book, null object.
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
     * Test of addBook method, of class Book, null object.
     */
    @Test
    public void testAddBook_CheckNullinDB() {
        System.out.println("addBook");        
        Book instance = new Book();
        instance.setISBN("66");
        instance.setAuthor("Avinesh");
        instance.setPrice(20.00);
        //instance.setPublisher("Wiley");
        //instance.setSubject("Humor");
        //instance.setPublicationYear(3333);
        String expResult = "The Book Has Been Added";
        String result = instance.addBook(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    /**
     * Test of addBook method, of class Book, DB Check.
     */
    @Test
    public void testAddBook_DBCheck() {
        System.out.println("addBook");        
        Book instance = new Book();
        instance.setISBN("66");
        instance.setAuthor("Avinesh");
        instance.setPrice(20.00);
        instance.setPublisher("Wiley");
        instance.setSubject("Humor");
        instance.setPublicationYear(3333);
        String expResult = "The Book Has Been Added";
        String result = instance.addBook(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of deleteBook method, of class Book, null object.
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
    
    /**
     * Test of deleteBook method, of class Book, not exist.
     */
    @Test
    public void testDeleteBook_NotExist() {
        System.out.println("deleteBook");        
        Book instance = new Book();
        instance.setISBN("xxx");
        String expResult = "The Record Was Deleted";
        String result = instance.deleteBook(con);
        assertFalse(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    /**
     * Test of deleteBook method, of class Book, null object.
     */
    @Test
    public void testDeleteBook_DBCheck() {
        System.out.println("deleteBook");        
        Book instance = new Book();
        instance.setISBN("88");
        String expResult = "The Record Was Deleted";
        String result = instance.deleteBook(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}