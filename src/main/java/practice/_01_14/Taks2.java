package practice._01_14;

public class Taks2 {

    public static void main(String[] args) {
        String str = "Hello, Java Class!";
        String[] arr = {"one", "two", "three", "four", "five"};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.charAt(i));
        }
        stringBuilder.reverse();
        System.out.println(stringBuilder.reverse());
        getModifyString(arr);
        System.out.println(getModifyString(arr));
    }

    public static String getModifyString(String[] arr){
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();

        for (String s : arr) {
            stringBuilder1.append(stringBuilder.append(s).reverse());
            stringBuilder.delete(0, s.length());
        }

        return stringBuilder1.toString();
    }
}
