import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá! Digite seus dados para começar.");
        System.out.print("Número da conta: ");
        int numeroDaConta = sc.nextInt();
        System.out.print("Digite o número da agência: ");
        int numeroDaAgencia = sc.nextInt();
        System.out.print("Digite o nome do cliente: ");
        String nomeDoCliente = sc.next();
        System.out.print("Digite o seu saldo atual: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá, " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                            + numeroDaAgencia + ", conta " + numeroDaConta + " e seu saldo de R$" + 
                            saldo + " já está disponível para saque");
    }
}
