package javaPro._02_13;

public class Printer {
    public static <T> void  print(T t){
//        if (t instanceof Object)// учитывает иерпархию
        if (t.getClass().equals(String.class)){
            String string=(String) t;
            System.out.println(string.toUpperCase());
        } else if (t.getClass().equals(Integer.class)) {
            Integer integer = (Integer) t;
            System.out.println(integer * integer);
        }
        System.out.println(t);
    }
}
