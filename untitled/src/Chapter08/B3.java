package Chapter08;
// Create a subclass by extending class A;
public class B3 extends A3{
    int i; // this i hides the i in A

    B3(int a, int b) {
        super.i = a; // i in A
        i = b; // i in B
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
