/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mesa;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arlindo
 */
public class AtributoTest extends TestCase{
    
   
    /**
     * Test of getValor method, of class Atributo.
     */
    @Test
    public void testCriaAtributo() {
        System.out.println("Cria Atributo");
        
        Atributo atributo = new Atributo(8, "Força", "Força da Criatura");
        
        String expResult = "Atributo{" + "valor=" + 8 + ", nome=" + "Força" + ", descricao=" + "Força da Criatura" + '}';
        String result = atributo.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setValor method, of class Atributo.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        int valor = 7;
        Atributo instance = new Atributo(8, "Força", "Força da Criatura");
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(7, instance.getValor());
    }

    /**
     * Test of getNome method, of class Atributo.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Atributo instance = new Atributo(8, "Força", "Força da Criatura");
        String expResult = "Força";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    
}
