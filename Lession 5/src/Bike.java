public class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String args[]) {
        Bike bike = new Bike();
        bike.run();
    }
}

