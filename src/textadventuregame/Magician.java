/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textadventuregame;

/**
 *
 * @author Hp
 */
// Magician class
public class Magician extends Archetypes {
    public Magician() {
        super(200, 150, 30, 100, 20, 30);
    }
    
    @Override
    public void displayCharacterInfo() {
        super.displayCharacterInfo();
        System.out.println("Magician-specific Information:");
        // Add any additional information specific to the Warrior class
    }

    // Additional methods or properties specific to Magician can be added here
}
