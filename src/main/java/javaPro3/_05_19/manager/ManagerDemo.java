package javaPro3._05_19.manager;

public class ManagerDemo {
    public static void main(String[] args) {

//        UserInput managerInput = new UserInput();
//
//        String managerName = managerInput.inputText("Enter user name :");
//        String managerEmail = managerInput.inputText("Enter user email :");
//
//        Manager manager = new Manager(managerName, managerEmail);

        ManagerService service = new ManagerService();
       Manager manager = service.createManager();
        System.out.println(manager);

    }
}
