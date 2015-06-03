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
public interface CriaturaIterator {
    
    public Criatura primeiro();
    public Criatura proximo();
    public Criatura criaturaAtual();
    
    public boolean fimDeBatalha();
    public int turno();
}
