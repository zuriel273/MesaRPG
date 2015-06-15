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
        
        ArrayList<Raca> racas = new ArrayList<>();
        ArrayList<Habilidade> habilidadeGue = new ArrayList<>();
        ArrayList<Atributo> atributosGue = new ArrayList<>();
        ArrayList<Habilidade> habilidadeMag = new ArrayList<>();
        ArrayList<Atributo> atributosMag = new ArrayList<>();
        
        Habilidade forcaDeUrso = new Habilidade("Força de Urso", "O Jogador fica forte como um urso", 2, atributosGue);
        Habilidade livroDeMagia = new Habilidade("Livro de Magia", "O Jogador ganha mais Habilidade no uso das Magias", 3, atributosMag);
        
        habilidadeGue.add(forcaDeUrso);
        habilidadeMag.add(livroDeMagia);
        
        Raca guerreiro = new Raca("Guerreiro","Defesa e ataque equilibrados, mas não utiliza magia",habilidadeGue);
        Raca Mago = new Raca("Mago","Pouca Defesa e boa Magia",habilidadeMag);
        
        
        
        
    }
    
}
