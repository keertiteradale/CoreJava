package OOPs.Abstraction.Example3;

public class TC2_FIREFOX extends BaseClass{
    @Override
    String openbrowser() {
        System.out.println("Starting Firefox");
        return null;
    }

    @Override
    String closebrowser() {
        System.out.println("Closing Firefox");
        return null;
    }
}
