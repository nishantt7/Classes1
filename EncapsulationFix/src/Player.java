public class Player {
    private String name;
    private String weapon;
    private int health;
    public Player (String name,String weapon,int health)
    {
        this.name=name;
        this.weapon=weapon;
        if(health>0 && health<=100)
        {
            this.health=health;
        }
    }
    public void loseHealth(int damage)
    {
        if(this.health<damage)
        {
            System.out.println("insufficient health for more damage");
        }
        else
        {
            this.health=this.health-damage;
        }
    }
    public int getHealth(){
        return health;
    }
}
