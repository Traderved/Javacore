package chapter06;

class Box {
    double width;
    double height;
    double dept;
}
public class BoxDemo {
    public static void main(String[] args) {
        
        Box mybox = new Box();
        double vol;
        
        mybox.width = 10;
        mybox.height = 20;
        mybox.dept = 15;
        
        vol = mybox.width * mybox.height * mybox.dept;
        System.out.println("vol = " + vol);
    }
}
