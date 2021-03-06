/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HeroKids;

import java.util.ArrayList;
import java.util.List;
import mesa.*;

/**
 *
 * @author JoãoVitor
 */
public class HeroGrupo implements GrupoCriatura{
    
    private List<Criatura> criaturas = new ArrayList<Criatura>();
    
    @Override
    public CriaturaIterator ordenarGrupo(TesteCommand teste) {
        List<Criatura> criaturasOrder = new ArrayList<Criatura>();
        int[] iniciativa = new int[criaturas.size()];
                
        for(int i = 0; i < criaturas.size(); i++){
            iniciativa[i] = teste.testeAsInt(criaturas.get(i), null);
            
            int j = 0;
            for(j = 0; j <= criaturasOrder.size(); j++){
                if(iniciativa[j] < iniciativa[i]) 
                    break;
                
                if(iniciativa[j] == iniciativa[i] &&
                   (criaturasOrder.get(j) instanceof NPC) && 
                   (criaturas.get(i) instanceof Personagem)
                ) 
                    break;
            }
            
            criaturasOrder.add(j, criaturas.get(i));
        }
        
        return new HeroIterator(criaturasOrder);
    }

    @Override
    public boolean adicionarCriatura(Criatura criatura) {
        try {
            criaturas.add(criatura);
            return true;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean adicionarCriatura(List<Criatura> criaturas) {
        try {
            this.criaturas.addAll(criaturas);
            return true;
            
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean removeCriatura(Criatura criatura) {
        boolean attempt = criaturas.remove(criatura);
        
        if(!attempt){
            System.out.println("Criatura " + criatura + " não encontrada");
        }
        
        return attempt;
    }

    @Override
    public int numeroCriatura() {
        return criaturas.size();
    }
    
    public ArrayList<Criatura> getAllNPCs(){
        ArrayList<Criatura> npcs = new ArrayList<>();
        
        criaturas.stream().forEach((criatura) -> {
            if(criatura instanceof NPC) npcs.add(criatura);
        });
        
        return npcs;
    }
    
    public ArrayList<Criatura> getAllPlayer(){
        ArrayList<Criatura> players = new ArrayList<>();
        
        criaturas.stream().forEach((criatura) -> {
            if(criatura instanceof Personagem) players.add(criatura);
        });
        
        return players;
    }
}
