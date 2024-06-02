import java.util.ArrayList;

public class NumerosArmazenados {
    ArrayList<Integer> numero = new ArrayList<>();

    public void adicionarNumero (int numero) {
        this.numero.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (int numeros : numero) {
            soma += numeros;
        }
        return soma;
    }
    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numero.isEmpty()) {
            for (int numeros : numero) {
                if (numeros >= maiorNumero) {
                    maiorNumero = numeros;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("[ERRO] Lista vazia!");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numero.isEmpty()) {
            for (int numeros : numero) {
                if (numeros <= menorNumero) {
                    menorNumero = numeros;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("[ERRO] Lista vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numero.isEmpty()) {
            System.out.println(numero);
        } else {
            throw new RuntimeException("[ERRO] Lista vazia!");
        }
    }
}
