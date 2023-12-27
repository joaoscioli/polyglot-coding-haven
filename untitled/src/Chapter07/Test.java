package Chapter07;

//Objects may be passed to methods.
public class Test {
//    int a, b;
    int a; // default access
    public int b;   // public access
    private int c;  // private access

    Test(int i, int j) {
        a = i;
        b = j;
    }

    Test(int i) {
        a = i;
    }

    Test() {};

    // methods to access c
    void setc(int i) { // set c's value
        c = i;
    }

    int getc() {    // get c's value
        return c;
    }

    //return true if o is equal to the invoking objects.
    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    // pass an object
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}
