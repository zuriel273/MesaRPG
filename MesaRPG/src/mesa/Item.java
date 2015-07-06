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
public abstract class Item {
    private String descricao, nome;
    private int ataque, defesa, magia;

    public Item(String descricao, String nome, int ataque, int defesa, int magia) {
        this.descricao = descricao;
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.magia = magia;
    }
    
    public Item(Item it){
        this.descricao = it.getDescricao();
        this.nome = it.getNome();
        this.ataque = it.getAtaque();
        this.magia = it.getMagia();
        this.defesa = it.getDefesa();
    }
    
    public Item(){}

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }
    
    
    
}
