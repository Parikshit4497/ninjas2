package ChallengeRevsion;

/**
class player
{
    public String name1 ;
    public int health ;
    public String weapon;/*any changes made here would  effect the entire program in small programs it is good but in big programs
    it becomes problematic
    public void loseHealth(int damage)
    {
        this.health=this.health-damage;
        if(this.health<=0)
        {
            System.out.println("Player knocked out");
            //Reduced number of lives remaining of the player
        }
    }
    public int healthRemaining()
    {
        return this.health;
    }
}**/
 class EnhancedPlayer
{
         private String name ;
    private int health=100;
    private String weapon;
    public EnhancedPlayer(String name ,int health ,String weapon  )
    {        this.name=name;
             if(health>0&&health<200) {
                 this.health=health;
             }
        this.weapon=weapon;
    }
    public void losehealth(int damage)
    {
        this.health=this.health-damage;
        if(this.health<=0)
        {
            System.out.println("player is knocked out:");
        }
    }
}
public class MainEncap {
    public static void main(String[] args) {
        EnhancedPlayer en1=new EnhancedPlayer("Tim",50,"Sword");
        System.out.println("Player is knocked out:");
/*in this program we are accessing instance variable using method so if we change the name of one instance v
* variable at all its references thn code written immediateely above won't have any effect*/

    }

}