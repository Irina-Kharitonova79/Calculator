package calculator;

public enum MyOperations {
    PLUS("\\+") {
        @Override
        int execute(int leftInt, int rightInt) {
            if (leftInt >= 1 && leftInt <= 10 && rightInt >= 1 && rightInt <= 10) {
                return leftInt + rightInt;
            } throw new IllegalArgumentException("Не подходящее число.");
        }
    },
    MINUS("-") {
    @Override
    int execute(int leftInt, int rightInt) {
            if (leftInt >= 1 && leftInt <= 10 && rightInt >= 1 && rightInt <= 10) {
                return leftInt - rightInt;
            } throw new IllegalArgumentException("Не подходящее число.");
        }
    },
    MULTIPLY("\\*") {
        @Override
        int execute(int leftInt, int rightInt) {
            if (leftInt >= 1 && leftInt <= 10 && rightInt >= 1 && rightInt <= 10) {
                return leftInt * rightInt;
            } throw new IllegalArgumentException("Не подходящее число.");
        }
    },
    DIVIDE("/") {
        @Override
        int execute(int leftInt, int rightInt) {
            if (leftInt >= 1 && leftInt <= 10 && rightInt >= 1 && rightInt <= 10) {
                return leftInt / rightInt;
            } throw new IllegalArgumentException("Не подходящее число.");
        }
    };

    abstract int execute(int leftInt, int rightInt);

    protected final String operator;

    MyOperations(String operator) {
        this.operator = operator;
    }

    public boolean check(String checkString) {
        return commonCheck(checkString, operator);
    }

    private static boolean commonCheck(String checkString, String delimiter) {
        if(checkString.split(delimiter).length == 2) {
            return true;
        } return false;
    }

    public String getOperator() {
        return operator;
    }
}
