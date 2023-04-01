import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 – Verifica se um número é divisível por 3");
        System.out.println("2 – Verifica se um número é divisível por 7");
        int opcao = ler.nextInt();

        System.out.println("Digite um número:");
        int numero = ler.nextInt();

        switch (opcao) {
            case 1:
                if (numero % 3 == 0) {
                    System.out.println("O número é divisível por 3.");
                }
                else {
                    System.out.println("O número não é divisível por 3.");
                }
                break;

            case 2:
                if (numero % 7 == 0) {
                    System.out.println("O número é divisível por 7.");
                }
                else {
                    System.out.println("O número não é divisível por 7.");
                }
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

}
