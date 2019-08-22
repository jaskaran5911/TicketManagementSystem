/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmanagement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Navdeep
 */
public class TicketTest {
    
    public TicketTest() {
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
     * Test of getCompType method, of class Ticket.
     */
    @Test
    public void testGetCompType() {
        System.out.println("getCompType");
        Ticket instance = new Ticket();
        instance.setCompType("First-Class");
        String expResult = "First-Class";
        String result = instance.getCompType();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setCompType method, of class Ticket.
     */
    @Test
    public void testSetCompType() {
        System.out.println("setCompType");
        String CompType = "First-Class";
        Ticket instance = new Ticket();
        instance.setCompType(CompType);
        
    }

    /**
     * Test of getSeatNo method, of class Ticket.
     */
    @Test
    public void testGetSeatNo() {
        System.out.println("getSeatNo");
        Ticket instance = new Ticket();
        instance.setSeatNo("S-22");
        String expResult = "S-22";
        String result = instance.getSeatNo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSeatNo method, of class Ticket.
     */
    @Test
    public void testSetSeatNo() {
        System.out.println("setSeatNo");
        String SeatNo = "S-22";
        Ticket instance = new Ticket();
        instance.setSeatNo(SeatNo);
       
    }

    /**
     * Test of getCompNo method, of class Ticket.
     */
    @Test
    public void testGetCompNo() {
        System.out.println("getCompNo");
        Ticket instance = new Ticket();
        instance.setCompNo("C-22");
        String expResult = "C-22";
        String result = instance.getCompNo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCompNo method, of class Ticket.
     */
    @Test
    public void testSetCompNo() {
        System.out.println("setCompNo");
        String CompNo = "C-22";
        Ticket instance = new Ticket();
        instance.setCompNo(CompNo);
        
    }

    /**
     * Test of getTicketPrice method, of class Ticket.
     */
    @Test
    public void testGetTicketPrice() {
        System.out.println("getTicketPrice");
        Ticket instance = new Ticket();
        instance.setTicketPrice(200);
        int expResult = 200;
        int result = instance.getTicketPrice();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTicketPrice method, of class Ticket.
     */
    @Test
    public void testSetTicketPrice() {
        System.out.println("setTicketPrice");
        int TicketPrice = 200;
        Ticket instance = new Ticket();
        instance.setTicketPrice(TicketPrice);
       
    }

    /**
     * Test of toString method, of class Ticket.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ticket instance = new Ticket("First-Class", 200, "S-22");
        String expResult = "Train seat type: First-Class, Seat/Compartment No: S-22, Ticket Price: 200";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
    
}
