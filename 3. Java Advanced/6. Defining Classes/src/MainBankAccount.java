import java.util.Scanner;

public class MainBankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String classInput = scanner.nextLine();
        while (!classInput.equals("End")) {
            String[] arrInput = classInput.split("\\s+");
            String action = arrInput[0];
            if (action.equals("Create")) {
                System.out.println(String.format("Account ID%d created", BankAccount.getBankAccountCount()));
                new BankAccount();
            }
            if (action.equals("Deposit")) {
                int id = Integer.parseInt(arrInput[1]);
                BankAccount c = new BankAccount();
                c.getObjectFromId(id);
                double amount = Double.parseDouble(arrInput[2]);
                System.out.println(String.format("Deposited %.0f to ID%d", amount, id));
            }
            if (action.equals("GetInterest")) {
                int idInterest = Integer.parseInt(arrInput[1]);
                int years = Integer.parseInt(arrInput[2]);
            }
            classInput = scanner.nextLine();
        }
    }

}
