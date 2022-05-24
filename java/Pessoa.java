class Pessoa {
    String nome;
    int idade;
    String cpf; 
    int renda;
    char sexo;

    Pessoa(String nome, int idade, String cpf, int renda, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.renda = renda;
        this.sexo = sexo;
    }

    Pessoa() {

    }

    public void dados() {
        System.out.print("\n\nNome: " + nome);
        System.out.print("\nIdade: " + idade);
        System.out.print("\nCPF: " + cpf);
        System.out.print("\nRenda: " + renda);
        System.out.print("\nSexo: " + sexo);
    }


}