/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesa;

/**
 *
 * @author JoãoVitor
 */
import java.util.Random;
import java.util.Arrays;

public class Dado {
    
    public static Dado self;
    
    protected Dado(){
        self = this;
    }
    
    public Dado getInst(){
        return self;
    }
    
    public int rodarDados(int lados, int qtd){
        int soma = 0;
        int[] dados;
        
        if(MesaRPG.DEBUG_MODE){
            dados = new int[lados];
        }
        
        Random gerador = new Random();
        
        for(int i = 0; i < qtd; i++){
            int lado = gerador.nextInt(lados) + 1;
            soma += lado;
            
            if(MesaRPG.DEBUG_MODE){
                dados[i] = lado; 
                System.out.println();
            }
        }
        
        if(MesaRPG.DEBUG_MODE){                    
            System.out.println(String.join(" + ", Arrays.toString(dados)) + " = " + soma);
        }
        
        return soma;
    }
    
    public int rodarDados(String tipo){
        int lados, qtd;
        
        try {
            qtd = Integer.parseInt(String.valueOf(tipo.charAt(0)));
            lados = Integer.parseInt(String.valueOf(tipo.charAt(2)));
        } catch (Exception e) {
            System.out.println("ERROR: Dtring passada no formato invalido");
            return -1;
        }
        
        return rodarDados(qtd, lados);
    }
}
