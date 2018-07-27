package com.mkdika.introunittest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 *
 */
public class CustomerTest {

    /*
        JUST HIT TEST METHOD
        ====================
        This is example method that even the coverage test rate can be high without
        proper assertion execute. This will result the lower rate of mutation test.
     */
//    @Test
//    public void test_getDiscount() {
//        Customer customer = new Customer();
//        int discount1 = customer.getDiscount(4);
//        int discount2 = customer.getDiscount(15);
//    }
    
    
    
    /*
        LOW RATE COVERAGE & MUTATION
        ============================
        This is example method for low rate of coverage test. This may happen 
        because it not coverage all STATEMENT, BRANCH & PATH test.
     */
//    @Test
//    public void test_getDiscount() {
//        Customer customer = new Customer();
//        assertNotNull(customer);
//
//        int discount1 = customer.getDiscount(4);
//        assertEquals(5, discount1);
//    }
    
    
    
    /*
        GOOD RATE COVERAGE & MUTATION
        =============================
        This example method for good unit test:
        - coverage all with proper assertion test
        - cover all mutation test
     */
    @Test
    public void test_getDiscount() {
        Customer customer = new Customer();
        assertNotNull(customer);

        int discount1 = customer.getDiscount(4);
        assertEquals(5, discount1);

        int discount2 = customer.getDiscount(15);
        assertEquals(10, discount2);

        // additional boundary assertion
        assertEquals(5, customer.getDiscount(9));
        assertEquals(5, customer.getDiscount(10));
        assertEquals(10, customer.getDiscount(11));
    }
}
