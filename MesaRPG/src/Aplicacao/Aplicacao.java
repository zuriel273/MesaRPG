/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aplicacao;

import java.util.ArrayList;
import mesa.*;

/**
 *
 * @author Arlindo
 */
public class Aplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MesaRPG mesa = new MesaRPG();        
        //ArrayList<Raca> racas = new ArrayList<>();
        ArrayList<Habilidade> habilidadeGue = new ArrayList<>();
        ArrayList<Atributo> atributosGue = new ArrayList<>();
        ArrayList<Habilidade> habilidadeMag = new ArrayList<>();
        ArrayList<Atributo> atributosMag = new ArrayList<>();
                       
        Atributo forca, magia, defesa, vida;
        
        forca = new Atributo(1, "Força", "Força do Jogador");
        magia = new Atributo(1,"Magia", "Magia do Jogador");
        defesa = new Atributo(1, "Defesa", "Defesa do Jogador");
        vida = new Atributo(20, "Vida", "Vida do Jogador");
        
        atributosGue.add(vida);
        atributosGue.add(magia);
        atributosGue.add(defesa);
        atributosGue.add(forca);
        
        atributosMag.add(vida);
        atributosMag.add(magia);
        atributosMag.add(defesa);
        atributosMag.add(forca);
                
        Habilidade forcaDeUrso = new Habilidade("Força de Urso", "O Jogador fica forte como um urso", 2, atributosGue);
        Habilidade livroDeMagia = new Habilidade("Livro de Magia", "O Jogador ganha mais Habilidade no uso das Magias", 3, atributosMag);
        
        habilidadeGue.add(forcaDeUrso);
        habilidadeMag.add(livroDeMagia);
        
        Raca Guerreiro = new Raca("Guerreiro","Defesa e ataque equilibrados, mas não utiliza magia",habilidadeGue);
        Raca Mago = new Raca("Mago","Pouca Defesa e boa Magia",habilidadeMag);
        
        mesa.joinRaca(Mago);
        mesa.joinRaca(Guerreiro);
        
        
        
        
        
        
        
        
    }
    
}
