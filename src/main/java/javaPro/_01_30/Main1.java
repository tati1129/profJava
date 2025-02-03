package javaPro._01_30;

import javaPro._01_30.exceptions.InvalidLengthException;
import javaPro._01_30.exceptions.NoNumbersException;

public class Main1 {
    public static void main(String[] args) {
        try {
            Password password = new Password("787469375");
        }catch (InvalidLengthException lengthException){
            System.out.println("не правильеая длиня, попробуй еще раз");
        }catch (NoNumbersException noNumbersException){
            System.out.println("пароль должен содержать цифры");
        }catch (RuntimeException exception){
            System.out.println("Something goes wrong ");
        }finally {

        }

    }
}
