
package textrpg;
import java.util.Random;
import java.util.Scanner;
/*
 * @author Saad_Ahmed_Pathan_22114077
 */
public class TextRPG_01 {
    
    private String name;
    private int healthPoints;
    private int magicPoints;
    private int physicalDefence;
    private int magicalDefence;
    private int physicalAttack;
    private int magicalAttack;
    private int level;

    public TextRPG_01(String name, int healthPoints, int magicPoints, int physicalDefence,
                     int magicalDefence, int physicalAttack, int magicalAttack) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.magicPoints = magicPoints;
        this.physicalDefence = physicalDefence;
        this.magicalDefence = magicalDefence;
        this.physicalAttack = physicalAttack;
        this.magicalAttack = magicalAttack;
        this.level = 1;
    }

    public void displayDetails() {
        System.out.println("Character Details:");
        System.out.println("Name: " + name);
        System.out.println("Health Points: " + healthPoints);
        System.out.println("Magic Points: " + magicPoints);
        System.out.println("Physical Defence: " + physicalDefence);
        System.out.println("Magical Defence: " + magicalDefence);
        System.out.println("Physical Attack: " + physicalAttack);
        System.out.println("Magical Attack: " + magicalAttack);
        System.out.println("Level: " + level);
    }

    public void levelUp() {
        if (level < 35) {
            level++;
            System.out.println("Level up! New level: " + level);
        } else {
            System.out.println("Maximum level reached: " + level);
        }
    }

    // Add getters and setters as needed
}

// Monster class representing the enemies
class Monster {
    private int healthPoints;
    private int magicPoints;

    public Monster(int healthPoints, int magicPoints) {
        this.healthPoints = healthPoints;
        this.magicPoints = magicPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    // Add methods for monster actions in battles
}

// Game class managing the main game loop and flow
public class TextAdventureGame {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Step 1: Introduction and Instruction
        System.out.println("Welcome to the Text Adventure RPG!");
        System.out.println("...");
        // (Provide introduction and instruction)

        // Step 2: Start or Quit
        int choice;
        do {
            System.out.println("1. Start Game");
            System.out.println("2. Quit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    playGame();
                    break;
                case 2:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 2);
    }

    private static void playGame() {
        // Step 3: Character Selection
        Character player = selectCharacter();
        player.displayDetails();

        // Step 4: Encounter Monster
        Monster monster = new Monster(400, 200);
        System.out.println("Monster Encounter!");
        System.out.println("Player's Health Points: " + player.getHealthPoints());
        System.out.println("Monster's Health Points: " + monster.getHealthPoints());

        // Step 5: Choose Attack Type
        int attackChoice;
        do {
            System.out.println("Choose your attack type:");
            System.out.println("1. Physical Defence");
            System.out.println("2. Magical Defence");
            System.out.println("3. Physical Attack");
            System.out.println("4. Magical Attack");

            attackChoice = scanner.nextInt();

            switch (attackChoice) {
                case 1:
                    // Handle Physical Defence
                    handleAttack(player, monster, player.getPhysicalDefence());
                    break;
                case 2:
                    // Handle Magical Defence
                    handleAttack(player, monster, player.getMagicalDefence());
                    break;
                case 3:
                    // Handle Physical Attack
                    handleAttack(player, monster, player.getPhysicalAttack());
                    break;
                case 4:
                    // Handle Magical Attack
                    handleAttack(player, monster, player.getMagicalAttack());
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (attackChoice >= 1 && attackChoice <= 4);
    }

    private static Character selectCharacter() {
        System.out.println("Select your character:");
        System.out.println("1. Warrior");
        System.out.println("2. Magician");
        System.out.println("3. Rogue");
        System.out.println("4. Paladin");
        System.out.println("5. Archer");

        int characterChoice = scanner.nextInt();

        switch (characterChoice) {
            case 1:
                return new Character("Warrior", 300, 50, 80, 20, 70, 50);
            case 2:
                return new Character("Magician", 200, 150, 30, 100, 20, 30);
            case 3:
                return new Character("Rogue", 250, 75, 60, 40, 50, 40);
            case 4:
                return new Character("Paladin", 350, 100, 70, 60, 80, 60);
            case 5:
                return new Character("Archer", 240, 60, 65, 50, 45, 30);
            default:
                System.out.println("Invalid choice. Defaulting to Warrior.");
                return new Character("Warrior", 300, 50, 80, 20, 70, 50);
        }
    }

    private static void handleAttack(Character player, Monster monster, int playerAttack) {
        Random random = new Random();
        int playerDamage = random.nextInt(playerAttack / 2) + playerAttack / 2;
        int monsterDamage = random.nextInt(monster.getHealthPoints() / 4) + monster.getHealthPoints() / 4;

        // Update health points
        player.setHealthPoints(player.getHealthPoints() - monsterDamage);
        monster.setHealthPoints(monster.getHealthPoints() - playerDamage);

        // Display outcomes
        System.out.println("Player dealt " + playerDamage + " damage to the monster!");
        System.out.println("Monster dealt " + monsterDamage + " damage to the player!");

        // Check for level up
        if (monster.getHealthPoints() <= 0) {
            player.levelUp();
            System.out.println("You defeated the monster and leveled up!");
        } else if (player.getHealthPoints() <= 0) {
            System.out.println("Game over. You were defeated by the monster.");
            System.exit(0);
        }
    }
}

    
}
