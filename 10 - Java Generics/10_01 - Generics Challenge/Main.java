public class Main
{
    
    public static void main(String[] args)
    {
        
        League<Team<SoccerPlayer>> premier = new League("Premier League");
        
        Team<SoccerPlayer> lfc = new Team<>("Liverpool");
        premier.add(lfc);
        
        Team<SoccerPlayer> mcfc = new Team<>("Manchester City");
        premier.add(mcfc);
        
        Team<SoccerPlayer> nufc = new Team<>("Newcastle United");
        premier.add(nufc);
        
        lfc.matchResult(nufc, 3, 0);
        nufc.matchResult(mcfc, 1, 4);
        mcfc.matchResult(lfc, 1, 2);
        
        premier.teamStandings();
        
    }
    
}