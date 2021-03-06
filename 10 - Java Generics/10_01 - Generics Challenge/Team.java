import java.util.ArrayList;

// T is a Bounded Type Parameter. Using extends restricts the type of class we can use.
// implements Comparable<Team<T>> allows us to compare teams of the same class type and not against other classes
public class Team<T extends Player> implements Comparable<Team<T>>
{
    
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int drawn = 0;
    
    private ArrayList<T> members = new ArrayList<>();
    
    public Team(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean addPlayer(T player)
    {
        if (members.contains(player))
        {
            System.out.println(player.getName() + " is already in the team");
            return false;
        }
        else
        {
            members.add(player);
            System.out.println(player.getName() + " has been added to team " + this.name);
            return true;
        }
    }
    
    public int numPlayers()
    {
        return this.members.size();
    }
    
    public void matchResult(Team<T> opponent, int ourScore, int theirScore)
    {
        String message;
        
        if (ourScore > theirScore)
        {
            won++;
            message = " beat ";
        }
        else if (ourScore == theirScore)
        {
            drawn++;
            message = " drew with ";
        }
        else
        {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null)
        {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }
    
    public int ranking()
    {
        return (won * 3) + drawn;
    }
    
    @Override public int compareTo(Team<T> team)
    {
        if (this.ranking() > team.ranking())
        {
            return -1;
        }
        else if (this.ranking() < team.ranking())
        {
            return 1;
        }
        else
        {
            return 0;
        }
        
    }
    
}