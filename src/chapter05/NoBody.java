package chapter05;

public class NoBody {
    public static void main(String[] args) {
        int i, j;

        i=100;
        j=200;
        // srednee

        while (++i < --j);
        System.out.println("srednee = " + i);
    }
}
