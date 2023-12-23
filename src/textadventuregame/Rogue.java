/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textadventuregame;

/**
 *
 * @author Hp
 */
// Rogue class
public class Rogue extends Archetypes {
    public Rogue() {
        super(250, 75, 60, 40, 50, 40);
    }
    
    // ... existing code ...

    @Override
    public void displayCharacterInfo() {
        super.displayCharacterInfo();
        System.out.println("Rogue-specific Information:");
        // Add any additional information specific to the Warrior class
    }

    // Additional methods or properties specific to Rogue can be added here
}