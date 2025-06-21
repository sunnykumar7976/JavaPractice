package June3;

public class Audi extends Vehicles{
    @Override
    public void run() {
        System.out.println("Audi runs ");
    }

    @Override
    public void accelerate() {
        System.out.println("Audi Accelerates ");
    }

    @Override
    public void stop() {
        System.out.println("Audi runs ");
    }
}
