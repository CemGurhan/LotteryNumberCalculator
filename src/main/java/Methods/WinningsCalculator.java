package Methods;

import java.util.List;

public abstract class WinningsCalculator {

    public static int winnings(List<Integer> list){

        int winnings = 0;

        for(int i = 0; i < list.size(); i++){

            switch(list.get(i)){
                case 3:
                    winnings+= 25;
                    break;
                case 4:
                    winnings+= 100;
                    break;
                case 5:
                    winnings+= 1000;
                    break;
                case 6:
                    winnings+= 1_000_000;
                    break;
            }
        }
        return winnings;
    }
}
