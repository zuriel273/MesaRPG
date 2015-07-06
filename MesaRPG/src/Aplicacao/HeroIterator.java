/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import java.util.List;
import mesa.Criatura;
import mesa.CriaturaIterator;
import mesa.NPC;
import mesa.Personagem;

/**
 *
 * @author JoãoVitor
 */
public class HeroIterator implements CriaturaIterator{
    
    List<Criatura> criaturas;
    int turno, atual;
    
    public HeroIterator(List<Criatura> criaturas){
        this.criaturas = criaturas;
        
        turno = 0;
        atual = 0;
    }
    
    @Override
    public Criatura primeiro() {
        return criaturas.get(0);
    }

    @Override
    public Criatura proximo() {
        atual ++;
        
        if(atual >= criaturas.size()){
            atual = 0;
            turno++;
        }
        
        return criaturas.get(atual);
    }

    @Override
    public Criatura atual() {
        return criaturas.get(atual);
    }

    @Override
    public int fimDeBatalha() {
        boolean inimigos = false, jogadores = false;
        
        for (Criatura criatura : criaturas) {
            if (criaturas instanceof Personagem && !criatura.morto()) {
                jogadores = true;
            }
            
            if (criaturas instanceof NPC && !criatura.morto()) {
                inimigos = true;
            }
            
            if(inimigos && jogadores) return 0;
        }
        
        if(!inimigos && !jogadores) return DRAW_WIN;
        if(jogadores) return PLAYER_WIN;
        if(inimigos) return ENEMYS_WIN;
        
        return 0;
    }

    @Override
    public int turno() {
        return turno;
    }
    
}
