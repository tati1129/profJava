package javaPro._01_14.classWork;


public class Calculator {

    public String getResult(String str) {
        int countOperation = getCountOperation(str);
        char[] operators = extractOperators(str,countOperation);//массив мат операторов
        double[] numbers = extractNumbers(str, countOperation);//массив чисел
        double result = numbers[0];

        if (operators.length != numbers.length - 1) {
            throw new IllegalArgumentException("Количество операторов должно быть на один меньше, чем чисел.");
        }

        StringBuilder output = new StringBuilder(); // Для форматированного вывода

        for (int i = 0; i < operators.length ; i++) {
            char operator = operators[i];
            double nextNumber = numbers[i + 1];

            switch (operator){
                case '+':
                    result += nextNumber;
                    break;
                case '-':
                    result -= nextNumber;
                    break;
                case '*':
                    result *= nextNumber;
                    break;
                case '/':
                    if (nextNumber == 0){
                        throw new ArithmeticException("Деление на ноль");
                    }
                    result /= nextNumber;
                    break;
                default:
                    throw new IllegalArgumentException("Неподдерживаемый оператор: " + operator);
            }
            // Добавляем результат текущей операции
            output.append(String.format("%.2f\n", result));
        }

        // Добавляем итоговое выражение с результатом
        output.append("\n").append(getFinalStr(operators, numbers, result));

        return output.toString(); // Возвращаем форматированный результат
    }

    //количество операторов
    private int getCountOperation(String str) {
        int countOperation = 0;

        for (int i = 0; i < str.length(); i++) {
            if (isMathOperation(str.charAt(i))) {
                countOperation++;
            }
        }
        return countOperation;
    }

    //создаем массив чисел из введенной строки
    private double[] extractNumbers(String str, int countOperation) {
        double[] numbers = new double[countOperation + 1];
        int start = 0;
        int indexNumber = 0;

//        for (int i = 0; i < numbers.length; i++) {
//            // Обработка последнего числа после последней операции
//            if (str.length()-1 == i){
//                String lastNumber = str.substring(start);
//                numbers[indexNumber] = Double.parseDouble(lastNumber);
//            }
//            if (isMathOperation(str.charAt(i))) {
//                String strNumber = str.substring(start, i);
//                double number = Double.parseDouble(strNumber);
//                numbers[indexNumber] = number;
//                indexNumber++;
//                start = i + 1;
//            }
//        }
//        return numbers;

        for (int i = 0; i < str.length(); i++) {
            if (isMathOperation(str.charAt(i))) {
                // Извлекаем число перед оператором
                String strNumber = str.substring(start, i);
                numbers[indexNumber++] = Double.parseDouble(strNumber);
                start = i + 1; // Обновляем начало следующего числа
            }
        }

        // Добавляем последнее число
        numbers[indexNumber] = Double.parseDouble(str.substring(start));
        return numbers;

    }
    // Метод извлечения операторов
    private char[] extractOperators(String str, int countOperation) {
        char[] operators = new char[countOperation];
        int indexOperator = 0;

        for (int i = 0; i < str.length(); i++) {
            if (isMathOperation(str.charAt(i))) {
                operators[indexOperator++] = str.charAt(i);
            }
        }

        return operators;
    }
    //
    private Boolean isMathOperation(char currentChar) {
        return ((currentChar == '+') || (currentChar == '-') || (currentChar == '/') || (currentChar == '*'));
    }

    private String getFinalStr(char[] operators, double[] numbers,double result){
        StringBuilder newStr = new StringBuilder();
        for (int j = 0; j < numbers.length-1; j++) {
            newStr.append(numbers[j]).append(" ").append(operators[j]).append(" ");
        }

        newStr.append(numbers[numbers.length-1]).append(" = ").append(result);
        return  newStr.toString();
    }




}
