/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mesa;

/**
 *
 * @author Arlindo
 */
public interface GrupoCriatura {
    public void criarCriaturaIterator();
    public void ordenarGrupo(TesteCommand teste);
    public boolean adicionarCriatura(Criatura criatura);
    public boolean removeCriatura(Criatura criatura);
    public int numeroCriatura(); 
    
    
}
