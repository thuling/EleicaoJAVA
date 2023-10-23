public class Teste {
    public static void main (String[]args) {
        Candidato myCand = new Candidato(15, "Haroldo Costa");

        myCand.incVoto();

        myCand.exibirinfo();
    }
}

class Candidato {
    private int numero;
    private String nome;
    private int votos;

    public Candidato(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.votos = 0;
    }

    public void incVoto() {
        votos ++;
    }

    public void exibirinfo() {
        System.out.println("Candidato: " + nome);
        System.out.println("Numero: " + numero);
        System.out.println("Total de votos: " + votos);
    }
}