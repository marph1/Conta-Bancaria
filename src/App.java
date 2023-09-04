import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Numero da conta: ");
            int numero_conta = scan.nextInt();
            scan.nextLine();

            System.out.println("Numero da agencia: ");
            String numero = scan.nextLine();

            System.out.println("Nome de cliente: ");
            String nome = scan.nextLine();

            System.out.println("valor (em decimal) para saque: ");
            double saldo_saque = scan.nextDouble();

            Conta Conta = new Conta(numero_conta, numero, nome, 7000);
            if (Conta.getSaldo() < saldo_saque){
                System.out.println("Valor indisponivel para saque!");
            } else {
                System.out.println("Valor disponivel para saque, sacando!");
            }
        }
    }
}
