package Chapter09;

import Chapter09.mypack.*;

public class TestBalance {
    public static void main(String[] args) {

        /* Because Balance is public, you many use Balance
        *  class and call its constructor. */

        Balance test = new Balance("J. J. Jaspers", 99.88);

        test.show(); // you may also call show()
    }
}
