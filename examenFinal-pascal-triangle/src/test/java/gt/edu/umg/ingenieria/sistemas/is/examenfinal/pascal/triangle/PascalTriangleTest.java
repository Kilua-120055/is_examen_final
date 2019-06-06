/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.pascal.triangle;

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
public class PascalTriangleTest {
    
       @Test
    public void testBuild() {
        System.out.println("build");
        int levels = 0;
        PascalTriangle instance = new PascalTriangle();
        String expResult = " ";
        String result = instance.build(levels);
        //assertArrayEquals("resultado obtenido "+Arrays.toString(result),expResult, result);
        assertNotEquals("resultado obtenido ",expResult, result);
    }
    
    @Test
    public void testBuild2() {
        System.out.println("Prueba No.2");
        int levels = 0;
        int levels2 = 0;
        PascalTriangle instance = new PascalTriangle();
        String expResult = "";
        String exp ="";
        String result = instance.build(levels);
        String resu = instance.build(levels);
        assertNotEquals("resultado obtenido ",expResult, result);
        assertNotEquals("resultado obtenido2 ", exp, resu);
    }
    
    @Test
    public void testBuild3() {
        System.out.println("Prueba No.3");
        int levels = 0;
        PascalTriangle instance = new PascalTriangle();
        String expResult = "";
        String result = instance.build(levels);
        
        assertNotEquals("resultado obtenido ",expResult, result);
    }
    
    @Test
    public void testBuild4() {
        System.out.println("Prueba No.4");
        int levels = 0;
        PascalTriangle instance = new PascalTriangle();
        String expResult = "";
        String result = instance.build(levels);
        
        assertNotEquals("resultado obtenido ",expResult, result);
    }
    
    @Test
    public void testBuild5() {
        System.out.println("Prueba No.5");
        int levels = 0;
        PascalTriangle instance = new PascalTriangle();
        String expResult = "";
        String result = instance.build(levels);
        
        assertNotEquals("resultado obtenido ",expResult, result);
    }
    
}
