public class Atm {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;
 public Atm(){

 }
 public double getBalance(){

     return balance;
 }
 public void setBalance(double balance){
     this.balance = balance;
 }
 public double getDepositAmount(double depositAmount){
     this.depositAmount =depositAmount;
     return depositAmount;
 }
 public void setWithdepositAmount(double depositAmount){
     this.depositAmount= depositAmount;
 }
public void setWithdrawAmount(double withdrawAmount){
     this.withdrawAmount = withdrawAmount;
}
    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public static void main(String[] args){



    }
}
