//by Troy carson
import java.util.Scanner; 
public class Character{
  Scanner keyboard = new Scanner(System.in);
  int health;
  int dexterity;
  int strength;
  int ranged;
  int armorClass;
  String name = new String(); 
  public Character(String n){
    name = n;
    health = (int)math.random(20)+1;
    dexterity = (int)math.random(20)+1;
    strength = (int)math.random(20)+1;
    ranged = (int)math.random(20)+1;
    armorClass = dexterity;
  }
  
  public Character(int h,int d, int s, int r, int ac, String n){
    health = h;
    dextarity = d;
    strength = s;
    ranged = r;
    armorClass = ac;
    name = n;
  }
  
  public int selectMove(){//for combat 1=melee 2=ranged 3=skip
    if (keyboard.nextLine() == 1){
      return 1;
    }
    if (keyboard.nextLine() == 2){
      return 2;
    }
    if (keyboard.nextLine() == 3){
      return 3;
    }
    
  }
  
  public void getHealth(){return health;}
  public void getDexterity(){return dexterity;}
  public void getStrength(){return strength;}
  public void getRanged(){return ranged;}
  public void getArmorClass(){return armorClass;}
  
  public void addHealth(int additionalHealth){health += additionalHealth;}
  public void minusHealth(int subtractedHealth){health -= subtractedHealth;}
  public void addDexterity(int additionalDexterity){dexterity += additionalDexterity;}
  public void minusDexterity(int subtractedDexterity){dexterity -= subtractedDexterity;}
  public void addStrength(int additionalStrength){strength += additionalStrength;}
  public void minusStrength(int subtractedStrength){strength -= subtractedStrength;}
  public void addRanged(int additionalRanged){ranged += additionalRanged;}
  public void minusRanged(int subtractedRanged){ranged -= subtractedRanged;}
  public void addArmorClass(int additionalArmorHealth){armorClass += additionalArmorClass;}
  public void minusArmorClass(int subtractedArmorClass){armorClass -= subtractedArmorClass;}
}