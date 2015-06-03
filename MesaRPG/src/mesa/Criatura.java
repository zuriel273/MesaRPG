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
public class Criatura {
    private ArrayList<Item> itens;
    private ArrayList<Atributo> atributos;
    private Raça raça;
    private int level, xp;

    public Criatura(ArrayList<Item> itens, ArrayList<Atributo> atributos, Raça raça, int level, int xp) {
        this.itens = itens;
        this.atributos = atributos;
        this.raça = raça;
        this.level = level;
        this.xp = xp;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public ArrayList<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<Atributo> atributos) {
        this.atributos = atributos;
    }

    public Raça getRaça() {
        return raça;
    }

    public void setRaça(Raça raça) {
        this.raça = raça;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
    
    public boolean morto(){
        return false;
    }
    
}
