package OOPs.Constructor;

public class ParamConstructor {
    ParamConstructor(String valuefromObjectref)
    {
        this.name = valuefromObjectref;
    }

    String name;

    void PrintDetail()
    {
        System.out.println(name);
    }
}

