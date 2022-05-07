package Methods;

import java.util.List;

public abstract class TotalCorrectNumbers {

    public static List<Integer> correctNumsChecker(List<Integer> correctNumbersList, List<Integer> totalCorrectNumbersList){

        switch(correctNumbersList.size()){
            case 0:
                totalCorrectNumbersList.add(0);
                break;
            case 1:
                totalCorrectNumbersList.add(1);
                break;
            case 2:
                totalCorrectNumbersList.add(2);
                break;
            case 3:
                totalCorrectNumbersList.add(3);
                break;
            case 4:
                totalCorrectNumbersList.add(4);
                break;
            case 5:
                totalCorrectNumbersList.add(5);
                break;
            case 6:
                totalCorrectNumbersList.add(6);
                break;
        }

        return  totalCorrectNumbersList;
    }
}
