package Chapter08;

public class Dispatch {
    public static void main(String[] args) {
        A6 a = new A6(); // object of type A
        B6 b = new B6(); // object of type B
        C6 c = new C6(); // object of type C

        A6 r; // obtain a reference of type A

        r = a; // r refers to an A object
        r.callme(); // calls A's version of callme

        r = b; // r refers to a B object
        r.callme(); // calls B's version of callme

        r = c; // r refers to a C object
        r.callme(); // calls C's version of callme
    }
}
