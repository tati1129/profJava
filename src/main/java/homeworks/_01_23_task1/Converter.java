package homeworks._01_23_task1;



public interface Converter {

    default void balanceInCurrency(Card card, double rate, String currency) {
        if (rate > 0) {
            double currentValue = Math.round(card.getBalance() * rate * 100.0) / 100.0;
            System.out.println("Your balance in  " + currency + " : " + currentValue);
        } else {
            throw new IllegalArgumentException("Incorrect rate");
        }
    }


}
