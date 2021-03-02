public class Bank {
    String bankname;
    BankAccount bankaccount;
    
    public Bank(String name) {
        bankname = name;  
    }
    
    public void newAccount(String accnumber, double amount, String bankname) {///
        bankaccount = new BankAccount(accnumber, amount, bankname);
    }
   
}
