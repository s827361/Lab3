package eecs1022.lab3;

/**
 * Created by user on 2/14/18.
 */
public class Gametester
{
    public static void main(String[] args){

        Game i1 = new Game ("S","U","Paper","Paper",1);
        System.out.println(i1.toString());

        Game i3 = new Game ("S","K","Scissors","Paper",2);
        System.out.println(i3.toString());
    }

}
