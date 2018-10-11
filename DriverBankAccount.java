public class DriverBankAccount{
    public static void main(String[]args){
        BankAccount b1 = new BankAccount(1000.0, 1000001, "abc123");
        BankAccount b2 = new BankAccount(1234.0, 1000231, "abcasdg23");
        
        System.out.println("Account b1:");
        System.out.println(b1);
        System.out.println("Account b2:");
        System.out.println(b2);
        System.out.println();
        
        
        if (b1.transferTo(b2, 100.0, "abc123")) {
            System.out.println("Transfer " + 100.0 + " to " + b2 + " from " + b1 + " Successful");
        }
        else {
            System.out.println("Transfer 1 is a FAILURE");
        }
        if (b2.transferTo(b1, 100.0, "abcasdg23")) {
            System.out.println("Transfer " + 100.0 + " to " + b1 + " from " + b2 + " Successful");
        }
        else {
            System.out.println("Transfer 2: FAILURE");
        }
        System.out.println();
        

            System.out.println("Account b1:");
            System.out.println(b1);
            System.out.println("Account b2:");
            System.out.println(b2);
            System.out.println();
        }
    }
