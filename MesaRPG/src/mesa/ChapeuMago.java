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
public class ChapeuMago extends Item{
    
    public ChapeuMago(String descricao, String nome, int ataque, int defesa, int magia) {
        super(descricao, nome, ataque, defesa, magia);
    }
    
    public ChapeuMago(Item it) {
        super(it);
    }
    
}
