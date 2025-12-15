/*

# Answer close reading 1 questions here
first team

through the inputted non negative int when using the recordPlay function

when the recordPlay function gives 0 and the active team switches

# Answer close reading 2 questions here
Team score int and team name String and the recordPlay's ints

3


*/

// Write the class below
public class Scoreboard
{
    private String name1;
    private String name2;
    private int score1;
    private int score2;
    private boolean activeTeam;

    public Scoreboard(String name1, String name2)
    {
        this.name1 = name1;
        this.name2 = name2;
        score1 = 0;
        score2 = 0;
        activeTeam = true;
        
    }

    public void recordPlay(int playScore)
    {
        if (playScore == 0)
        {
            activeTeam = !activeTeam;
        }

        if (activeTeam == true)
        {
            score1 = (score1 + playScore);
        }
        else
        {
            score2 = (score2 + playScore);
        }
        
    }

    public String getScore()
    {
        String buh;
        if (activeTeam = true)
        {
           buh = (score1 + "-" + score2 + "-" + name1);
        }
        else
        {
            buh = (score1 + "-" + score2 + "-" + name2);
        }
        return buh;
    }

}