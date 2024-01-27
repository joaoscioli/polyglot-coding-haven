package Chapter09;
// Implement MyIF.
public class MyIFImp implements MyIF{
    // Only getNumber() defined by MyIF needs to be implementd.
    // getString() can be allowed to default.
    public int getNumber() {
        return 100;
    }
}
