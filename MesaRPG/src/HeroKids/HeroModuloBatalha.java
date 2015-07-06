/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HeroKids;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;
import mesa.Criatura;
import mesa.CriaturaIterator;
import mesa.GrupoCriatura;
import mesa.ModuloBatalha;
import mesa.NPC;
import mesa.Personagem;

/**
 *
 * @author JoãoVitor
 */

public class HeroModuloBatalha extends ModuloBatalha{

    public HeroModuloBatalha(GrupoCriatura grupo) {
        this.setGrupo(grupo);
    }

    @Override
    public void emBatalha(CriaturaIterator it) {
        String entrada = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));        
        Random gerador = new Random();
        Criatura atual = it.atual();
        TesteAtaque teste = new TesteAtaque();
        
        System.out.println("Encerra batalha? (Y / N)");
        try { entrada = reader.readLine(); } catch (IOException ex) {}
        
        if(entrada.toUpperCase().equals("Y")){
            it.forceFimBatalhar();
        }
            
        if(atual instanceof NPC){
            List<Criatura> players = ((HeroGrupo) getGrupo()).getAllPlayer();
            int pos = gerador.nextInt(players.size());
            
            Criatura pasiva = players.get(pos);
            
            if(teste.teste(atual, pasiva)){
                pasiva.setMorte(true);
            }
        
        }else if(atual instanceof Personagem){
            List<Criatura> npcs = ((HeroGrupo) getGrupo()).getAllNPCs();
            
            System.out.println("Escolha um inimigo");
            for(int i = 0; i < npcs.size(); i++){
                System.out.println((i + 1) + " " + npcs.get(i));
            }

            try { entrada = reader.readLine(); } catch (IOException ex) {}
            if(entrada.isEmpty()) entrada = "0";
            
            Criatura pasiva = npcs.get(Integer.getInteger(entrada));
            
            if(teste.teste(atual, pasiva)){
                pasiva.setMorte(true);
            }   
        } 
    }

    @Override
    public boolean encerraBatalha(CriaturaIterator it, boolean forced) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
