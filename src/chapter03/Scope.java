package chapter03;

public class Scope {
    public static void main(String[] args) {

        int x; // эта переменная доступна для всего кода из метода main

        x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x and y: " + x + " " + y);
            x = y*2;
        }
        // y = 100  - ошибка, поскольку у не доступна во внешнем коде, только во внутреннем
        System.out.println("x равно " + x);
    }
}
