package Chapter08;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight3 mybox1 = new BoxWeight3(10, 20, 15, 34.3);
        BoxWeight3 mybox2 = new BoxWeight3(2, 3, 4, 0.076);
        BoxWeight3 mybox3 = new BoxWeight3(); //default
        BoxWeight3 mycube= new BoxWeight3(3, 2);
        BoxWeight3 myclone = new BoxWeight3(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is " + vol);
        System.out.println("Weight of mybox3 is " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
        System.out.println("Weight of myclone is " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
        System.out.println("Weight of mycube is " + mycube.weight);
        System.out.println();

    }
}
