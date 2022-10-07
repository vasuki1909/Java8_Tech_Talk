package for_each;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<>();
        gamesList.add("football");
        gamesList.add("hockey");
        gamesList.add("badminton");
        gamesList.add("cricket");
/*
        for (int i = 0; i < gamesList.size(); i++) {
            System.out.println(gamesList.get(i));

        }

        for (String games: gamesList
             ) {
            System.out.println(games);
        }*/

        gamesList.forEach(games -> System.out.println(games));
    }
}
