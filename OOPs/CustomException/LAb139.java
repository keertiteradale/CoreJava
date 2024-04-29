package OOPs.CustomException;

public class LAb139 {
    public static void main(String[] args) throws CustomException139 {
        Bank139 jpchase=new Bank139("USD", 100);
        Bank139 hdfc = new Bank139("INR",100);
        Bank139 icici = new Bank139("INR", 100);
        try {
            System.out.println(hdfc.add(jpchase));
        } catch (CustomException139 e) {
            throw new RuntimeException(e);
        }
        System.out.println(hdfc.add(icici)); //Custom Exception


    }
    }

