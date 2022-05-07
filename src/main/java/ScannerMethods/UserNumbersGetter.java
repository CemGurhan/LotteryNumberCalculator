package ScannerMethods;

import Exceptions.IntegerException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public abstract class UserNumbersGetter {


    public static List<Integer> getSixNumbers() {

        ArrayList<Integer> selectedNumbers = new ArrayList<>();

        int numCounter = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select 6 numbers between 1 and 59:");

        while (numCounter < 7) {

            System.out.println("Select number " + numCounter + ":");

            int number1 = IntegerException.intException(scanner);


            if (number1 < 1 || number1 > 59) {
                System.out.println("Please enter a number between 1 and 59");
            } else {

                selectedNumbers.add(number1);
                Collections.sort(selectedNumbers);

                for (int i = 0; i < selectedNumbers.size(); i++) {
                    if (i < selectedNumbers.size() - 1 && selectedNumbers.get(i) == selectedNumbers.get(i + 1)) {
                        System.out.println("Please do not enter duplicate numbers");
                        selectedNumbers.remove(i);
                        numCounter--;

                    }
                    }
                    numCounter++;
                }


            }
        System.out.println("\nYour selected numbers are: " + selectedNumbers + "\n");
        return selectedNumbers;

        }





    }



