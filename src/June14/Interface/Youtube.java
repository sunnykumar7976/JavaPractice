package June14.Interface;

public class Youtube implements VideoPlayer{

    @Override
    public void play() {
        System.out.println("Youtube can Play any Videos");
    }

    @Override
    public void pause() {
        System.out.println("Youtube can Pause any Playing Videos");
    }

    @Override
    public void stop() {
        System.out.println("Youtube can Stop any Playing Videos");
    }

    @Override
    public void rewind() {
        System.out.println("Youtube can Rewind any Playing Videos");
    }

    @Override
    public void forward() {
        System.out.println("Youtube can Forward any Playing Videos");
    }

    @Override
    public void speed() {
        System.out.println("Youtube can Speed up any Playing Videos");
    }
}
