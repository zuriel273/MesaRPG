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

public class Dado {
    
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
        return 0;
    }
}
