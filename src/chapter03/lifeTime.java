package chapter03;

public class lifeTime {
    public static void main(String[] args) {

        int x;

        for(x = 0; x < 3; x++) {
            int y = -1; // переменная у инициализируется при каждом входе в блок кода
            System.out.println("у равно: " + y); // здесь всегда выводится значение -1
            y = 10_0;
            System.out.println("y теперь = " + y);
        }
    }
}
