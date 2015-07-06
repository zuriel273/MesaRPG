/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HeroKids;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import mesa.*;

/**
 *
 * @author Arlindo
 */
public class HeroKids {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        MesaRPG mesa = new MesaRPG();        
        String entrada,aux1,aux2,descricao,nome;
        int auxi, auxii, auxiii;
        BufferedReader obj = new BufferedReader(new InputStreamReader (System.in)); 
        int sair = 0;
        int opcao;
       
        ArrayList<Atributo> atributos = new ArrayList<>();
        ArrayList<Habilidade> habilidade = new ArrayList<>();
        ArrayList<Item> itens = new ArrayList<>();
        Raca r = new Raca("","" ,habilidade);
        Personagem p = new Personagem("", null, null, null, 1, 1);
        //Objeto it = new Objeto(null);
        //Escudo esc = new Escudo(null);
        //Espada esp = new Espada(null);
        //ChapeuMago mag = new ChapeuMago(null);
        boolean b;
             
        mesa.setTitulo("HERO KIDS");
       
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
            System.out.println("11 - SAIR ");
            System.out.println("------------------------------------------------------------------------------");
            System.out.print("Digite a opção desejada: ");
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
                    nome = obj.readLine();
                    System.out.println("Digite a Descrição da Raça: ");
                    descricao = obj.readLine();                    
                    mesa.joinRaca(new Raca(nome,descricao,habilidade));
                    System.out.println("Raca " + nome + " criada com SUCESSO!");
                    break;
                case 3:                    
                    System.out.println("Digite o Nome do Atributo: ");
                    nome = obj.readLine();
                    System.out.println("Digite a Descrição do Atributo: ");
                    descricao = obj.readLine(); 
                    System.out.println("Digite o Valor do Atributo: ");
                    entrada = obj.readLine();
                    auxi = Integer.parseInt(entrada);
                    mesa.joinAtributo(new Atributo(auxi, nome, descricao));
                    System.out.println("Atributo " + nome + " criado com SUCESSO!");
                    break;
                case 4:
                    System.out.println("Digite o Nome da Habilidade: ");
                    nome = obj.readLine();
                    System.out.println("Digite a Descrição da Habilidade: ");
                    descricao = obj.readLine(); 
                    System.out.println("Digite o Valor modificador da Habilidade: ");
                    entrada = obj.readLine();
                    auxi = Integer.parseInt(entrada);
                    atributos = new ArrayList<>();                    
                    while (sair == 0){                         
                         int i = 0;                        
                         for(i = 0; i < mesa.getAtributos().size();i++){
                              System.out.println( i + " - Nome:" + mesa.getAtributos().get(i).getNome() + " Valor:" + mesa.getAtributos().get(i).getValor());
                         }                                                     
                         System.out.println("-----------------------------------------------------------");
                         System.out.println("Atributos já selecionados: ");
                         for(i = 0; i < atributos.size(); i++){
                             System.out.printf(" ");
                             System.out.printf(atributos.get(i).getNome());
                             System.out.println(" "); 
                         }
                         System.out.println("-----------------------------------------------------------");                         
                         System.out.println("Digite o Atributo desejado ou 99 para voltar ao menu anterior: ");
                         entrada = obj.readLine();
                         opcao = Integer.parseInt(entrada);                         
                         if (opcao == 99){
                             sair = 1;
                         }                         
                         if(opcao < mesa.getAtributos().size()){
                            atributos.add(mesa.getAtributos().get(opcao));
                         }
                    }                    
                    mesa.joinHabilidades(new Habilidade(nome, descricao, auxi, atributos));
                    sair = 0;
                    break;
                case 5:
                    for(int i = 0; i < mesa.getRacas().size();i++){
                              System.out.println( i + " - Nome:" + mesa.getRacas().get(i).getNome() + " Descrição:" + mesa.getRacas().get(i).getDescricao());
                         }  
                    System.out.println("(Aperte ENTER para voltar) ");
                    entrada = obj.readLine();
                    break;
                case 6:
                   for(int i = 0; i < mesa.getAtributos().size();i++){
                              System.out.println( i + " - Nome:" + mesa.getAtributos().get(i).getNome() + " Valor:" + mesa.getAtributos().get(i).getValor());
                         }     
                    System.out.println("(Aperte ENTER para voltar) ");
                    entrada = obj.readLine();
                    break;
                case 7:
                    for(int i = 0; i < mesa.getHabilidades().size();i++){
                        System.out.println( i + " - Nome:" + mesa.getHabilidades().get(i).getNome() + " Modificador:" + mesa.getHabilidades().get(i).getModificador());
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Atributos modicados pela Habilidade: ");
                        for(int y = 0; y < mesa.getHabilidades().get(i).getAtributos().size(); y++){
                            System.out.printf(" ");
                            System.out.printf(mesa.getHabilidades().get(i).getAtributos().get(y).getNome() + " Valor:" + mesa.getHabilidades().get(i).getAtributos().get(y).getValor());
                            System.out.println(" "); 
                        }
                        System.out.println("-----------------------------------------------------------");
                    }     
                    System.out.println("(Aperte ENTER para voltar) ");
                    entrada = obj.readLine();
                    break;
                case 11:
                    sair = 1;
                    break;
                default:
                    System.out.println("A OPÇÃO NÃO EXISTE!");  
            }       
        }
        
        sair = 0;
        
        while(sair == 0){
            System.out.println("Configurações do RPG " + mesa.getTitulo());
            System.out.println("1 - ADICIONAR JOGADOR ");
            System.out.println("2 - ADICIONAR PERSONAGEM");
            System.out.println("3 - ADICIONAR NPC");
           // System.out.println("4 - ADICIONAR ITEM"); 
           // System.out.println("5 - MESCLAR ITEM");
            System.out.println("11 - SAIR ");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("Digite a opção desejada: ");
            entrada = obj.readLine();
            opcao = Integer.parseInt(entrada);
            switch(opcao){
                case 1:
                    System.out.println("Digite o Nome do Jogador: ");
                    nome = obj.readLine();
                    
                    while (sair == 0){                         
                        int i = 0;                        
                        for(i = 0; i < mesa.getPersonagens().size();i++){
                             System.out.println( i + " - Nome:" + mesa.getPersonagens().get(i).getNome() + " Raça:" + mesa.getPersonagens().get(i).getRaca().getNome() + " Level:" + mesa.getPersonagens().get(i).getLevel());
                        }                                                     
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Personagem selecionado: ");
                        System.out.printf(" ");
                        System.out.printf(p.getNome());
                        System.out.println(" "); 
                        System.out.println("-----------------------------------------------------------");                         
                        System.out.println("Digite o Personagem desejado ou 99 para voltar ao menu anterior: ");
                        entrada = obj.readLine();
                        opcao = Integer.parseInt(entrada);                         
                        if (opcao == 99){
                            sair = 1;
                        }                         
                        if(opcao < mesa.getPersonagens().size()){
                           p = mesa.getPersonagens().get(opcao); 
                           mesa.joinJogador(new Jogador(nome, p));
                        }
                        
                    }
                    sair = 0;
                    break;
                case 2:
                    System.out.println("Digite o Nome do Personagem: ");
                    nome = obj.readLine();                    
                    System.out.println("Digite o Valor do XP do Personagem: ");
                    entrada = obj.readLine();
                    auxi = Integer.parseInt(entrada);
                    System.out.println("Digite o Level do Personagem: ");
                    entrada = obj.readLine();
                    auxii = Integer.parseInt(entrada);
                    atributos = new ArrayList<>();    
                    r = new Raca("","" ,habilidade);
                    while (sair == 0){                         
                         int i = 0;                        
                         for(i = 0; i < mesa.getAtributos().size();i++){
                              System.out.println( i + " - Nome:" + mesa.getAtributos().get(i).getNome() + " Valor:" + mesa.getAtributos().get(i).getValor());
                         }                                                     
                         System.out.println("-----------------------------------------------------------");
                         System.out.println("Atributos já selecionados: ");
                         for(i = 0; i < atributos.size(); i++){
                             System.out.printf(" ");
                             System.out.printf(atributos.get(i).getNome());
                             System.out.println(" "); 
                         }
                         System.out.println("-----------------------------------------------------------");                         
                         System.out.println("Digite o Atributo desejado ou 99 para voltar ao menu anterior: ");
                         entrada = obj.readLine();
                         opcao = Integer.parseInt(entrada);                         
                         if (opcao == 99){
                             sair = 1;
                         }                         
                         if(opcao < mesa.getAtributos().size()){
                            atributos.add(mesa.getAtributos().get(opcao)); 
                         }
                    }   
                    sair = 0;
                    while (sair == 0){                         
                        int i = 0;                        
                        for(i = 0; i < mesa.getRacas().size();i++){
                             System.out.println( i + " - Nome:" + mesa.getRacas().get(i).getNome() + " Valor:" + mesa.getRacas().get(i).getDescricao());
                        }                                                     
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Raça selecionada: ");
                        System.out.printf(" ");
                        System.out.printf(r.getNome());
                        System.out.println(" "); 
                        System.out.println("-----------------------------------------------------------");                         
                        System.out.println("Digite a Raça desejada ou 99 para voltar ao menu anterior: ");
                        entrada = obj.readLine();
                        opcao = Integer.parseInt(entrada);                         
                        if (opcao == 99){
                            sair = 1;
                        }                         
                        if(opcao < mesa.getRacas().size()){
                           r = mesa.getRacas().get(opcao); 
                        }
                    }
                   
                    mesa.joinPersonagem(new Personagem(nome, itens, atributos, r, auxii, auxi));
                   
                    sair = 0;
                    break;
                case 3:
                    System.out.println("NPC ALIADO( DIGITE 1 ) OU INIMIGO ( DIGITE 2 ): ");
                    entrada = obj.readLine();             
                    auxiii = Integer.parseInt(entrada);
                    if(auxiii == 1){
                        b = true;
                    }else{
                        b = false;
                    }
                    System.out.println("Digite o Valor do XP do NPC: ");
                    entrada = obj.readLine();
                    auxi = Integer.parseInt(entrada);
                    System.out.println("Digite o Level do NPC: ");
                    entrada = obj.readLine();
                    auxii = Integer.parseInt(entrada);
                    atributos = new ArrayList<>();    
                    r = new Raca("","" ,habilidade);
                    while (sair == 0){                         
                         int i = 0;                        
                         for(i = 0; i < mesa.getAtributos().size();i++){
                              System.out.println( i + " - Nome:" + mesa.getAtributos().get(i).getNome() + " Valor:" + mesa.getAtributos().get(i).getValor());
                         }                                                     
                         System.out.println("-----------------------------------------------------------");
                         System.out.println("Atributos já selecionados: ");
                         for(i = 0; i < atributos.size(); i++){
                             System.out.printf(" ");
                             System.out.printf(atributos.get(i).getNome());
                             System.out.println(" "); 
                         }
                         System.out.println("-----------------------------------------------------------");                         
                         System.out.println("Digite o Atributo desejado ou 99 para voltar ao menu anterior: ");
                         entrada = obj.readLine();
                         opcao = Integer.parseInt(entrada);                         
                         if (opcao == 99){
                             sair = 1;
                         }                         
                         if(opcao < mesa.getAtributos().size()){
                            atributos.add(mesa.getAtributos().get(opcao)); 
                         }
                    }   
                    sair = 0;
                    while (sair == 0){ 
                         System.out.println("-----------------------------------------------------------");
                         System.out.println("SELECIONE UMA RAÇA");
                         System.out.println("-----------------------------------------------------------");
                        int i = 0;                        
                        for(i = 0; i < mesa.getRacas().size();i++){
                             System.out.println( i + " - Nome:" + mesa.getRacas().get(i).getNome() + " Valor:" + mesa.getRacas().get(i).getDescricao());
                        }                                                     
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Raça selecionada: ");
                        System.out.printf(" ");
                        System.out.printf(r.getNome());
                        System.out.println(" "); 
                        System.out.println("-----------------------------------------------------------");                         
                        System.out.println("Digite o Atributo desejado ou 99 para voltar ao menu anterior: ");
                        entrada = obj.readLine();
                        opcao = Integer.parseInt(entrada);                         
                        if (opcao == 99){
                            sair = 1;
                        }                         
                        if(opcao < mesa.getRacas().size()){
                           r = mesa.getRacas().get(opcao); 
                        }
                    }                    
                    mesa.joinNPC(new NPC(b, itens, atributos, r, auxii, auxi));                                      
                    sair = 0;
                    break;
                case 4:
                    
                    System.out.println("Digite o Nome do Item: ");
                    nome = obj.readLine();
                    System.out.println("Digite a Descrição do Item: ");
                    descricao = obj.readLine();  
                    System.out.println("Digite o Valor de Ataque: ");
                    entrada = obj.readLine();
                    opcao = Integer.parseInt(entrada);                    
                    System.out.println("Digite o Valor de Defesa: ");
                    entrada = obj.readLine();
                    auxi = Integer.parseInt(entrada);
                    System.out.println("Digite o Valor de Magia: ");
                    entrada = obj.readLine();
                    auxii = Integer.parseInt(entrada);
                    System.out.println("Item de Ataque (Digite 1), Item de Defesa (Digite 2) ou Item de Magia (Digite 3): ");
                    entrada = obj.readLine();
                    auxiii = Integer.parseInt(entrada);                    
                    
                    if (auxiii == 1)
                        mesa.getItens().add(new Espada(descricao, nome,opcao,auxi, auxii));
                    else{
                        if (auxiii == 1)
                            mesa.getItens().add(new Escudo(descricao, nome,opcao,auxi, auxii));
                        else
                            mesa.getItens().add(new ChapeuMago(descricao, nome,opcao,auxi, auxii));
                    }
                    sair = 0;
                    break;/*
                case 5:
                    
                    while(sair == 0){
                        System.out.println("-----------------------------------------------------------");
                         System.out.println("SELECIONE OS ITEM QUE DESEJA MESCLAR:");
                         System.out.println("-----------------------------------------------------------");
                        int i = 0;
                        int y = 0;
                        System.out.println("ITEM 1");
                        System.out.println("-----------------------------------------------------------");
                        for(i = 0; i < mesa.getItens().size();i++){
                             System.out.println( i + " - Nome:" + mesa.getItens().get(i).getNome() + " Ataque" + mesa.getItens().get(i).getAtaque()+ " Defesa" + mesa.getItens().get(i).getDefesa()+ " Magia" + mesa.getItens().get(i).getMagia());
                        }                                                     
                        System.out.println("-----------------------------------------------------------");                                              
                        System.out.println("Digite o Item 1 desejado:");
                        entrada = obj.readLine();
                        opcao = Integer.parseInt(entrada);                         
                                              
                        if(opcao < mesa.getItens().size()){
                           it = (Objeto) mesa.getItens().get(opcao); 
                        }                        
                        
                        System.out.println("ITEM 2");
                        System.out.println("-----------------------------------------------------------");
                        for(i = 0; i < mesa.getItens().size();i++){
                             System.out.println( i + " - Nome:" + mesa.getItens().get(i).getNome() + " Ataque" + mesa.getItens().get(i).getAtaque()+ " Defesa" + mesa.getItens().get(i).getDefesa()+ " Magia" + mesa.getItens().get(i).getMagia());
                        }                                                     
                        System.out.println("-----------------------------------------------------------");                                              
                        System.out.println("Digite o Item 2 desejado:");
                        entrada = obj.readLine();
                        opcao = Integer.parseInt(entrada);                         
                                              
                        if(opcao < mesa.getItens().size()){
                           it = new Objeto(mesa.getItens().get(opcao)); 
                        }
                                         
                        mesa.getItens().add(new Objeto(it));
                    }
                    sair = 0;
                    break;*/
                case 11:
                    sair = 1;
                    break;
                default:
                    System.out.println("A OPÇÃO NÃO EXISTE!"); 
            }
        
        }
        sair = 0;
        while (sair == 0){
        //Config Aplicação
            System.out.println("Batalha do RPG " + mesa.getTitulo());
            System.out.println("1 - INICIAR BATALHA ");
            System.out.println("11 - FIM DE JOGO ");
            System.out.println("------------------------------------------------------------------------------");
            System.out.print("Digite a opção desejada: ");
            entrada = obj.readLine();
            opcao = Integer.parseInt(entrada);
            switch(opcao){
                case 1:
                    HeroGrupo grupo = new HeroGrupo();
                    grupo.adicionarCriatura(mesa.getCurrentGrounp());
                    
                    HeroModuloBatalha modulo = new HeroModuloBatalha(grupo, new TesteIniciativa());
                    
                    modulo.decorreBatalha();
                    
                    
                case 11:
                    sair = 1;
                    break;
                default:
                    System.out.println("A OPÇÃO NÃO EXISTE!");
            }
        
        }
                       
        
    }
    
}
