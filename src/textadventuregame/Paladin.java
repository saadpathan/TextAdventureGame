/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textadventuregame;

/**
 *
 * @author Hp
 */
// Paladin class
public class Paladin extends Archetypes {
    public Paladin() {
        super(350, 100, 70, 60, 80, 60);
    }
    
    @Override
    public void displayCharacterInfo() {
        super.displayCharacterInfo();
        System.out.println("Paladin-specific Information:");
        // Add any additional information specific to the Warrior class
    }

    // Additional methods or properties specific to Paladin can be added here
}