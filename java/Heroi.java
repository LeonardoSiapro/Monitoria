class Heroi extends Pessoa {
    String poder;
    String fantasia;
    String arma;
    String veiculo;

    Heroi(String poder, String fantasia, String arma, String veiculo,
            String nome, int idade, String cpf, int renda, char sexo) {
        this.poder = poder;
        this.fantasia = fantasia;
        this.arma = arma;
        this.veiculo = veiculo;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.renda = renda;
        this.sexo = sexo;
    }


    public void dadosHeroi() {
        System.out.print("\n\nPoder: " + poder);
        System.out.print("\nFantasia: " + fantasia);
        System.out.print("\nArma: " + arma);
        System.out.print("\nVeiculo: " + veiculo);
    }

}