package homeworks._01_21;

public class Factorial {
    private int num;

    public Factorial(int num) {
        this.num = num;
    }

    public Factorial() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String factorialFor(int num) {
        int res = 1;
        StringBuilder str = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            res *= i;
            str.append(i);
            if (i < num) {
                str.append(" * ");
            }
        }
        str.append(" = ").append(res);
        return str.toString();
    }
    public String factoriaWhile(int num) {
        int res = 1;
        StringBuilder str = new StringBuilder();
        int i = 1;
        while (i <= num){
            res *= i;
            str.append(i);
            if (i < num) {
                str.append(" * ");
            }
            i++;
        }
        str.append(" = ").append(res);
        return str.toString();
    }

    public String factorialDoWhile(int num) {
        if (num == 0){
            return "0! =  1";
        }
        int res = 1;
        StringBuilder str = new StringBuilder();
        int i = 1;
        do {
            res *= i;
            str.append(i);
            if (i < num) {
                str.append(" * ");
            }
            i++;
        } while (i <= num);

        str.append(" = ").append(res);
        return str.toString();
    }

}
