package June3;

public class HondaCity extends Honda{
    public void carplay(){
        System.out.println("Honda City has Carplay");
    }

    @Override
    public void stop() {
        System.out.println("Honda City Stops");
    }
}
