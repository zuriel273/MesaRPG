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
public class Atributo {
    private int valor;
    private String nome, descricao;

    public Atributo(int valor, String nome, String descricao) {
        this.valor = valor;
        this.nome = nome;
        this.descricao = descricao;
    }

       
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
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

    @Override
    public String toString() {
        return "Atributo{" + "valor=" + valor + ", nome=" + nome + ", descricao=" + descricao + '}';
    }
    
}
