package Methods;

import java.util.ArrayList;
import java.util.List;

public abstract  class CorrectNumbers {

    public static List<Integer> compare(List<Integer> list1, List<Integer> list2){

        List<Integer> correctNumbers = new ArrayList<>();

        for(int i = 0; i < list1.size(); i++){
            if(list1.contains(list2.get(i))){
                correctNumbers.add(list2.get(i));
            }
        }
        return correctNumbers;
    }
}
