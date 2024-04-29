package OOPs.Abstraction.Example3;

public class TC1_CHROME extends BaseClass{
    @Override
    String openbrowser() {
        System.out.println("Starting CHROME");
        return null;
    }

    @Override
    String closebrowser() {
        System.out.println("Closing CHROME");
        return null;
    }
}
