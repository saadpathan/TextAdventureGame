
package textadventuregame;
/*
 * @author Saad_Ahmed_Pathan_22114077
 */
// Warrior class
public class Warrior extends Archetypes {
    public Warrior() {
        super(300, 50, 80, 20, 70, 50);
    }
    
    // ... existing code ...

    @Override
    public void displayCharacterInfo() {
        super.displayCharacterInfo();
        System.out.println("Warrior-specific Information:");
        // Add any additional information specific to the Warrior class
    }
    
    
    
    @Override
    public void levelUp() {

        healthPoints += 15;
        physicalDefence += 10;
        magicalDefence += 5;
        physicalAttack += 12;
        magicalAttack += 5;
    }
    
}


    // Additional methods or properties specific to Warrior can be added here
