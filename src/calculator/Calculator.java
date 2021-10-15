package calculator;

import java.util.Scanner;

import static calculator.TryToGetOperation.tryToGetOperation;

public class Calculator {

    public static void main(String[] args) {

        while (true) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Input:");
            String inputString = reader.nextLine();

            MyOperations myOperations = tryToGetOperation(inputString);
            String operator = myOperations.getOperator();

            String[] splitString = inputString.split(operator);
            String leftString = splitString[0].trim();
            String rightString = splitString[1].trim();

            int firstChar = leftString.charAt(0);

            if (firstChar >= 48 && firstChar <= 57) {
                int leftInt = Integer.parseInt(leftString);
                int rightInt = Integer.parseInt(rightString);
                int result = myOperations.execute(leftInt, rightInt);
                System.out.println("Output:\n" + result);
            } else if (firstChar == 45) {
                throw new IllegalArgumentException("Не подходящее число.");
            } else {
                InputRoman inputRoman = new InputRoman();
                inputRoman.inputRoman(leftString, rightString, myOperations);
            }

        }

    }

}