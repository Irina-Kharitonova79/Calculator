package calculator;

public class TryToGetOperation {

    public static MyOperations tryToGetOperation(String inputString) {
        for (MyOperations value : MyOperations.values()) {
            if (value.check(inputString)) {
                return value;
            }
        }
        throw new IllegalArgumentException("Не подходящая арифметическая операция.");
    }

}
