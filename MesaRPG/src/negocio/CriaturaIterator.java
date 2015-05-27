/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

/**
 *
 * @author Arlindo
 */
public interface CriaturaIterator {
    public Criatura primeiro();
    public boolean fimDeBatalha();
    public Criatura proximo();
    public Criatura criaturaAtual();
    public int turno();
    
}
