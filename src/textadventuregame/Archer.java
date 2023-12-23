/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textadventuregame;

/**
 *
 * @author Hp
 */

// Archer class
public class Archer extends Archetypes {
    public Archer() {
        super(240, 60, 65, 50, 45, 30);
    }
    
    @Override
    public void displayCharacterInfo() {
        super.displayCharacterInfo();
        System.out.println("Archer-specific Information:");
        // Add any additional information specific to the Warrior class
    }

    // Additional methods or properties specific to Archer can be added here
}

