package atm;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount tom = new BankAccount(1,"siriboon","Saving");
        BankAccount tang = new BankAccount(2,"chutima","Checking",1000);

        tom.deposit(500);
        tang.withdraw(200);

        System.out.println(tom);
        System.out.println(tang);
    }
}
