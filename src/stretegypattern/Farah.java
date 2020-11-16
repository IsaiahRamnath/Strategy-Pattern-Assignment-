
package stretegypattern;


public class Farah extends Characters{
     
    //OPERATOR ATTACKS
    Farah(){
        attackC = new StoppingPower();
        attackC = new Laser();
    }

    @Override
    public void displayAttackX() {
        System.out.println("\t Stopping Power Attack for increased bullet damage!");
    }

    @Override
    public void displayAttackY() {
        System.out.println("\t Laser attack for increased accuracy!");
    }
    
}
