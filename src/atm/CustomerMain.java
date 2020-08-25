package atm;

public class CustomerMain {
    public static void main(String[] args) {
        Customer tom = new Customer(1,"tom","pss46111584");
        Customer tang = new Customer(2,"tang","pcc50111524");

//        System.out.println(tom);
//        System.out.println(tang);
//
//        System.out.println(tom.checkPin("pss46111584"));

        Bank bank = new Bank("My Bank");
        bank.addCustomer(tom);
        bank.addCustomer(tang);

//        Customer c1 = bank.findCustomer(1);
//        Customer c2 = bank.findCustomer(2);
//        Customer c3 = bank.findCustomer(3);
//
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);
        ATM atm = new ATM(bank);
        atm.validateCustomer(1,"pss46111584");
        atm.deposit(1000);
        System.out.println(tom);

        atm.transfer(2,200);
        System.out.println(tom);
        System.out.println(tang);

        System.out.println(bank);

    }
}
