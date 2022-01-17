package chapter05;

public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Predshestvuet operatoru BREAK");
                    if(t) break second;
                    System.out.println("Etot operator ne budet vipolniatsa");
                }
                System.out.println("Etot operator ne budet vipolniatsa");
            }
            System.out.println("Etot operator sleduet za blockom SECOND");
        }
    }
}
