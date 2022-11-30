
/**
 * Write a description of class MinecraftArmor here.
 *
 * @author (Gabe Carlton)
 * @version (a version number or a date)
 */
public class MinecraftArmor
{
    private String Leather;
    private String ChainMail;
    private String Iron;
    private String Gold;
    private String Diamond;
    private Netherite netherite;
    private int damageresistance;
    private String ArmorRes;
    public MinecraftArmor(){
        Leather = "Leather Armor";
        ChainMail = "ChainMail Armor";
        Iron = "Iron Armor";
        Gold = "Gold Armor";
        Diamond = "Diamond Armor";
    }
    /**
     * Constructor for objects of class MinecraftArmor
     * @param Leather is the leather armor
     * @param ChainMail is the chainmail armor
     * @param Iron is the iron armor
     * @param Gold is the gold armor 
     * @param Diamond is the diamond armor
     * @param n is the special Netherite armor
     */
    public MinecraftArmor(String Leather, String ChainMail, String Iron, String Gold, String Diamond, Netherite n){
        this.Leather = Leather;
        this.ChainMail = ChainMail;
        this.Iron = Iron;
        this.Gold = Gold;
        this.Diamond = Diamond;
        this.netherite = n;
    }
    public MinecraftArmor(String resistance, int dmgresistance){
        this.damageresistance = dmgresistance;
        this.ArmorRes = resistance;
    }
    public String getArmorRes(){
        return ArmorRes;
    }
    public void setArmorRes(String Resistance){
        ArmorRes = Resistance;
    }
    public int getDamageresistance(){
        return damageresistance;
    }
    public void setDamageresistance(int dmg){
        damageresistance = dmg;
    }
    }
