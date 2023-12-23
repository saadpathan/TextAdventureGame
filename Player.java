
package textrpg;
/*
 * @author Saad_Ahmed_Pathan_22114077
 */
public class Player extends Character {
    
    //this Player class will inherit everything from super class Character
    
    //integers to store number of upgrades/skills in each path
    public int numAtkUpgrades, numDefUpgrades;
    
    //arrays to store skill names
    public String[] atkUpgrades = {"Strength", "Power", "Might", "Super Strength"};
    public String[] defUpgrades = {"Heavy Bones", "Stoneskin", "Scale Armor", "Holy Aura"};
    
    //player specific constructor
    public Player(String name) {
        //calling contructor of super class
        super(name, 100, 0);
        
        //setting # of upgrades to 0
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;
        
        //let the player choose a trait when creating a new character
        chooseTrait();
    }
    
    //player specific methods ( more in the next part )
    @Override
    public int attack() {
        return 0; 
    }

    @Override
    public int defend() {
        return 0; 
    }
    
    //let the player choose a trait of either skill path
    public void chooseTrait(){
        
        GameLogic.clearConsole();
        GameLogic.printHeading("Choose a trait: ");
        System.out.println("(1) " +atkUpgrades[numAtkUpgrades]);
        System.out.println("(2) " +defUpgrades[numDefUpgrades]);
        
        //get the players choice
        int input = GameLogic.readInt("-> ", 2);
        GameLogic.clearConsole();
        
        //deal with both cases
        if (input == 1) {
            GameLogic.printHeading("You choose " +atkUpgrades[numAtkUpgrades] + "!");
            numAtkUpgrades++;
        }else{
            GameLogic.printHeading("You choose " +defUpgrades[numDefUpgrades] + "!");
            numDefUpgrades++;
        }
        GameLogic.anythingToContinue();
    }
    
}
