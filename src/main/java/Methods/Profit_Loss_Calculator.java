package Methods;

public abstract class Profit_Loss_Calculator {

    public static void profitOrLoss(int winnings, int numberOfAttempts){

        int totalCostToPlay = numberOfAttempts*2;

        if(winnings>totalCostToPlay){
            System.out.println("Your net profit: £" + (winnings-totalCostToPlay));
        }else if(winnings<totalCostToPlay){
            System.out.println("Your net loss: £" + (totalCostToPlay-winnings));
        }



    }


}
