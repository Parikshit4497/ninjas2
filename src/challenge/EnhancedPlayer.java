package challenge;

public class EnhancedPlayer {
    private String name;
    private int hitpoints =100;
    private String Weapon;
    public EnhancedPlayer(String name, int hitpoints, String Weapon)
    {
        this.name=name;
        if(hitpoints >0&& hitpoints <100)
        {
            this.hitpoints = hitpoints;
        }
        this.Weapon=Weapon;
    }
    public void loseHealth(int damage)
    {
        this.hitpoints =this.hitpoints -damage;
        if(this.hitpoints <=0)
        {
            System.out.println("Player knocked out:");
        }
    }

    public int getHealth() {
        return hitpoints;
    }
}
