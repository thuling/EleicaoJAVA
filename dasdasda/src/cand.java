public class cand {

    private int numero;
    private String nome;
    private int votos;

    public cand(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.votos = 0;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public int getVotos() {
        return votos;
    }

    public void votar() {
        votos++;
    }

    public void atualizarVotos() {
        votos++;
    }
}