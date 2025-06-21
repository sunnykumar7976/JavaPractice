package June14.Interface;

public class Spotify implements AudioPlayer{

    @Override
    public void play() {
        System.out.println("Spotify can Play Audio files");
    }

    @Override
    public void pause() {
        System.out.println("Spotify can Pause Audio files");
    }

    @Override
    public void stop() {
        System.out.println("Spotify can Stop Audio files");
    }

    @Override
    public void rewind() {
        System.out.println("Spotify can Rewind Audio files");
    }

    @Override
    public void forward() {
        System.out.println("Spotify can Forward Audio files");
    }

    @Override
    public void speed() {
        System.out.println("Spotify can Speed Audio files");
    }
}
