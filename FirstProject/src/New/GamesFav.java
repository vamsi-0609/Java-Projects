package DAY10;

import java.util.*;

public class GamesFav {
	public static void main(String[] args) {
		List<String> games = new ArrayList<String>();
		games.add("Cricket");
		games.add("kabaddi");
		games.add("CHESS");
		games.add("Football");
		
		int min = 0;
        int max = games.size() - 1;

        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        System.out.println(games.get(randomNum));
		
	}
}
