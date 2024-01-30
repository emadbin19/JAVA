public class Customer 
{
    private int amount;
    public Customer(int amount)
    {
        this.amount=amount;
    }
    public int getAmount()
    {
        return amount;
    }
    public void deductAmount(int amount)
    {
        this.amount-=amount;
    }
}
