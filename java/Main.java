class Main {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("Maria", 35, "111.222.333-44", 1000, 'F');
    System.out.println("\nDados da Pessoa ");
    pessoa1.dados();


    Heroi heroi1 = new Heroi("Super Forca","Cueca BOX","3oitao","Batcleta","Maria", 35, "111.222.333-44", 1000, 'F');
    System.out.println("\n\n\nDados do Heroi ");
    heroi1.dados();
    heroi1.dadosHeroi();
  }

  
}