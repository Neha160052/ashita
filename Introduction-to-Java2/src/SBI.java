public class SBI extends Bank{
    String name;
    double balance;
    acc_type accType;
    static long acc_num = 1300010000;
    public SBI(String name, double balance, acc_type accType) {
        this.name = name;
        this.balance = balance;
        this.accType = accType;
        acc_num += 1;
        System.out.println("Name: " + this.name);
        System.out.println("Balance is: " + this.balance);
        System.out.println("Account type is: " + this.accType);
        System.out.println("Account number is: " + acc_num);
        print_details();
        System.out.println();
    }

    @Override
    public String toString() {
        return "Name= " + this.name + " ,Balance= " + this.balance+" ,Account type= "+this.accType+",Account number= "+acc_num+" ,Bank Name= "+get_BankName() +"\n";
    }

    @Override
    double get_ROI() {
        return 7.5;
    }

    @Override
    String get_BankName() {
        return "SBI Bank";
    }

    @Override
    void print_customer_details() {
            print_details();
            System.out.println();
    }

    @Override
    void print_details() {
        System.out.println("Bank Name: "+get_BankName());
        System.out.println("Rate of Interest: "+get_ROI());
    }

    @Override
    double withdraw(double a) {
        try{
            if((this.balance - a) < 0){
                throw new InsufficientAmountException("Insufficient balance");
            }
            else{
                this.balance -=a;
                System.out.println(this.balance);
            }
        }catch(InsufficientAmountException e){
            System.out.println(e.getMessage());
        }
        return this.balance;
    }

    @Override
    double deposit(double a) {
        this.balance +=a;
        System.out.println(this.balance);
        return this.balance;
    }

    @Override
    double checkBalance() {
        return this.balance;
    }


}
