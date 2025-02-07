package fintech.driver;
import fintech.model.Account;
import java.util.Scanner;
/**
 * @author 12S23011 Mabel Christoffel A.S
 * @author 12S23027 Amos Manurung
 */
public class Driver1 {

    public static void main(String[] _args) {
        Scanner sc = new Scanner(System.in);
        String Command = sc.nextLine();

        if (Command.equals("create-account")) {
            String owner = sc.nextLine();
            String accountname = sc.nextLine();
            Account acc = new Account(owner, accountname, 0);
            System.out.println(acc.toString());
        } 
    sc.close();
    }
}