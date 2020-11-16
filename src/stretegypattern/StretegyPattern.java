
package stretegypattern;

import java.util.Scanner;

public class StretegyPattern {

    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         Integer choice = null;
         boolean check = false;
         String name;
         int age = 0;
         Integer weapon = null;
         Integer option = null;
         
         
         //OPERATOR MENU
         System.out.println("\n Choose the character you would like to battle with!"
         + "\n \t 1: Buck"
         + "\n \t 2: Nikto"
         + "\n \t 3: Farah");
        
         
         //Exception Handling
         do{
             try{
                 System.out.print("\n Operator selection: ");
                 option = input.nextInt();
                 check = true;
             } catch(Exception e){
             System.out.println("Please enter an integer");
             input.next();
             check = false;
         }
         }while(!check);
         
         
         //WEAPON MENU
         switch (option){
             
             
             //BUCK WEAPON OPTIONS          
             case 1:
                 Characters buck = new Buck();
                 buck.performAttack();
                 System.out.println("\t I am a STEALTH operator <> Quick and Accurate Kills!");
                 System.out.println("Select a weapon:" + "\n \t 1: MP5" + "\n \t 2: UZI");
                 
             try{
                     System.out.print("\n Weapon Choice: ");
                     weapon = input.nextInt();
                     check = true;
                     if (weapon.equals(1)){
                         buck.displayAttackX();
                     }
                     else if (weapon.equals(2)){
                         buck.displayAttackY();
                     }
                     else{
                         System.err.println("You didn't choose a weapon from the choices");
                     }
                 }catch (Exception e){
                     System.err.println("Invalid choice.");
                     input.next();
                     check = false;
                 }
                 break;
                 
                 
            //NIKTO WEAPON OPTION                 
             case 2:
                 Characters nikto = new Nikto();
                 nikto.performAttack();
                 System.out.println("\n \t I am a MELEE operator <> Effective Close Encounter Kills!");
                 System.out.println("Only 1 Weapon available: Bayonet");
                 do{
                     try{
                         System.out.print("Enter Digit 1 -> ");
                         weapon = input.nextInt();
                         nikto.displayAttackX();
                         check = true;
                     }catch (Exception e){
                         System.err.println("\t You didn't choose a weapon (1).");
                         input.next();
                         check = false;
                     }
                 }while (check == false);
                 
                 break;
             
                 
             //FARAH WEAPON OPTIONS 
             case 3:
                 Characters farah = new Farah();
                 farah.performAttack();
                 System.out.println("\t I am a Demolition operator <> Fast and Accurate Kills!");
                 System.out.println("Select a weapon:" + "\n \t 1: M16" + "\n \t 2: MP5");
                 
                 try{
                     System.out.print("\n Weapon Choice: ");
                     weapon = input.nextInt();
                     check = true;
                     if (weapon.equals(1)){
                         farah.displayAttackX();
                     }
                     else if (weapon.equals(2)){
                         farah.displayAttackY();
                     }
                     else{
                         System.err.println("You didn't choose a weapon from the options.");
                     }
                 }catch (Exception e){
                     System.err.println("Invalid choice.");
                     input.next();
                     check = false;
                 }
                 break;
               
                 
             //INVAILD OPTION WARNING
             default:
                 System.err.println("\t There are no operators with that choice! Choose from options 1-3.");
                                 
         }        
    }
    }


