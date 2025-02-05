package homeworks._01_27_;


public class Atm {

    //private InputHandler inputHandler;
    private Card card;

//    public Atm() {
//        this.inputHandler = new InputHandler();
//    }

    // Метод для "вставки" карты в банкомат (можно передавать пин-код сразу)
    public boolean setCard(Card card, int enteredPin) {
        if (card.validatePin(enteredPin)) {
            this.card = card;
            return true;
        } else {
            System.out.println("Invalid PIN.");
            return false;
        }
    }

    // Метод для снятия денег
    public void extractMoney(double money) {
        if (card == null) {
            System.out.println("No card inserted.");
            return;
        }
        card.extractMoney(money);
    }

    // Метод для пополнения счета
    public void addMoney(double amount) {
        if (card == null) {
            System.out.println("No card inserted.");
            return;
        }
        card.addMoney(amount);
    }

    // Метод для проверки баланса
    public void checkBalance() {
        if (card == null) {
            System.out.println("No card inserted.");
            return;
        }
        card.checkBalance();
    }

    // Метод для извлечения карты
    public void ejectCard() {
        if (card == null) {
            System.out.println("No card to eject.");
            return;
        }
        System.out.println("Card ejected: " + card.owner);
        card = null;
    }

//    // Метод для обработки ввода пин-кода и его валидации
//    public boolean validatePin(int enteredPin) {
//        if (Card.creditCardUser1.validatePin(enteredPin)) {
//            card = Card.creditCardUser1;
//        } else if (Card.debitCardUser1.validatePin(enteredPin)) {
//            card = Card.debitCardUser1;
//        } else if (Card.creditCardUser2.validatePin(enteredPin)) {
//            card = Card.creditCardUser2;
//        } else if (Card.debitCardUser2.validatePin(enteredPin)) {
//            card = Card.debitCardUser2;
//        } else {
//            System.out.println("Invalid PIN code.");
//            return false;
//        }
//        return true;
//    }
//
//    // Метод для выполнения операций с картой
//    public void run() {
//        int enteredPin = inputHandler.enterPin();
//
//        if (validatePin(enteredPin)) {
//            inputHandler.chooseAccount();
//
//            boolean exit = false;
//            while (!exit) {
//                int choice = inputHandler.chooseAction();
//                switch (choice) {
//                    case 1:
//                        // Снятие денег
//                        double withdrawAmount = inputHandler.enterAmount();
//                        card.extractMoney(withdrawAmount);
//                        break;
//                    case 2:
//                        // Пополнение баланса
//                        double depositAmount = inputHandler.enterAmount();
//                        card.addMoney(depositAmount);
//                        break;
//
//                    case 3:
//                        // Проверка баланса
//                        card.checkBalance();
//                        break;
//
//                    case 4:
//                        // Выход
//                        System.out.println("Thank you for using the ATM.");
//                        exit = true;
//                        break;
//
//                    default:
//                        System.out.println("Invalid option. Please try again.");
//                }
//            }
//        }
//    }
}

