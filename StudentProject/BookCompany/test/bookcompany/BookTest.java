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
     * Test of setISBN method, of class Book.
     */
    @Test
    public void testSetISBN() {
        System.out.println("setISBN");
        String n = "";
        Book instance = new Book();
        instance.setISBN(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Book.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String n = "";
        Book instance = new Book();
        instance.setTitle(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthor method, of class Book.
     */
    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        String n = "";
        Book instance = new Book();
        instance.setAuthor(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubject method, of class Book.
     */
    @Test
    public void testSetSubject() {
        System.out.println("setSubject");
        String n = "";
        Book instance = new Book();
        instance.setSubject(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPublisher method, of class Book.
     */
    @Test
    public void testSetPublisher() {
        System.out.println("setPublisher");
        String n = "";
        Book instance = new Book();
        instance.setPublisher(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPublicationYear method, of class Book.
     */
    @Test
    public void testSetPublicationYear() {
        System.out.println("setPublicationYear");
        int n = 0;
        Book instance = new Book();
        instance.setPublicationYear(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Book.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        Double n = null;
        Book instance = new Book();
        instance.setPrice(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getISBN method, of class Book.
     */
    @Test
    public void testGetISBN() {
        System.out.println("getISBN");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getISBN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Book.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthor method, of class Book.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getAuthor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubject method, of class Book.
     */
    @Test
    public void testGetSubject() {
        System.out.println("getSubject");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getSubject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPublisher method, of class Book.
     */
    @Test
    public void testGetPublisher() {
        System.out.println("getPublisher");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getPublisher();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPublicationYear method, of class Book.
     */
    @Test
    public void testGetPublicationYear() {
        System.out.println("getPublicationYear");
        Book instance = new Book();
        int expResult = 0;
        int result = instance.getPublicationYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Book.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Book instance = new Book();
        Double expResult = null;
        Double result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findBook method, of class Book.
     */
    @Test
    public void testFindBook() {
        System.out.println("findBook");
        Connection con = null;
        Book instance = new Book();
        String expResult = "";
        String result = instance.findBook(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBook method, of class Book.
     */
    @Test
    public void testUpdateBook() {
        System.out.println("updateBook");
        Connection con = null;
        Book instance = new Book();
        String expResult = "";
        String result = instance.updateBook(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBook method, of class Book.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        Connection con = null;
        Book instance = new Book();
        String expResult = "";
        String result = instance.addBook(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBook method, of class Book.
     */
    @Test
    public void testDeleteBook() {
        System.out.println("deleteBook");
        Connection con = null;
        Book instance = new Book();
        String expResult = "";
        String result = instance.deleteBook(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}