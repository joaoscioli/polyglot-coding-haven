package Chapter07;

/* Here, Box defines three constructors to initialize
*  the dimensions of a box various ways.
* */
public class Box {
    double width;
    double height;
    double depth;

    // Notice this constructor. It takes an object of type Box.
    Box(Box ob) { //Pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    // This is the constructor for Box.
    // constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    Box() {
        width = -1; //used -1 to indicate
        height = -1; //an uninitialized
        depth = -1; //box
    }

    // constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    //compute and return volume
    double volume() {
        return width * height * depth;
    }
}
