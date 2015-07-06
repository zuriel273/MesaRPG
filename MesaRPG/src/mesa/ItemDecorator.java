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
public abstract class ItemDecorator extends Item{
    private Item item;

    public ItemDecorator(Item item, String descricao, String nome, int ataque, int defesa, int magia) {
        super(descricao, nome, ataque, defesa, magia);
        this.item = item;
    }

    public ItemDecorator(Item it) {
        super(it);       
    }
    
    

    @Override
    public String getNome() {
        return item.getNome() + " + " + super.getNome();
    }
    
    @Override
    public String getDescricao(){
        return item.getDescricao() + " + " + super.getDescricao();
    }
    
    @Override
    public int getAtaque(){
        return item.getAtaque() * super.getAtaque();
    }    
    
    @Override
    public int getDefesa(){
        return item.getDefesa() * super.getDefesa();
    }
    
    @Override
    public int getMagia(){
        return item.getMagia() * super.getMagia() ;
    }
    
    
    
}
