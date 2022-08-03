public class Player {
    public String name;
    public String weapon;
    public int health;
    public Player(String name,String weapon,int health)
    {
        this.name=name;
        this.weapon=weapon;
        this.health=health;
    }
    public void loseHealth(int damage)
    {
        this.health=this.health-damage;
        if(this.health<0)
        {
            System.out.println("Player Knocked out and");
        }
    }
    public int playerHealthRemaining(){
        return this.health;
    }
}
