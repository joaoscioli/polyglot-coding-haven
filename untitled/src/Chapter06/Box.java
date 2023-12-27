package Chapter06;

/* A program that uses the Box class.
*  Class this file BoxDemo.java
* */
public class Box {
    double width;
    double height;
    double depth;



    // This is the constructor for Box.
    // A redundant use of this.
//    Box(double w, double h, double d) {
//        this.width = w;
//        this.height = h;
//        this.depth = d;
//    }

//    //display volume of a box
//    void volume() {
//        System.out.print("Volume is ");
//        System.out.println(width * height * depth);
//    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }

    // sets dimensions of box
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}


