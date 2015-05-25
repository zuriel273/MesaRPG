/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import java.util.ArrayList;

/**
 *
 * @author Arlindo
 */
public class Habilidade {
    
    private String nome, descricao;
    private int modificador;
    private ArrayList<Atributo> atributos;
  

    public Habilidade(String nome, String descricao, int modificador, ArrayList<Atributo> atributos) {
        this.nome = nome;
        this.descricao = descricao;
        this.modificador = modificador;
        this.atributos = atributos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getModificador() {
        return modificador;
    }

    public void setModificador(int modificador) {
        this.modificador = modificador;
    }

    public ArrayList<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<Atributo> atributos) {
        this.atributos = atributos;
    }
    
    
    
    
    
}
