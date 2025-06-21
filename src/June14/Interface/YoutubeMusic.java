package June14.Interface;

public class YoutubeMusic implements AudioPlayer, VideoPlayer{

    @Override
    public void play() {
        System.out.println("YoutubeMusic can play Audio");
        System.out.println("Youtube Music can play videos");
    }

    @Override
    public void pause() {
        System.out.println("YoutubeMusic can play Audio");
        System.out.println("Youtube Music can play videos");
    }

    @Override
    public void stop() {
        System.out.println("YoutubeMusic can play Audio");
        System.out.println("Youtube Music can play videos");
    }

    @Override
    public void rewind() {
        System.out.println("YoutubeMusic can play Audio");
        System.out.println("Youtube Music can play videos");
    }

    @Override
    public void forward() {
        System.out.println("YoutubeMusic can play Audio");
        System.out.println("Youtube Music can play videos");
    }

    @Override
    public void speed() {
        System.out.println("YoutubeMusic can play Audio");
        System.out.println("Youtube Music can play videos");
    }
}
