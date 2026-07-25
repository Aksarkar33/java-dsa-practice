interface Payable{
    void pay(double amount);
}
public class BankAcccount implements Payable {
    private double balance;
    public BankAcccount(double balance){
        this.balance=balance;
    }
    public void pay(double amount){
        balance-=amount;
    }
  public void deposit(double amount) {
    balance=balance+amount;
}
    public void withdraw(double amount) {
        // if amount > balance, print "Insufficient funds"
        if (amount>balance) {
            System.out.println("Insufficient balance");
        }else{
        // otherwise subtract amount from balance
        balance=balance-amount;}
    }
    public double getBalance(){
        
        return balance;
        
    }

    public static void main(String[] args){
        BankAcccount bAcccount = new BankAcccount(900);
        bAcccount.deposit(100);
        System.out.println();
        bAcccount.withdraw(33);

        System.out.println(bAcccount.getBalance());
                bAcccount.pay(50);
System.out.println(bAcccount.getBalance());
    }

}
