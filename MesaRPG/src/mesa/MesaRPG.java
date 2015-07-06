/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesa;

import java.util.ArrayList;

/**
 *
 * @author JoãoVitor
 */

public class MesaRPG {
    
    public static final boolean DEBUG_MODE = true; 
    
    public String titulo;
    public ArrayList<Jogador> jogadores = new ArrayList<>();
    public ArrayList<Personagem> personagens = new ArrayList<>();
    public ArrayList<Criatura> currentNPCs = new ArrayList<>();
    public ArrayList<Criatura> NPCs = new ArrayList<>();
    public ArrayList<Raca> racas = new ArrayList<>();
    public ArrayList<Habilidade> habilidades = new ArrayList<>();
    public ArrayList<Atributo> atributos = new ArrayList<>();
    public ArrayList<Item> itens = new ArrayList<>();
   
            
    public void joinJogador(Jogador jogador){
        jogadores.add(jogador);
    }
    
    public void removeJogador(Jogador jogador){
        if(!jogadores.remove(jogador)){
            System.out.println("Warning: Jogador não existe na lista de jogadores");
        }
    }
    
    public void joinPersonagem(Personagem personagem){
        personagens.add(personagem);
    }
    
    public void removePersonagem(Personagem personagem){
        if(!personagens.remove(personagem)){
            System.out.println("Warning: Personagem não existe na lista de persongens");
        }
    }

    public ArrayList<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(ArrayList<Personagem> personagens) {
        this.personagens = personagens;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }

    public ArrayList<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<Atributo> atributos) {
        this.atributos = atributos;
    }

    public ArrayList<Raca> getRacas() {
        return racas;
    }

    public void setRacas(ArrayList<Raca> racas) {
        this.racas = racas;
    }
       
        
     public void joinRaca(Raca raca){
        racas.add(raca);
    }
    
    public void removeRaca(Raca raca){
        if(!racas.remove(raca)){
            System.out.println("Warning: Raça não existe na lista de raças");
        }
    }
    
    public void joinItem(Item item){
        itens.add(item);
    }
    
    public void removeItem(Item item){
        if(!itens.remove(item)){
            System.out.println("Warning: Item não existe na lista de itens");
        }
    }
    
    public void joinHabilidades(Habilidade habilidade){
        habilidades.add(habilidade);
    }
    
    public void removeHabilidade(Habilidade habilidade){
        if(!habilidades.remove(habilidade)){
            System.out.println("Warning: Habilidade não existe na lista de habilidades");
        }
    }
    
    public void joinAtributo(Atributo atributo){
        atributos.add(atributo);
    }
    
    public void removeAtributo(Atributo atributo){
        if(!atributos.remove(atributo)){
            System.out.println("Warning: Atributo não existe na lista de atributos");
        }
    }
    
    public void joinNPC(NPC npc){
        currentNPCs.add(npc);
    }
    
    public void removeNPC(NPC npc){
        if(!currentNPCs.remove(npc)){
            System.out.println("Warning: NPC não existe na lista dos NPC correntes");
        }
        currentNPCs.add(npc);
    }
    
    public NPC restoreNPC(NPC npc){
        if(!NPCs.remove(npc)){
            System.out.println("ERRO: Não foi possivel achar nenhum NPC com essa caracteristica");
            return null;
        }
        
        currentNPCs.add(npc);
        return npc;
    }
    
    public ArrayList<Criatura> getCurrentGrounp(){
        ArrayList<Criatura> group;
        group = new ArrayList<>();
        
        jogadores.stream().forEach((jogador) -> {
            group.add(jogador.getPersonagem());
        });
        
        group.addAll(currentNPCs);
        return group;
    }  

    public void listJogadores(){
        jogadores.stream().forEach((jogador) -> {
            System.out.println(jogador);
        });
    }
    
    public void listNpcs(){
        currentNPCs.stream().forEach((npc) -> {
            System.out.println(npc);
        });
    }
}
