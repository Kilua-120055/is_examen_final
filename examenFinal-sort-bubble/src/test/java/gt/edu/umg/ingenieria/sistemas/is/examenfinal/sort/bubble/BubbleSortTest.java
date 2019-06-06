/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.sort.bubble;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author killua
 */
public class BubbleSortTest {
    

    @Test
    public void testSortBasic() {
        System.out.println("Prueba No.1");
        int[] numbers = null;
        int[] expResult = null;
        int[] result = BubbleSort.sortBasic(numbers);
        assertArrayEquals(expResult, result);
        
    }
    
    @Test
    public void testSortBasic2() {
        System.out.println("Prueba No.2");
        int[] numbers = {1,2};
        int[] expResult = {1,2};
        int[] result = BubbleSort.sortBasic(numbers);
        assertArrayEquals("resultado obtenido "+Arrays.toString(result),expResult, result);
        
    }
    
    @Test
    public void testSortBasic3() {
        System.out.println("Prueba No.3");
        int[] numbers = null;
        int[] expResult = null;
        int[] num={2,5};
        int[] exp={2,5};
        int[] result = BubbleSort.sortBasic(numbers);
        int[] result2 = BubbleSort.sortBasic(num);
        assertArrayEquals(expResult, result);
        assertArrayEquals(exp, result2);
    }
    
    @Test
    public void testSortBasic4() {
        System.out.println("Prueba No.4");
        int[] numbers = null;
        int[] expResult = null;
        int[] result = BubbleSort.sortBasic(numbers);
        assertArrayEquals(expResult, result);
        
    }
    @Test
    public void testSortBasic5() {
        System.out.println("Prueba No.5");
        int[] numbers = null;
        int[] expResult = null;
        int[] result = BubbleSort.sortBasic(numbers);
        assertArrayEquals(expResult, result);
        
    }
}
