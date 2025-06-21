package June14.Interface;

public class VlcMediaPlayer implements AudioPlayer,VideoPlayer{
    @Override
    public void play() {
        System.out.println("VLC can play Audio");
        System.out.println("VLC can play videos");
    }

    @Override
    public void pause() {
        System.out.println("VLC can play Audio");
        System.out.println("VLC  can play videos");
    }

    @Override
    public void stop() {
        System.out.println("VLC can play Audio");
        System.out.println("VLC can play videos");
    }

    @Override
    public void rewind() {
        System.out.println("VLC can play Audio");
        System.out.println("VLC can play videos");
    }

    @Override
    public void forward() {
        System.out.println("VLC can play Audio");
        System.out.println("VLC can play videos");
    }

    @Override
    public void speed() {
        System.out.println("VLC can play Audio");
        System.out.println("VLC can play videos");
    }
}
