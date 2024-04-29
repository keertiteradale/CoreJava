package OOPs.Interface.RealtimeEx;

public class carKe implements Engine, Break{
    void start(){
        System.out.println("Started Car");
        startEngine();
        Break();


    }

    @Override
    public void startEngine() {
        System.out.println("Started Engine");
    }

    @Override
    public void Break() {
        System.out.println("break is working fine");
    }
}
