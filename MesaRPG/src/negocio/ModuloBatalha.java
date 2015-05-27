/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

/**
 *
 * @author Arlindo
 */
public abstract class ModuloBatalha {
   
    protected GrupoCriatura grupo;
   
   final void decorreBatalha(){
   
   }
   
    abstract void emBatalha();
    abstract boolean acao();
    abstract boolean encerraBatalha();
    abstract boolean reacao();
        
    
}
