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
public class Personagem extends Criatura {
    private String nome;

    public Personagem(String nome, ArrayList<Item> itens, ArrayList<Atributo> atributos, Raca raca, int level, int xp) {
        super(itens, atributos, raca, level, xp);
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
