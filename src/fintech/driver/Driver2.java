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
        int id = 0;
        String Command = sc.nextLine();
        String owner = sc.nextLine();
        String accountname2 = sc.nextLine();
        String Command2 = sc.nextLine();
        String accountname = sc.nextLine();
        String amount = sc.nextLine();
        String timestamp = sc.nextLine();
        String note = sc.nextLine();
        Transaction done = new Transaction(id, accountname, amount, note, timestamp);
        System.out.println(done.output());
        sc.close();
    }
}
