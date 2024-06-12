package com.br.Main;

import com.br.Cliente.InfoCliente;
import com.br.Contas.Conta;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InfoCliente cliente = new InfoCliente();
        Conta conta = new Conta();
        String tipoDeConta;

        System.out.println("Bem vindo ao sistema de Identificação do Banco Brasil!");
        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();
        cliente.setNome(nome);
        System.out.println("Olá, " + nome + "! Digite o seu cpf:");
        String cpf = sc.nextLine();
        if (cpf.length() != 11) {
            while (cpf.length() != 11) {
                System.out.println("Número de cpf inválido, por favor tente novamente:");
                cpf = sc.nextLine();
            }
        }
        cliente.setCpf(cpf);
        System.out.println("Você é correntista? Digite '1' para sim e '2' para não:");
        int opcao = sc.nextInt();
        do {
            switch (opcao) {
                case 1:
                    cliente.setTipoDeConta("Corrente");
                    break;
                case 2:
                    cliente.setTipoDeConta("Poupança");
                    System.out.println("Usaremos sua conta to tipo 'Poupança' neste caso.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    opcao = sc.nextInt();
                    break;
            }
        } while (opcao != 1 && opcao != 2) ;

        System.out.println("O que você deseja fazer?");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - sair");
        int opcaoMenu = sc.nextInt();
        do {
            switch (opcaoMenu) {
                case 1:
                    System.out.println("Qual o valor você deseja sacar?");
                    double saque = sc.nextDouble();
                    conta.sacar(saque);
                    break;
                case 2:
                    System.out.println("Qual valor deseja depositar?");
                    double deposito = sc.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 3:
                    System.out.println("Fechando aplicativo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    opcaoMenu = sc.nextInt();
                    break;
            }
            System.out.println("Escolha outra opção:");
            opcaoMenu = sc.nextInt();

        } while (opcaoMenu != 3);

    }
}
