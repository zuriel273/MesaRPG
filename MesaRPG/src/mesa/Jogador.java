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
public class Jogador {
    private String name;
    private Personagem personagem;
    
    //Preenchendo ficha
    public Jogador(String name, Personagem personagem) {
        this.name = name;
        this.personagem = personagem;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }
    
    @Override
    public String toString(){
        return "name: " + name + "\n" +
               "personagem: " + personagem.getNome() + "\n";
    }
}
