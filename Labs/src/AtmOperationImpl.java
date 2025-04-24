import java.util.HashMap;
import java.util.Map;
public class AtmOperationImpl implements AtmOperationInterf {

Atm atm = new Atm();
Map<Double,String>ministmt = new HashMap<>();
    @Override
    public void viewBalance() {
System.out.println("avaliable balance is" + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount % 500==0) {
            if (withdrawAmount <= atm.getBalance()) {
                ministmt.put(withdrawAmount, "Amount withdraw");
                System.out.println("collect the cash" + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient balance !!");
            }

        }else{
            System.out.println("please enter amount in multiple of 500");
        }
    }
    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount,"Amount deposited");
System.out.println(depositAmount + "Deposit successfully");
atm.setBalance(atm.getBalance() + depositAmount);
viewBalance();
    }

    @Override
    public void viewMiniStatement() {
for(Map.Entry<Double,String>m:ministmt.entrySet()) {
    System.out.println(m.getKey() + "" + m.getValue());
}
}
    }

