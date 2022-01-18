package chapter06;

public class Box1 {

    double width;
    double height;
    double dept;
}

class BoxDemo2 {
    public static void main(String[] args) {

        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();
        double vol;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.dept = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.dept = 9;

        vol = mybox1.width * mybox1.height * mybox1.dept;
        System.out.println("vol = " + vol);

        vol = mybox2.width * mybox2.height * mybox2.dept;
        System.out.println("vol = " + vol);


    }
}
