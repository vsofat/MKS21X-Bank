public class BankAccount {
    //3 instance variables
    private double balance;
    private int accountID;
    private String password;
    
    //Constructors
    public BankAccount (double startBalance, int startID, String startPassword) {
        balance = startBalance;
        accountID = startID;
        password = startPassword;}
    public BankAccount () {
        balance = 0.00;
        accountID = 000000;
        password = "password";
    }
    
    //toString method
    public String toString() {
        return accountID + "\t" + balance;
    }
    
    //Accessors
    public double getBalance () {
        return balance;
    }
    public int getAccountID () {
        return accountID;
    }
    public String getPassword(){
        return password;
    }
    
    //Mutators
    public void setPassword (String newPassword) {
        password = newPassword;
    }
    
    public boolean depositer (double deposit) {
        if (deposit < 0) {
            return false;
        }
        else {
            balance += deposit;
            return true;
        }
    }
    public boolean withdraw (double withdrawal) {
        if (withdrawal < 0 || balance - withdrawal < 0) {
            return false;
        }
        else {
            balance -= withdrawal;
            return true;
        }
    }
    private boolean authenticate(String password){
        return (this.password).equals(password);}}
     /**Transfer money from this BankAccount to the other only when the password matches, and the withdrawal succeeds.
     *@param other which BankAccount to GIVE the money to
     *@param amount how much money to transfer, negative amounts will make this operation fail.
     *@param password to be checked against the source account, incorrect password will make this operation fail.
     *@return true if successful, false otherwise.
     */
    public boolean transferTo(BankAccount other, double amount, String password){
    return  authenticate(password) && withdraw(amount) && depositer(amount);
}
}
