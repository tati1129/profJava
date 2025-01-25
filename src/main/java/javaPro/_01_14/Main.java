package javaPro._01_14;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello!";
        String str2 = "Hello!";
        System.out.println(str1 == str2);//true одна и та же строка,кот сохр в пуле строк

        str2 = str2.replace('o','a');
        System.out.println(str1 == str2);//false теперь str2 уже другая строка, изменения создают новую строку


        str1 = str1.replace('o','a');
        System.out.println(str1 == str2);//false теперь str1 уже другая строка, изменения создают новую строку

        str1 = str1.intern();//добавили в pool String str1
        str2 = str2.intern();//добавили в pool String str2
        System.out.println(str1 == str2);//true теперь опять это одна строка с двумя ссылками на нее


        int[] arr = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                continue;
            }
            System.out.print(arr[i]);
        }

        System.out.println("End");


    }

    public static String print(String str){
        System.out.println(str);
        if (str == null){
            return null;
        }else {
            return str;
        }
    }
}
