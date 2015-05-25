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
public class Personagem {
    private String nome;
    private Criatura criatura;

    public Personagem(String nome, Criatura criatura) {
        this.nome = nome;
        this.criatura = criatura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Criatura getCriatura() {
        return criatura;
    }

    public void setCriatura(Criatura criatura) {
        this.criatura = criatura;
    }
    
    
}
