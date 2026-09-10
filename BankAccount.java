class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(int accountNumber , String accountHolder , double Balaence){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void deposite (double amount){
        balance = balance + amount;
        System.out.println("Amount Deposite: " + amount);
    }
    void withdraw(double amount){
        if (amount <= balance){
            balance = balance - amount;
            System.out.println("Amount Withdraw:" + amount);
          }else{
            System.out.println("Insufficient Balance");
          }
    }
    void displayBalance(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
     }

     public static void main(String[] args) {
         BankAccount account = new BankAccount (102 , "gauri" , 5000);
         account.deposite(2000);
         account.withdraw(1000);
         account.displayBalance();
     }
}