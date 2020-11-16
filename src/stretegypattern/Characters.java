
package stretegypattern;


public abstract class Characters {
    Attack attackC;
    
    //WEAPON ATTACKS FOR MAIN
    public abstract void displayAttackX();
    public abstract void displayAttackY();
    
    public void performAttack(){
        attackC.attack();
    }
    
    
    
}
