package June14.Interface;

public class Udemy implements VideoPlayer {
    @Override
    public void play() {
        System.out.println("Udemy can play Educational videos");
    }

    @Override
    public void pause() {
        System.out.println("Udemy can pause Educational videos");
    }

    @Override
    public void stop() {
        System.out.println("Udemy can stop playing Educational videos");
    }

    @Override
    public void rewind() {
        System.out.println("Udemy can rewind playing Educational videos");
    }

    @Override
    public void forward() {
        System.out.println("Udemy can forward playing Educational videos");
    }

    @Override
    public void speed() {
        System.out.println("Udemy can Speedup playing Educational videos");
    }
}
