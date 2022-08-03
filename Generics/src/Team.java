import java.util.ArrayList;
public class Team<T extends Player> implements Comparable<Team<T>> { //this will ensure that team class will only have type which extends from Player, if
    //we dont use extends then it will accept String also
    private String name;
    int played;
    int won;
    int lost;
    int tied;
    private ArrayList<T> members=new ArrayList<>();
    public Team(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public void addPlayer(T player)
    {
        if(members.contains(player))
        {
            System.out.println(player.getName() + "member already added");
        }
        else {
            members.add(player);
            System.out.println(player.getName() + "has been added successfully");
        }
    }
    public void removePlayer(Player player)
    {
        if(members.contains(player))
        {
            members.remove(player);
            System.out.println(player.getName() + "has been removed successfully");
        }
        else
            System.out.println("mentioned player does not exist");
    }
    public void matchResult(Team<T> opponent,int ourScore,int theirScore)
    {
        String message="";
        if(ourScore>theirScore)
        {
            this.won++;
            message="won";
        } else if (theirScore>ourScore)
        {
            opponent.lost++;
            message="lost";
        } else if (ourScore==theirScore) {
            message="drew";
        }
        this.played++;
        opponent.played++;
        System.out.println(this.getName() + " " + message + " " + opponent.getName());
    }
    public int numPlayers(Team a)
    {
        return a.members.size();
    }
    public int gamesPlayed()
    {
        return this.played;
    }
    public int gamesWon()
    {
        return this.won;
    }
    public int gamesLost()
    {
        return this.lost;
    }
    public int ranking()
    {
        return (won*2)+ tied;
    }
    @Override
    public int compareTo(Team<T> team)
    {
        if(this.ranking()>team.ranking())
            return -1;
        else if (this.ranking()< team.ranking())
            return 1;
        else
            return 0;
    }
}
