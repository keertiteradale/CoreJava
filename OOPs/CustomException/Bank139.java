package OOPs.CustomException;

public class Bank139 {
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    private String currency;

    public String getCurrency() {
        return currency;
    }

    public Integer getAmount() {
        return amount;
    }

    private Integer amount;

    public Bank139(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Integer add(Bank139 bankname) throws CustomException139 {
        if (!(bankname.currency.equalsIgnoreCase("INR"))){
            throw new CustomException139("USD to INR not upported");
        }
        Integer sum=this.amount+bankname.amount;
        return sum;
    }
   }
