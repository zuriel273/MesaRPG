/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import mesa.Criatura;
import mesa.Dado;
import mesa.TesteCommand;

/**
 *
 * @author JoãoVitor
 */
public class TesteAtaque implements TesteCommand{
    
    @Override
     public boolean teste(Criatura ativa, Criatura passiva){
        return testeAsInt(ativa, passiva) != 0;
    }
    
    @Override
    public int testeAsInt(Criatura ativa, Criatura passiva){
        int ataque, defesa;
        
        /*------ ATAQUE -------*/
        
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in)); 
        String entrada = "";
        
        System.out.println("Coloque ataque ou precione enter para jogar o dado");
        
        try { entrada = reader.readLine(); } catch (IOException ex) { }
        
        ataque = entrada.isEmpty() ? Dado.getInst().rodarDados("1d6") : Integer.parseInt(entrada);
        System.out.println("Ataque: " + ativa.getRaca().getNome() + " tirou " + ataque);
        
        /*------ DEFESA -------*/
        
        entrada = "";
        
        System.out.println("Coloque defesa ou precione enter para jogar o dado");
        
        try { entrada = reader.readLine(); } catch (IOException ex) {}
        
        defesa = entrada.isEmpty() ? Dado.getInst().rodarDados("1d6") : Integer.parseInt(entrada);
        System.out.println("Defesa: " + passiva.getRaca().getNome() + " tirou " + defesa);
        
        return ataque > defesa ? 1 : 0;
    }
}
