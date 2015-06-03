/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mesa;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author Arlindo
 */
public class CriaturaTest extends TestCase{
    
    public CriaturaTest() {
    }

 
    @Test
    public void testCriarCriatura() {
        System.out.println("Criando Criatura Teste");
        //Atributo
        ArrayList <Atributo> atributos = new ArrayList<>();
        Atributo atributo = new Atributo(8, "Força", "Força da Criatura");
        atributos.add(atributo);
        //Habilidade
        Habilidade habilidade = new Habilidade("Força de Touro", "Petrus", 3, atributos);
        ArrayList<Habilidade> habilidades = new ArrayList<>();
        habilidades.add(habilidade);
        Raca raca = new Raca("Petruslianos", habilidades);
                    
        ArrayList<Item> itens = null;
        Criatura instance = new Criatura(atributos, raca, 1, 10);
        
        assertEquals(instance.toString(),"Criatura{level=" + 1 + ", xp=" + 10 + "}" );
    }
  
    
}
