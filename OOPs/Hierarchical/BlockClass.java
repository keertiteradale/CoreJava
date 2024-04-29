package OOPs.Hierarchical;

public class BlockClass {
    //Instance Initialization Block
    {
        System.out.println("I am IIB");
    }
    BlockClass() // Default Constructor
    {
        System.out.println("Im DC");
    }

    static
    {
        //SIB - Static Initialization Block
        System.out.println("Im SIB");
    }
}
