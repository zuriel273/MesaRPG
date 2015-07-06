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
public interface CriaturaIterator {
    
    public static final int ENEMYS_WIN = 2;    
    public static final int PLAYER_WIN = 1;
    public static final int DRAW_WIN = 3;

    public Criatura primeiro();
    public Criatura proximo();
    public Criatura atual();
    
    public int fimDeBatalha();
    public int turno();
}
