public class OOPchallenge1 {
    private String accountNum;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNum;

    public void withdrawal(double withdrawalAmount) {
        if (balance-withdrawalAmount<0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public String getAccNum() {
        return this.accountNum;
    }
    
    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPhoneNum() {
        return this.phoneNum;
    }

    public void setAccNum(String accNum) {
        this.accountNum = accNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNum(int phone) {
        this.phoneNum = phone;
    }

    
}
