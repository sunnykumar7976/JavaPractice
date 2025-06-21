package June14.Interface;

public class Netflix implements VideoPlayer{

    @Override
    public void play() {
        System.out.println("Netflix can Play Movies and Tv Shows");
    }

    @Override
    public void pause() {
        System.out.println("Netflix can Pause Movies and Tv Shows");
    }

    @Override
    public void stop() {
        System.out.println("Netflix can Stop playing Movies and Tv Shows");
    }

    @Override
    public void rewind() {
        System.out.println("Netflix can Rewind Playing Movies and Tv Shows");
    }

    @Override
    public void forward() {
        System.out.println("Netflix can forward Playing Movies and Tv Shows");
    }

    @Override
    public void speed() {
        System.out.println("Netflix can Speed up Movies and Tv Shows");
    }
}
