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
public class TrainTest {
    String PlatForm, InterState, Time;
    public TrainTest() {
    }
    
   
    

    /**
     * Test of getPlatForm method, of class Train.
     */
    @Test
    public void testGetPlatForm() {
        System.out.println("getPlatForm");
        Train instance = new Train() {
};
        instance.setPlatForm("S22");
        String expResult = "S22";
        String result = instance.getPlatForm();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPlatForm method, of class Train.
     */
    @Test
    public void testSetPlatForm() {
        System.out.println("setPlatForm");
        String PlatForm = "S22";
        Train instance = new Train() {
};
        
        instance.setPlatForm(PlatForm);
        
    }

    /**
     * Test of getInterState method, of class Train.
     */
    @Test
    public void testGetInterState() {
        System.out.println("getInterState");
        Train instance = new Train() {
};
        instance.setInterState("BOM");
        String expResult = "BOM";
        String result = instance.getInterState();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setInterState method, of class Train.
     */
    @Test
    public void testSetInterState() {
        System.out.println("setInterState");
        String InterState = "BOM";
        Train instance = new Train() {
};
        instance.setInterState(InterState);
       
    }

    /**
     * Test of getTime method, of class Train.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Train instance = new Train() {
};
        instance.setTime("22:20");
        String expResult = "22:20";
        String result = instance.getTime();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setTime method, of class Train.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        String Time = "22:20";
        Train instance = new Train() {
};
        instance.setTime(Time);
        
    }

    /**
     * Test of toString method, of class Train.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Train instance = new Train("S22", "BOM", "22:20") {
        
};
        String expResult = "Platform Number: S22, Interstate Terminal: BOM, Time: 22:20";
        String result = instance.toString();
        assertEquals(expResult,result );
        
    }

    
}
