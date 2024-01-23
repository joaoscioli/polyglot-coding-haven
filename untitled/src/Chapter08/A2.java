package Chapter08;
/* In  a class hierarchy, private member remain
*  private to their class.
*  This program contains an error and will not
*  compile.
* */
// Create a superclass
public class A2 {
    int i; // default access
    private int j; // private to A

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}
