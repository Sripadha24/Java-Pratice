package Interface;

public class MediaPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Playing Media");
    }

    @Override
    public void stop() {
        System.out.println("Stopped Media");
    }
}
