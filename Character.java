
package textrpg;
/*
 * @author Saad_Ahmed_Pathan_22114077
 */
public abstract class Character {
    
    //this is a super class
    
    //variables or attributes all characters have
    public String name;
    public int maxHP, hp, xp;
    
    //constructor for character
    public Character(String name, int maxHP, int xp){
        this.name = name;
        this.maxHP = maxHP;
        this.xp = xp;
        this.hp = maxHP;
    }
    
    //methods every character has
    public abstract int attack();
    public abstract int defend();
    
}
