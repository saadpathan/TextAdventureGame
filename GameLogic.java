
package textrpg;
/*
 * @author Saad_Ahmed_Pathan_22114077
 */
import java.util.Scanner;
/*
 * @author Saad_Ahmed_Pathan_22114077
 */
public class GameLogic {
    
    static Scanner scanner = new Scanner(System.in);
    
    static Player player;
    
    //method to get user input from console
    public static int readInt(String prompt, int userChoices){
        int input;
        do {
            System.out.println(prompt);
            try{
                input = Integer.parseInt(scanner.next());
            }catch(Exception e){
                input = -1;
                System.out.println("Please enter an integer!");
            }
        } while (input < 1 || input > userChoices);
        
        return input;
        
    }
    
    //method to simulate clearing out the console
    public static void clearConsole(){
        
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
    
    //method to print a separator with length n
    public static void printSeparator(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    //method to print a heading
    public static void printHeading(String title){
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
    }
    
    //method to stop the game until user enters anything
    public static void anythingToContinue(){
        System.out.println("\nEnter anything to continue....");
        scanner.next();
    }
    
    //method to start the game
    public static void startGame(){
        boolean nameSet = false;
        String name;
        
        //print title screen
        clearConsole();
        printSeparator(40);
        printSeparator(30);
        System.out.println("AGE OF THE EVIL EMPEROR");
        printSeparator(30);
        printSeparator(40);
        anythingToContinue();
        
        //getting the player name
        do {
            clearConsole();
            printHeading("What's your name ?");
            name = scanner.next();
            
            //asking the player if he wants to correct his choice
            clearConsole();
            printHeading("Your name is " +name+ ".\nIs that correct ?");
            System.out.println("(1) Yes!");
            System.out.println("(2) No, I want to change my name.");
            
            int input = readInt("-> ", 2);
            if (input == 1) 
                nameSet = true;
        } while (!nameSet);
        
        //create new player object with the name
        player = new Player(name);
        
        //start main game loop (next part)
        //gameLoop();
    }
}
