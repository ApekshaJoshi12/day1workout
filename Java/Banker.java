class Bank{
    private int balance;
    public void getBalance(){
        System.out.println(balance) ;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
}
public class Banker{
    public static void main(String[] args) {
        Bank b1=new Bank();
        Bank b2=new Bank();
        b1.setBalance(200);
        b2.setBalance(3000);
        b1.getBalance();
        b2.getBalance();
    }
}