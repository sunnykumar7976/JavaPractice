package June14.Interface;

public class MxPlayer implements AudioPlayer, VideoPlayer{
    @Override
    public void play() {
        System.out.println("Mx Player can play Audio");
        System.out.println("Mx Player can play videos");
    }

    @Override
    public void pause() {
        System.out.println("Mx Player can play Audio");
        System.out.println("MX Player Music can play videos");
    }

    @Override
    public void stop() {
        System.out.println("Mx Player can play Audio");
        System.out.println("Mx Player can play videos");
    }

    @Override
    public void rewind() {
        System.out.println("Mx Player can play Audio");
        System.out.println("Mx Player can play videos");
    }

    @Override
    public void forward() {
        System.out.println("Mx Player can play Audio");
        System.out.println("Mx Player can play videos");
    }

    @Override
    public void speed() {
        System.out.println("Mx Player can play Audio");
        System.out.println("Mx Player can play videos");
    }
}
