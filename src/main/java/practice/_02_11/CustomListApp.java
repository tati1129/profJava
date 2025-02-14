package practice._02_11;

public class CustomListApp {
    public static void main(String[] args) {


    // 1 3 4 3 5
    MyNode one = new MyNode(1);
    MyNode two = new MyNode(3);
    MyNode three = new MyNode(4);
    MyNode four = new MyNode(3);
    MyNode five = new MyNode(5);

    one.setNext(two);
    two.setNext(three);
    three.setNext(four);
    four.setNext(five);
    CustomList customList = new CustomList(one);
        System.out.println(customList);
    }
 }