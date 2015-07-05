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
    private Raca raca;
    private int level, xp;

    public Criatura(ArrayList<Item> itens, ArrayList<Atributo> atributos, Raca raca, int level, int xp) {
        this.itens = itens;
        this.atributos = atributos;
        this.raca = raca;
        this.level = level;
        this.xp = xp;
    }
    
     public Criatura(ArrayList<Atributo> atributos, Raca raca, int level, int xp) {
        this.atributos = atributos;
        this.raca = raca;
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

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
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

    @Override
    public String toString() {
//        return "Criatura{" + "itens=" + itens + ", atributos=" + atributos + ", raca=" + raca + ", level=" + level + ", xp=" + xp + '}';
        return "Criatura{level=" + level + ", xp=" + xp + "}";
    }
    
    public void joinAtributo(Atributo atributo){
        atributos.add(atributo);
    }
    
    public void removeAtributo(Atributo atributo){
        if(!atributos.remove(atributo)){
            System.out.println("Warning: Atributo não existe na lista de atributos");
        }
    }
    
    public void joinItem(Item item){
        itens.add(item);
    }
    
    public void removeItem(Item item){
        if(!itens.remove(item)){
            System.out.println("Warning: Item não existe na lista de itens");
        }
    }
    
    
}
