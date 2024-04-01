class Customer{
    private String name;
    private int accnumber;
    private int balance;
    
    public void setCustomerInfo(String name, int accnumber, int balance){
        this.name = name;
        this.accnumber = accnumber;
        this.balance = balance;
    }
    
    public void showCustomerInfo(){
        System.out.println("Name " + name);
        System.out.println("AccNumber " + accnumber);
        System.out.println("Balance "+ balance);
    }    
}
public class CustomerDemo {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setCustomerInfo("Manish Gautam", 11, 300000);
        c.showCustomerInfo();
        Customer c1 = new Customer ();
        c1.setCustomerInfo("Ram Bahadur", 10, 200000);
        c1.showCustomerInfo();
    }
}
