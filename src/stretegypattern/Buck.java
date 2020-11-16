
package stretegypattern;


public class Buck extends Characters{
    
    //OPERATOR ATTACKS
    Buck(){
        attackC = new Laser();
        attackC = new RapidFire();
    }

    @Override
    public void displayAttackX() {
        System.out.println("\t Laser attack for increased accuracy!");
    }

    @Override
    public void displayAttackY() {
                System.out.println("\t Rapid Fire attack for faster fire rate!");

    }
    
}
