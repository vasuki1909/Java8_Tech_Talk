package for_each;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<>();
        gamesList.add("football");
        gamesList.add("hockey");
        gamesList.add("badminton");
        gamesList.add("cricket");
        //one way
        for (int i =0; i< gamesList.size();i++)
        {
            System.out.println(gamesList.get(i));

        }

        //second way enhanced for loop version
        for (String games: gamesList
             ) {
            System.out.println(games);

        }


        //for each way
        gamesList.forEach(games -> System.out.println(games));
        //we are fetching all the games from the gamesList and printing them.
        // faster than other loops
        //uses lambda expression
        // uses internal iteration
    }
}
