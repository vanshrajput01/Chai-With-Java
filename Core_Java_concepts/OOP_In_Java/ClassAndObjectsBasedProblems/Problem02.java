class BankAccount{
    String accountNumber;
    String accountHolder;
    double balance;

    public void deposit(double depositAmount){
        this.balance = this.balance + depositAmount;
        System.out.println("Deposit balance : - " + depositAmount);
    }

    public void withdraw(double withdrawAmount){
        this.balance = this.balance - withdrawAmount;
        System.out.println("withdraw balance : - " + withdrawAmount);
    }

    public void displayBalance(){
        System.out.println("current balance :- " + balance);
    }



}
public class Problem01{
    public static void main(String[] args) {
        BankAccount user01 = new BankAccount();
        user01.accountHolder = "Rohan";
        user01.accountNumber= "05550987789";
        user01.balance = 10000; 
        user01.displayBalance();
        // withdraw 1000;
        user01.withdraw(1000);
        // after withdraw 1000 then current balance is :-
        user01.displayBalance();
        // deposit 15000;
        user01.deposit(15000);
        // after deposit 15000 then current balance is :-
        user01.displayBalance();
    }

    
}
