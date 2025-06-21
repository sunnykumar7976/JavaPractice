package June14.Interface;

public interface AudioPlayer extends MediaPlayer {

    @Override
    abstract public void play();

    @Override
    abstract public void pause();

    @Override
    abstract public void stop();

    @Override
    abstract public void rewind() ;

    @Override
    abstract public void forward() ;

    @Override
    abstract public void speed();
}
