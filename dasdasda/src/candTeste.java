class candTeste {
    private int numero;
    private String nome;
    private int votos;

    public candTeste(int numero, String nome) {
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