public class Team
{
    // Static Variables
    // ...
    public static int totalTeams;
    public static int minTeams = 6;
    
    // Public Methods
    public Team() 
    {
        totalTeams++;
    }
    
    // Static Methods 
    // ...
    public static boolean tournamentReady() {
        return totalTeams>=minTeams;
    }
}