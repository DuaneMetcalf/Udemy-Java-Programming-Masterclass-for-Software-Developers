import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>
{
    public String name;
    private ArrayList<T> league = new ArrayList<>();
    
    public League(String name)
    {
        this.name = name;
    }
    
    public boolean add(T team)
    {
        if (league.contains(team))
        {
            System.out.println(team.getName() + " is already in the league");
            return false;
        }
        league.add(team);
        System.out.println(team.getName() + " has been added to league " + this.name);
        return true;
    }
    
    public void teamStandings()
    {
        Collections.sort(league);
        for (T t : league)
        {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
    
}
