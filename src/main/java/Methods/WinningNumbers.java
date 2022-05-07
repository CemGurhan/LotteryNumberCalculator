package Methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class WinningNumbers {

    public static List<Integer> winningNums(){
        List<Integer> winningNumbers = new ArrayList<>();
        Random random = new Random();
        int numCount = 1;

        while(numCount<7){

            int randInt = random.ints(1,60).findFirst().getAsInt();

            winningNumbers.add(randInt);
            Collections.sort(winningNumbers);

            for (int i = 0; i < winningNumbers.size(); i++) {
                if (i < winningNumbers.size() - 1 && winningNumbers.get(i) == winningNumbers.get(i + 1)) {

                    winningNumbers.remove(i);
                    numCount--;

                }
            }
            numCount++;
        }

//        System.out.println("Winning numbers are: " + winningNumbers);
        return winningNumbers;
    }


}
