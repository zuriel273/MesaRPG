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
public class Raça {
    
    private String descricao;
    private ArrayList<Habilidade> habilidades;

    public Raça(String descricao, ArrayList<Habilidade> habilidades) {
        this.descricao = descricao;
        this.habilidades = habilidades;
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
    
    
    
}
