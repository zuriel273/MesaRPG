/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mesa;

import java.util.ArrayList;

/**
 *
 * @author Arlindo
 */
public class NPC extends Criatura{
    private boolean Aliado;

    public NPC(boolean Aliado, ArrayList<Item> itens, ArrayList<Atributo> atributos, Raca raça, int level, int xp) {
        super(itens, atributos, raça, level, xp);
        this.Aliado = Aliado;
    }

    public boolean isAliado() {
        return Aliado;
    }

    public void setAliado(boolean Aliado) {
        this.Aliado = Aliado;
    }   
    
}
