import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos candidatos se inscreverão? ");
        int qtdCntd = scanner.nextInt();

        cand[] candidatos = new cand[qtdCntd];

        for (int i = 0; i < qtdCntd; i++) {
            System.out.print("Número do candidato " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            System.out.print("Nome do candidato " + (i + 1) + ": ");
            String nome = scanner.next();

            candidatos[i] = new cand(numero, nome);
        }

        System.out.print("Qual será a quantidade de votos computados?? ");
        int qtdVotos = scanner.nextInt();

        for (int i = 0; i < qtdVotos; i++) {
            System.out.print("Número do candidato selecionado: ");
            int numeroCandidato = scanner.nextInt();

            for (cand candidato : candidatos) {
                if (candidato.getNumero() == numeroCandidato) {
                    candidato.atualizarVotos();
                }
            }
        }

        System.out.println("\nResultado:");
        for (cand candidato : candidatos) {
            System.out.println(candidato.getNumero() + " - " + candidato.getNome() + " - " + candidato.getVotos());
        }
    }
}
