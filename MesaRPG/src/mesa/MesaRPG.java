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
    public ArrayList<Jogador> jogadores;
    public ArrayList<Criatura> currentNPCs;
    public ArrayList<Criatura> NPCs;
            
    public void joinJogador(Jogador jogador){
        jogadores.add(jogador);
    }
    
    public void removeJogador(Jogador jogador){
        if(!jogadores.remove(jogador)){
            System.out.println("Warning: Jogador não existe na lista de jogadores");
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
}
