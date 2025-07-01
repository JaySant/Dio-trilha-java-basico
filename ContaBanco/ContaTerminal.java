import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, digite o numero da Conta: ");
        int numeroConta = input.nextInt();

        System.out.print("Por favor, digite o numero da Agência: ");
        String numeroAgencia = input.next();

        System.out.print("Por favor, digite o seu Nome completo: ");
        input.nextLine();
        String nomeCliente = input.nextLine();

        System.out.print("Por favor, insira o seu saldo: ");
        float saldoCliente = input.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                        "conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, numeroAgencia, numeroConta, saldoCliente);
        input.close();
    }
}