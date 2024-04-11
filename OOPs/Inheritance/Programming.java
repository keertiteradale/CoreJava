package OOPs.Inheritance;

public class Programming {
    int version;
    String author;

    Programming() //Default Constructor
    {
        System.out.println("Default Constructor Program");
    }
    Programming(String author, int version)
    {
        this.author = author;
        this.version = version;

    }

    void PrintInfo()
    {
        System.out.println("Program Info -->" +this.version +"\n Author --> " +this.author);
    }
}
