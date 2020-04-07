package BankingSystem;
public class Transaction
{
    public int depositeAmount(int amount,int totalBalance)          //method to deposite amount
    {
        totalBalance=totalBalance+amount;
        return totalBalance;
    }
    public int withdrawAmount(int amount,int totalBalance)          //method to withdraw amount
    {
        if(totalBalance<=0)
        {
            System.out.println("insufficient balance");
        }
        else
        {
            totalBalance=totalBalance-amount;
        }
        return totalBalance;
    }
}
