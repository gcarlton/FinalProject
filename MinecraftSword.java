
/**
 * Write a description of class MinecraftSword here.
 *
 * @author (Gabe Carlton)
 * @version (a version number or a date)
 */
public class MinecraftSword
{
    private String Wooden;
    private String Stone;
    private String Iron;
    private String Gold;
    private String Diamond;
    private String Sword;
    private Netherite netherite;
    private int damage;
    private String SwordInfo;
  public MinecraftSword(){
      Wooden = "Wooden Sword";
      Stone = "Stone Sword";
      Iron = "Iron Sword";
      Gold = "Gold Sword";
      Diamond = "Diamond Sword";
  }
  /**
     * Constructor for objects of class MinecraftSword
     * @param Wooden is the Wooden Sword
     * @param Stone is the Stone sword
     * @param Iron is the Iron sword
     * @param Gold is the Gold Sword
     * @param Diamond is the diamond sword 
     * @param n is the special Netherite sword
     */
  public MinecraftSword(String Wooden, String Stone, String Iron, String Gold, String Diamond, Netherite n){
      this.Wooden = Wooden;
      this.Stone = Stone;
      this.Iron = Iron;
      this.Gold = Gold;
      this.Diamond = Diamond;
      this.netherite = n;
  }
  public MinecraftSword(String swordinfo, int dmg){
      this.damage = dmg;
      this.SwordInfo = swordinfo;
  }
  public String getSwordinfo(){
      return SwordInfo;
  }
  public void setSwordInfo(String Info){
      SwordInfo = Info;
  }
  public int getDamage(){
      return damage;
  }
  public void setDamage(int dmg){
      damage = dmg;
  }
}
