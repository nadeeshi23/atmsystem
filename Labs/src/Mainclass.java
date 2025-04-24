import java.util.Scanner;
public class Mainclass {
public static void main (String[] args){
    AtmOperationInterf op = new AtmOperationImpl();
    int atmnumber =12345;
    int atmpin =123;
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to Atm machine" );
    System.out.println("Enter Atm number :");
    int atmNumber = in.nextInt();
    System.out.println("Enter pin number :");
    int pin = in.nextInt();
if((atmNumber==atmnumber) &&(pin==atmpin)) {
    while (true) {
        System.out.println("1.view Avaliable balance \n 2.withdraw amount \n 3.ddeposit amount \n 4.viewministatement \n 5.exit ");
        System.out.println("Enter choice");
        int ch =in.nextInt();
        if (ch==1){
op.viewBalance();
        }
        else if(ch==2){
System.out.println("enter amount to withdraw");
double withdrawAmount = in.nextDouble();
op.withdrawAmount(withdrawAmount);
        } else if (ch == 3) {
System.out.println("Enter amount to deposit");
double depositAmount =in.nextDouble();
op.depositAmount(depositAmount);

        }else if(ch==4){
    }else if(ch==5) {
            System.out.println("collect your Atm card \n thank you");
            System.exit(0);
        }
        }
}
    else {
    System.out.println("incorrect choice");
    System.exit(0);
    }
}
}
