package Chapter08;
// A's j is not accessible here.
public class B2 extends A2 {
    int total;

    void sum() {
    //   total = i + j; // ERROR, j is not accessible here
    }
}
