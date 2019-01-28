package challenge;

public class PayerMain {
    public static void main(String[] args) {
        Player player =new Player();
        player.name="Tim";
        player.health=20;
        player.weapon="Sword";
        int damage=10;
        player.loseHealth(10);
        System.out.println("The remaining health of the player is " + player.healthRemaining() );
         damage=11;
        player.loseHealth(damage);
        System.out.println("The remaining health of the player is " + player.healthRemaining() );
    }
}
