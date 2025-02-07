package fintech.driver;
import fintech.model.Account;
import fintech.model.Transaction;
import java.util.Scanner;
/**
 * @author 12S23011 Mabel Christoffel A.S
 * @author 12S23027 Amos Manurung
 */
public class Driver2 {

    public static void main(String[] _args) {
        Scanner sc = new Scanner(System.in);
        String Command = sc.nextLine();
        String owner = sc.nextLine();
        String accountname2 = sc.nextLine();
        String Command2 = sc.nextLine();
        String accountname = sc.nextLine();
        Double amount = sc.nextDouble();
        String timestamp = sc.nextLine();
        String note = sc.nextLine();
        Transaction done = new Transaction(accountname, amount, timestamp, note);
        System.out.println(done.output());
        sc.close();
    }
}
