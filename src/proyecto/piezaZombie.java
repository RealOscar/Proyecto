/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;

/**
 *
 * @author joxhe
 */
public class piezaZombie extends Pieza{
    public piezaZombie(int pos_x,int pos_y,boolean player){
        super(2,pos_x,pos_y,player);
        tipo = piezaTipo.ZOMBIE;
        moves.add(new Position(posPieza));
    }

    @Override
    public int attackZombie() {
        return 0;
    }

    @Override
    public int attackWolf() {
        return 0;
    }

    @Override
    public int attackVampire() {
        return 0;
    }

    @Override
    public int attackDeath() {
        return 0;
    }

    @Override
    public ArrayList<Position> movePieza() {
        return moves;
    }

    
    
}
