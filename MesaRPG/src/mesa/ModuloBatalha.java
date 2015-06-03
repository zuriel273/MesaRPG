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
        for(CriaturaIterator it = grupo.ordenarGrupo(iniciativa); !it.fimDeBatalha(); it.proximo()){
            emBatalha(it);
        }
    }
   
    abstract void emBatalha(CriaturaIterator it);
    
    abstract boolean acao();
    abstract boolean encerraBatalha();
    abstract boolean reacao();
        
    
}
