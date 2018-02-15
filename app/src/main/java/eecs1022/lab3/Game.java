package eecs1022.lab3;

/**
 * Created by user on 2/14/18.
 */
public class Game
{
    String player1;
    String player2;
    String player1action;
    String player2action;
    int round;


    public Game (String p1, String p2, String pa1, String pa2,int rd){
        this.player1 = p1;
        this.player2 = p2;
        this.player1action = pa1;
        this.player2action = pa2;
        this.round = rd;
    }
    public String toString()
    {
        String s = "";
        s = "Round " + (round+1)  + " Finished";
        s += "\n";
        if ( player1action == player2action){
            s += "Tie between " + player1+""+"and"+"" + player2;

        }
        if ( player1action.equals("Paper" )&& player2action.equals("Scissors")){

            s += "Winner is " + player2;
        }
        if ( player1action.equals("Paper" )&& player2action.equals("Rock")){

            s += "Winner is " + player1;
        }
        if ( player1action.equals("Rock" )&& player2action.equals("Scissors")){

            s += "Winner is " + player1;
        }
        if ( player1action.equals("Rock" )&& player2action.equals("Paper")){

            s += "Winner is " + player2;
        }
        if ( player1action.equals("Scissors" )&& player2action.equals("Rock")){

            s += "Winner is " + player2;
        }
        if ( player1action.equals("Scissors" )&& player2action.equals("Paper")){

            s += "Winner is " + player1;
        }






        if( round == 2){
            s += "\n";
            s += "Game is over";
        }


        return s;

    }
}
