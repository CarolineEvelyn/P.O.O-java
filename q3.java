import java.util.Scanner;

public class q3 {
    public static void repetirNome(String nome, int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println(nome);
        }
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Digite um nome e repita 10 vezes, depois 100 vezes");
            System.out.println("2. Sair");
            System.out.print("Digite sua escolha (1 ou 2): ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("\nNome repetido 10 vezes:");
                    repetirNome(nome, 10);
                    System.out.println("\nNome repetido 100 vezes:");
                    repetirNome(nome, 100);
                    break;
                case 2:
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        menu();
    }
}

