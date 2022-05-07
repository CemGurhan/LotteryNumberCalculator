package Main;

import Methods.*;
import ScannerMethods.UserNumbersGetter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        List<Integer> userNumbers = UserNumbersGetter.getSixNumbers();

        List<Integer> totalCorrectNumbersList = new ArrayList<>();

        int numberOfAttempts = 1;

        while(numberOfAttempts<4175){

            List<Integer> winningNumbers = WinningNumbers.winningNums();

            List<Integer> correctNumbersList = CorrectNumbers.compare(userNumbers,winningNumbers);


            totalCorrectNumbersList = TotalCorrectNumbers.correctNumsChecker(correctNumbersList,totalCorrectNumbersList);

            numberOfAttempts++;
        }

        int winnings = WinningsCalculator.winnings(totalCorrectNumbersList);
        System.out.println("Your winnings: £" + winnings);
        Profit_Loss_Calculator.profitOrLoss(winnings,numberOfAttempts);


//        System.out.println("Total numbers guessed correctly each week: " + totalCorrectNumbersList);




    }
}
