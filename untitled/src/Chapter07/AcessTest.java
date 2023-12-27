package Chapter07;

/*  This program demonstrates the difference between
    public and private.
* */
public class AcessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        // These are OK, a and b may be accessed directly
        ob.a = 10;
        ob.b = 10;
    }
}
