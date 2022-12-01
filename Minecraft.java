
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Minecraft here.
 *
 * @author (Gabe Carlton)
 * @version (a version number or a date)
 */
public class Minecraft
{
    private Netherite netherite;
  public static void main(String[] args)
  {
      Scanner input = new Scanner (System.in);
      System.out.println("Welcome to Minecraft Simulator");
      System.out.println("The basic of this game is to pick what armor set and what sword you think will be best for your mob");
      System.out.println("Rules: You can only pick 1 armor set, and one sword");
      System.out.println("There is one option called Netherite that can defeat anything however you can only pick this once");
      System.out.println("Options for the Sword: Wooden, Stone, Iron, Gold, Diamond");
      System.out.println("Option for the Armor: Leather, ChainMail, Iron, Gold, Diamond");
      
      System.out.println("Difficulty Options: Easy Medium Hard");
      System.out.println("Pick your Difficulty");
      try{String Dif = input.nextLine();
      if(Dif.equalsIgnoreCase("Easy") || Dif.equalsIgnoreCase("Medium") || Dif.equalsIgnoreCase("Hard")){
          System.out.println(Dif);
      }else{
          throw new IllegalArgumentException("No such difficulty restart program");
      
    }}catch(IllegalArgumentException e){
          System.err.println("No such difficulty restart program");
      }
      System.out.println("This is the statistics of the swords and armor");
      ArrayList<MinecraftSword> sword = new ArrayList<MinecraftSword>();
      addSwordtolist(sword);
    for(int i = 0; i < sword.size(); i++){
          System.out.println(sword.get(i).getSwordinfo());
        }
          ArrayList<MinecraftArmor> armor = new ArrayList<MinecraftArmor>();
          addArmortolist(armor);
    for(int i = 0; i < armor.size(); i++){
              System.out.println(armor.get(i).getArmorRes());
          }
      String[] Swords = new String[5];
      Swords[0] = "Wooden";
      Swords[1] = "Stone";
      Swords[2] = "Iron";
      Swords[3] = "Gold";
      Swords[4] = "Diamond";
      String[] Armor = new String[5];
      Armor[0] = "Leather";
      Armor[1] = "ChainMail";
      Armor[2] = "Iron";
      Armor[3] = "Gold";
      Armor[4] = "Diamond";
      System.out.println("A Skeleton has Spawned, this mob does 2 damage, and 3 hearts choose wisely");
      System.out.println("Pick your armor");
      String Armor1 = input.nextLine();
      boolean wrongpick = false;
      
      for(int i = 0; i < Armor.length; i++){
          
          if(Armor1.equalsIgnoreCase(Armor[2]) || Armor1.equalsIgnoreCase(Armor[3]) || Armor1.equalsIgnoreCase(Armor[4])){
              
              System.out.println("Onto the Sword");
          wrongpick = true;
        }else{
              while(!wrongpick){
              System.out.println( "Game restarting");
          }
      }
    }
    

      System.out.println("Pick your sword");
      String Sword1 = input.nextLine();
     
      for(int i = 0; i < Swords.length; i++){
          if(Sword1.equalsIgnoreCase(Swords[2]) || Sword1.equalsIgnoreCase(Swords[3]) || Sword1.equalsIgnoreCase(Swords[4])){
              
              System.out.println("Onto the next mob");
              wrongpick = true;
          }else{
              while(wrongpick){
              System.out.println( "Game restarting");
      }
    }
    }
    
        System.out.println("A Zombie has Spawned, this mob does 1 damage, and has 2 hearts, choose wisely");
    System.out.println("Pick your armor");
    String Armor2 = input.nextLine();
      
      for(int j = 0; j < Armor.length; j++){
          
          if(Armor2.equalsIgnoreCase(Armor[1]) || Armor2.equalsIgnoreCase(Armor[2]) || Armor2.equalsIgnoreCase(Armor[3]) || Armor2.equalsIgnoreCase(Armor[4])){
              System.out.println("Onto the sword");
              wrongpick = true;
          }else{
              while(wrongpick){
              System.out.println( "Game restarting");
          }
      }
    }
    
    
        System.out.println("Pick your sword");
      String Sword2 = input.nextLine();
      
      for(int a = 0; a < Swords.length; a++){
        
          if(Sword2.equalsIgnoreCase(Swords[1]) || Sword2.equalsIgnoreCase(Swords[2]) || Sword2.equalsIgnoreCase(Swords[3]) || Sword2.equalsIgnoreCase(Swords[4])){
              System.out.println("Onto the next mob");
              wrongpick = true;
          }else{
              while(wrongpick){
              System.out.println( "Game restarting");
      }
    }
    }
    
    
    System.out.println("A EnderDragon Spawned");
    System.out.println("Hint: You can only use Netherite armor or sword");
    System.out.println("These are the possible Netherites:");
        for (Netherite n : Netherite.values()) {
            System.out.println(n);
        }
        System.out.println("Please enter one of the above Netherites: ");
        String netherite = input.nextLine();
        Netherite answer = Netherite.valueOf(netherite.toUpperCase());
         if (answer != null) {
            System.out.println(answer);
        } else {
            System.out.println(Netherite.UNKNOWN);
        }
        
        if(netherite.equalsIgnoreCase("ARMOR") || netherite.equalsIgnoreCase("SWORD")){
            System.out.println("Congrats Game Finished");
            wrongpick = true;
        }else{
            while(wrongpick){
            System.out.println( "Game restarting");
        }
    
    }   
}


   
/**
     * This method adds MinecraftSwords to a list.
     *
     * @param    list1    the list to add to
     */
public static void addSwordtolist(ArrayList<MinecraftSword> list1){
    MinecraftSword Wooden = new MinecraftSword("Wooden Sword Damage is 1" , 1);
    list1.add(Wooden);
    MinecraftSword Stone = new MinecraftSword("Stone Sword Damage is 2" , 2);
    list1.add(Stone);
    MinecraftSword Iron = new MinecraftSword("Iron Sword Damage is 3", 3);
    list1.add(Iron);
    MinecraftSword Gold = new MinecraftSword("Gold Sword Damage is 4" ,4);
    list1.add(Gold);
    MinecraftSword Diamond = new MinecraftSword("Diamond Sword Damage is 5", 5);
    list1.add(Diamond);
}
/**
     * This method adds MinecraftArmor to a list.
     *
     * @param    list2    the list to add to
     */
    public static void addArmortolist(ArrayList<MinecraftArmor> list2){
    MinecraftArmor Leather = new MinecraftArmor("Leather Armor Damage resistance is 1" ,1);
    list2.add(Leather);
    MinecraftArmor ChainMail = new MinecraftArmor("ChainMail Armor Damage resistance is 2" ,2);
    list2.add(ChainMail);
    MinecraftArmor Iron1 = new MinecraftArmor("Iron Armor Damage resistance is 3" ,3);
    list2.add(Iron1);
    MinecraftArmor Gold1 = new MinecraftArmor("Gold Armor Damage resistance is 4" ,4);
    list2.add(Gold1);
    MinecraftArmor Diamond1 = new MinecraftArmor("Diamond Armor Damage resistance is 5" ,5);
    list2.add(Diamond1);
    
  }
  
  
  
}
