package OOPs;

class GtaCity {

    public void hit() {
        System.out.println("Hitting...");
    }
    public void run() {
        System.out.println("Running...");
    }
    public void fire() {
        System.out.println("Firing...");
    }
}

public class class_3 {
    public static void main(String[] args) {

        GtaCity tomy = new GtaCity();

        tomy.run();
        tomy.fire();
        tomy.hit();

    }

}