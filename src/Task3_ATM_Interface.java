import java.util.Scanner;

class BankAccount{
    private double balance;

    public BankAccount(double IB) {
       balance = IB; // initial balance
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public boolean withDraw(double amount){
        if(amount <= balance){
            balance -= amount;
            return true;
        }
        else {
            return false;
        }

    }
}
class ATM
{
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }
    public void DisplayMenu(){
        System.out.println("Welcome to the ATM! ");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.WithDraw");
        System.out.println("4.Exit");
        System.out.println("_______________________________");
    }
    public void PT(){
        Scanner sc = new Scanner(System.in);
        int choice;
        double amount;

        while(true){
            DisplayMenu();
            System.out.print("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is : Rs."+ account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter the deposit amount : Rs.");
                    amount= sc.nextDouble();
                    if(amount > 0){
                        account.deposit(amount);
                        System.out.println("Deposit Successful!! ");
                    }
                    else{
                        System.out.println("Invalid Deposit !!");
                    }
                    break;

                case 3:
                    System.out.print("Enter the withdrawal amount: Rs.");
                    amount = sc.nextDouble();
                    if(amount > 0 ){
                        account.withDraw(amount);//**imp
                        System.out.println("WithDraw Successful !! ");
                    }
                    else{
                        System.out.println("Invalid Withdrawal or insufficient balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you !!");
                    return;
                default:
                    System.out.println("Invalid Choice , try again !");
            }
        }

    }
}
public class Task3_ATM_Interface {
    public static void main(String[] args){
        BankAccount useraccount = new BankAccount(100000);
        ATM atm = new ATM(useraccount);
        atm.PT();
    }

}