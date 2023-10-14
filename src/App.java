import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu primeiro nome: ");
        String firstName = scanner.nextLine();
        System.out.print("Digite seu ultimo nome: ");
        String lastName = scanner.nextLine();
        System.out.print("Digite seu cpf: ");
        String cpf = scanner.nextLine();
        User user = new User(firstName, lastName, cpf);
        Boolean isRunning = true;
        while (isRunning) {
            System.out.println("Selecione uma opcao");
            System.out.println("0 - Ver saldo");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Encerrar");
            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    user.getAccount().getBalance();
                    break;
                case 1:
                    System.out.print("Digite o valor: ");
                    double value1 = scanner.nextDouble();
                    user.getAccount().withdraw(value1);
                    break;
                case 2:
                    System.out.print("Digite o valor: ");
                    double value2 = scanner.nextDouble();
                    user.getAccount().deposit(value2);
                    break;
                case 3:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Selecione uma opcao valida");
            }
        }
    }
}
