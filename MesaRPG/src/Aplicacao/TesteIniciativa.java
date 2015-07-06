/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aplicacao;

import mesa.*;
        
/**
 *
 * @author JoãoVitor
 */
public class TesteIniciativa implements TesteCommand {
    
    @Override
     public boolean teste(Criatura ativa, Criatura passiva){
        return testeAsInt(ativa, passiva) != 0;
    }
    
    @Override
    public int testeAsInt(Criatura ativa, Criatura passiva){
        int dado = Dado.getInst().rodarDados("1d6");
        System.out.println("Iniciativa: " + ativa.getRaca().getNome() + " tirou " + dado);
        
        return dado;
    }
    
}
