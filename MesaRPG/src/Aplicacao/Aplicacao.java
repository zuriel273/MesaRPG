/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aplicacao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        MesaRPG mesa = new MesaRPG();        
        String entrada;
        BufferedReader obj = new BufferedReader(new InputStreamReader (System.in)); 
        int sair = 0;
        int opcao;
        //ArrayList<Raca> racas = new ArrayList<>();
        ArrayList<Habilidade> habilidade = new ArrayList<>();
        ArrayList<Atributo> atributosGue = new ArrayList<>();
        ArrayList<Habilidade> habilidadeMag = new ArrayList<>();
        ArrayList<Atributo> atributosMag = new ArrayList<>();
        
        mesa.setTitulo("SEM TITULO");
       
        while (sair == 0){
        //Config Aplicação
            System.out.println("Configurações do RPG " + mesa.getTitulo());
            System.out.println("1 - ALTERAR TITULO ");
            System.out.println("2 - ADICIONAR RAÇA");
            System.out.println("3 - ADICIONAR ATRIBUTO");
            System.out.println("4 - ADICIONAR HABILIDADE");
            System.out.println("5 - VISUALIZAR RAÇAS ADICIONADAS");
            System.out.println("6 - VISUALIZAR ATRIBUTOS ADICIONADOS");
            System.out.println("7 - VISUALIZAR HABILIDADES ADICIONADAS");
            System.out.println("8 - REMOVER RAÇA");
            System.out.println("9 - REMOVER ATRIBUTO");
            System.out.println("10 - REMOVER HABILIDADE");
            System.out.println("11 - SAIR ");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("Digite a opção desejada: ");
            entrada = obj.readLine();
            opcao = Integer.parseInt(entrada);
            switch(opcao){
                case 1:
                    System.out.println("Digite o Título do Jogo: ");        
                    entrada = obj.readLine();
                    mesa.setTitulo(entrada);
                    break;
                case 2:
                    System.out.println("Digite o Nome da Raça: ");
                    String nome = obj.readLine();
                    System.out.println("Digite a Descrição da Raça: ");
                    String descricao = obj.readLine();                    
                    mesa.joinRaca(new Raca(nome,descricao,habilidade));
                    System.out.println("Raca " + nome + " criada com SUCESSO!");
                    break;
                case 11:
                    sair = 1;
                    break;
                default:
                    System.out.println("A OPÇÃO NÃO EXISTE!");  
            }       
        }      
                       
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
        
       // habilidadeGue.add(forcaDeUrso);
        habilidadeMag.add(livroDeMagia);
        
        //Raca Guerreiro = new Raca("Guerreiro","Defesa e ataque equilibrados, mas não utiliza magia",habilidadeGue);
        Raca Mago = new Raca("Mago","Pouca Defesa e boa Magia",habilidadeMag);
        
        mesa.joinRaca(Mago);
        //mesa.joinRaca(Guerreiro);
        
        
        
        
        
        
        
        
    }
    
}
