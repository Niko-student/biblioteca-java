import java.util.Scanner;

public class biblioteca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Livro[] biblioteca = new Livro[0]; // array de objetos Livro
        int soma = 0;

        System.out.println("===Biblioteca===");

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar livros");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Doar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("5 - Mais exemplares");
            System.out.println("6 - Livros com menos de 5 exemplares");
            System.out.println("7 - Total de exemplares");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Quantos livros deseja cadastrar? ");
                    int qtdCadastrar = teclado.nextInt();
                    teclado.nextLine();

                    for (int i = 0; i < qtdCadastrar; i++) {
                        // Expande o array de objetos
                        Livro[] novaLista = new Livro[biblioteca.length + 1];
                        for (int j = 0; j < biblioteca.length; j++) {
                            novaLista[j] = biblioteca[j];
                        }

                        System.out.print("Nome do livro: ");
                        String nome = teclado.nextLine();
                        System.out.print("Quantidade: ");
                        int quant = teclado.nextInt();
                        teclado.nextLine();

                        // Cria o objeto e adiciona no array
                        novaLista[biblioteca.length] = new Livro(nome, quant);
                        soma += quant;
                        biblioteca = novaLista;

                        System.out.println("Livro cadastrado!");
                    }
                    break;
            }
        }
    }
}
