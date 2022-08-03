public class Runner {
    public static void main (String[] args)
    {
        Player p=new Player("Rocky","Sword",20);
        p.loseHealth(100);
        System.out.println(p.getHealth());
    }
}
