
package stretegypattern;


public class Nikto extends Characters{
    
    //OPERATOR ATTACKS
    Nikto(){
        attackC = new Stomper();
        
    }

    @Override
    public void displayAttackX() {
        System.out.println("\t Stomper Attack for increased melee damage!");
    }

    @Override
    public void displayAttackY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
