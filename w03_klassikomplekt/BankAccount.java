
class BankAccount
{
    private String accountNum;
    private double balance;	
    private String bank;
    CalculateInterest interest;
    double newinterest;


    public BankAccount(String acctNum, double initialBalance, String bankname)//
    {   
        accountNum = acctNum; 
        balance = initialBalance;
        bank = bankname;
         
    }

    public void NewInterest(double interestRate, double period) {
        interest = new CalculateInterest(balance, interestRate, period);
        balance = interest.getInterest();
    }

    public String getAccount()	
    {
        return accountNum;		
    }

    public String getName()	
    {
        return bank;		
    }


    public double getBalance()	
    {
        return balance;			
    }

    public void deposit(double amount)	
    {
        double newBalance = balance + amount;
        balance = newBalance;					
    }

    public void withdraw(double amount)	
    {
        double newBalance = balance - amount;
        balance = newBalance;			
    }

    public void TransactionA(BankAccount destination, double amount)
    {
        destination.balance = destination.balance + amount;
        this.balance = this.balance - amount;
    }

    public void TransactionB(BankAccount destination, double amount)
    {
        destination.deposit(amount);	
        this.withdraw(amount);          
    }
}

   