public abstract class Bank {
    abstract double get_ROI();
    abstract String get_BankName();
    enum acc_type{
        SAVINGS, CURRENT }
    abstract void print_customer_details();
    abstract void print_details();
    abstract double withdraw(double a);
    abstract double deposit(double a);
    abstract double checkBalance();
}

class InsufficientAmountException extends Exception{
    public InsufficientAmountException(String str){
        super(str);
    }
}
