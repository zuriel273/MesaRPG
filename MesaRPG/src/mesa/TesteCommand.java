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
public interface TesteCommand {
    
    public boolean teste(Criatura ativa, Criatura passiva);
    public int testeAsInt(Criatura ativa, Criatura passiva);
    
}
