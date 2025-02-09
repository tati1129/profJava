package summary._01_14;

public class Task1 {

    public static void main(String[] args) {
        String one = "Hello!";//Hello!
        one = one + " Java"; //создается новая строка Hello! Java
        one = one + " Class"; //создается новая строка Hello! Java Class


        String[] names = {"Alex", "Oleg", "Petr", "Max"};

//        String letter = "";
//        for (String str : names){
//            letter = letter + str;
//            letter = letter + " ,";
//        }
//        letter = letter + " ........ Thanks!";
//        System.out.println(letter);


        // если не нужно работать с индексами, то лучше использовать for each
        // for (Тип имяПеременной : массив(или коллекция) кот перебираем)
        // в каждой итерации цикла поочередно, каждый элемент из массив(или коллекция) будет присваиваться в эту переменную имяПеременной

        //Объект для работы со строками для эффективного потребления памяти
        StringBuilder stringBuilder = new StringBuilder("Dear ");
        //stringBuilder.append("Dear ");
        for (String name : names){
            stringBuilder.append(name).append(" ,");
        }
        stringBuilder.append(" ........ Thanks!");
       // stringBuilder.reverse(); // разворачивает строку в обратном порядке
        String result = stringBuilder.toString();
        System.out.println(result);

    }
}
