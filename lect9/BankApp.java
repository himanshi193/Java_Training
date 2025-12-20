//3. Create a class BankAccount with fields accountNumber, accountHolder, and balance. Implement
//methods to deposit and withdraw money.
class BankAccount{
    int accountNumber;
    String accountHolder;
    double balance;
    BankAccount(int accountNumber,String accountHolder,double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited:"+amount+"New Balance:"+balance);
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Withdraw:"+amount+"New Balance:"+balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}
public class BankApp {
    public static void main(String[] args){
        BankAccount b1= new BankAccount(101,"Himanshi",5000);
        b1.deposit(2000);
        b1.withdraw(1000);
        BankAccount b2= new BankAccount(102,"cutuuu",6000);
        b2.deposit(3000);
        b2.withdraw(9000);
    }
}