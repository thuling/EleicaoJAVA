import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos candidatos serão cadastrados? ");
        int qtdCand = scanner.nextInt();

        cand[] candidatos = new cand[qtdCand];

        for (int i = 0; i < qtdCand; i++) {
            System.out.print("Número do candidato " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            System.out.print("Nome do candidato " + (i + 1) + ": ");
            String nome = scanner.next();

            candidatos[i] = new cand(numero, nome);
        }

        System.out.print("Quantos votos serão computados? ");
        int qtdVotos = scanner.nextInt();

        for (int i = 0; i < qtdVotos; i++) {
            System.out.print("Número do candidato escolhido: ");
            int numeroCandidato = scanner.nextInt();

            while (!scanner.hasNextInt()) {
                System.out.println("O valor digitado não é um número inteiro. Por favor, digite um número inteiro.");
                scanner.next();
            }

            for (cand candidato : candidatos) {
                if (candidato.getNumero() == numeroCandidato) {
                    candidato.atualizarVotos();
                }
            }
        }

        System.out.println("\nResultado da eleição:");
        for (cand candidato : candidatos) {
            System.out.println(candidato.getNumero() + " - " + candidato.getNome() + " - " + candidato.getVotos());
        }
    }
}
