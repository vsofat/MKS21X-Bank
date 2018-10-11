public class driver {
    public static void main (String args[]) {
        BankAccount a = new BankAccount(55690, 1010102, "password");
        //Withdraw testre
        if (a.withdraw(1000)) {
            System.out.println("Withdraw works!");
        }
        else{
            System.out.println("Withdraw doesn't work :(");
        }
        //Depositer tester
        if (a.depositer(1000)) {
            System.out.println("Deposit works!");
        }
        else {
            System.out.println("Deposit doesn't work :(");
        }
        //toString tester
        System.out.println(a);
    }
}
