/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mesa;

import java.util.List;

/**
 *
 * @author Arlindo
 */

public interface GrupoCriatura {
    
    //public void criarCriaturaIterator();
    public CriaturaIterator ordenarGrupo(TesteCommand teste); //CreatInterator();
    public boolean adicionarCriatura(Criatura criatura); //Append(item);
    public boolean removeCriatura(Criatura criatura); //Remove(item)
    
    public int numeroCriatura();
}
