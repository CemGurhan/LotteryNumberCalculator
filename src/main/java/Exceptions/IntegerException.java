package Exceptions;

import java.util.Scanner;

public abstract class IntegerException {

    public static int intException(Scanner scanner){

        while(!scanner.hasNextInt()){
            String in = scanner.nextLine();
            System.out.println("Please enter an integer");
        }

        return scanner.nextInt();

    }
}
