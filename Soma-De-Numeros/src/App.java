import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumerosArmazenados numerosArmazenados = new NumerosArmazenados();

        System.out.println("Escolha uma opcão válida:");
        System.out.println("1- Adicionar número");
        System.out.println("2- Somar números adicionados");
        System.out.println("3- Encontrar maior número");
        System.out.println("4- Encontrar menor número");
        System.out.println("5- Exibir números adicionados");
        System.out.println("6- Encerrar programa");

        int opcao = sc.nextInt();

        if (opcao != 6) {
            do {
                switch (opcao) {
                    case 1:
                        System.out.println("Qual número deseja adicionar?");
                        int numeroAdicionado = sc.nextInt();
                        numerosArmazenados.adicionarNumero(numeroAdicionado);
                        System.out.println("Número adicionado com sucesso!");
                        break;
                    case 2:
                        System.out.println("A soma dos números da lista é: " + numerosArmazenados.calcularSoma());
                        break;
                    case 3:
                        System.out.println("O maior número da lista é: " + numerosArmazenados.encontrarMaiorNumero());
                        break;
                    case 4:
                        System.out.println("O menor número da lista é: " + numerosArmazenados.encontrarMenorNumero());
                        break;
                    case 5:
                        numerosArmazenados.exibirNumeros();
                        break;
                    default:
                        System.out.println("[ERRO] Favor selecionar uma opção válida.");
                }
                System.out.println("Digite uma opção válida: ");
                opcao = sc.nextInt();
            } while (opcao != 6);
        }
    }
}
