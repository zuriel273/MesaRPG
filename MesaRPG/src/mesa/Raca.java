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
public class Raca {
    
    private String nome;
    private String descricao;
    private ArrayList<Habilidade> habilidades;

   
    public Raca(String nome, String descricao, ArrayList<Habilidade> habilidades) {
        this.nome = nome;
        this.descricao = descricao;
        this.habilidades = habilidades;
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

    public ArrayList<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }
    
    public void joinHabilidades(Habilidade habilidade){
        habilidades.add(habilidade);
    }
    
    public void removeHabilidade(Habilidade habilidade){
        if(!habilidades.remove(habilidade)){
            System.out.println("Warning: Habilidade não existe na lista de habilidades");
        }
    }
    
    
    
}
