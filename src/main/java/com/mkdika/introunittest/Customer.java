
package com.mkdika.introunittest;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 */
public class Customer {
    
    public int getDiscount(int numberOfItem) {
        if (numberOfItem > 10) {
            return 10;
        }
        return 5;
    }
    
}
