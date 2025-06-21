package June3;

public class Hyundai extends Vehicles{
    @Override
    public void run() {
        System.out.println("Hyundai runs ");
    }

    @Override
    public void accelerate() {
        System.out.println("Hyundai Accelerates ");
    }

    @Override
    public void stop() {
        System.out.println("Hyundai Stops ");
    }
}
