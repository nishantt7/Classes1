public class Runner {
    public static void main(String[] args)
    {
        Player p=new Player("ABC","Gun",100);
        p.name="TIM";
        p.health=20;
        p.weapon="Sword";
        p.loseHealth(10);
        System.out.println("player health remaining" + " " + p.playerHealthRemaining());
        p.loseHealth(11);
        System.out.println("player health remaining" + " " + p.playerHealthRemaining());
        p.health=200;
        p.loseHealth(133);
        System.out.println("player health remaining" + " " + p.playerHealthRemaining());
    }
}
