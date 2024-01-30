public class Shop 
{
    private int profit;
    public Shop()
    {
        profit=0;
    }
    public int getProfit()
    {
        return profit;
    }
    public void earn(Group group, int amount)
    {
        Customer[] customers = group.getCustomers();
        int numOfCustomers = customers.length;
        int share = amount/numOfCustomers;
        for(int num=0; num<numOfCustomers; num++)
        {
            customers[num].deductAmount(share);
        }
        profit+=amount;
    }
    public void earn(Customer customer, int amount)
    {
        customer.deductAmount(amount);
        profit+=amount;
    }
    
}
