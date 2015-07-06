/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mesa;

/**
 *
 * @author Arlindo
 */
public abstract class ModuloBatalha {
   
    protected GrupoCriatura grupo;
    protected TesteCommand iniciativa;
    
    final void decorreBatalha(){
        if(iniciativa == null){
            System.out.println("iniciativa não pode ser nula");
            return;
        }
            
        for(CriaturaIterator it = grupo.ordenarGrupo(iniciativa); it.fimDeBatalha() == 0; it.proximo()){
            emBatalha(it);
        }
        
        encerraBatalha(false);
    }
   
    abstract void emBatalha(CriaturaIterator it);
    
    abstract boolean encerraBatalha(boolean forced);
    
    /* Getters & Setters */
    
    final public void setIniciativa(TesteCommand teste){
        iniciativa = teste;
    }
    
}
