package Chapter09;

public class Client implements Callback {
    // implement Callback's interface
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interface " +
                "may also define other members, too.");
    }
}
