public class Group 
{
  private Customer[] customers;
  private int count;
  public Group()
  {
    customers = new Customer[10];
    count=0;
  }  
  public void add(Customer customer)
  {
    if (count<customers.length)
    {
        customers[count] = customer;
        count++;
    }
  }
  public Customer[] getCustomers()
  {
    Customer[] result = new Customer[count];
    for(int num = 0; num<count; num++)
    {
        result[num]=customers[num];
    }
    return result;
  }
    
}
