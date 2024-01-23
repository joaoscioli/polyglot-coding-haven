package Chapter08;
// BoxWeight now fully implements all constructors.
public class BoxWeight3 extends Box {
    double weight; // weight of box

    // construct clone of an object
    BoxWeight3(BoxWeight3 ob) { // pass object to constructor
        super(ob);
        weight = ob.weight;
    }

    // constructor when all parameters are specified
    BoxWeight3(double w, double h, double d, double m) {
        super(w, h, d); // call superclass constructor
        weight = m;
    }

    // default constructor
    BoxWeight3() {
        super();
        weight = -1;
    }

    // constructor used when cube is created
    BoxWeight3(double len, double m) {
        super(len);
        weight = m;
    }
}
