import java.util.ArrayList;
import java.util.Collections;
public class League<T extends Team> {
    String name;
    ArrayList<T>leagueBoard=new ArrayList<>();
    public League(String name)
    {
        this.name=name;
    }
    public boolean addteam(T team)
    {
        if(leagueBoard.contains(team))
        {
            System.out.println(team.getName() + "already added");
            return false;
        }
        else
        {
            leagueBoard.add(team);
            return true;
        }
    }
    public void ranking()
    {
        Collections.sort(leagueBoard);
        for(T t: leagueBoard)
            System.out.println(t.getName() + " : " + t.ranking());
    }
}
