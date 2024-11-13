import java.util.Scanner;

public class programador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do cargo:");
        System.out.println("0001 - Programador Estagiário");
        System.out.println("0002 - Programador Junior");
        System.out.println("0003 - Programador Pleno");
        System.out.println("0004 - Programador Senior");
        System.out.println("0005 - Programador Master");

        int codigoCargo = scanner.nextInt();
        double salarioAtual = 0;
        double novoSalario = 0;
        String cargo = "";

        switch (codigoCargo) {
            case 1:
                cargo = "Programador Estagiário";
                salarioAtual = 1400;
                novoSalario = salarioAtual * 1.10; // aumento de 10%
                break;
            case 2:
                cargo = "Programador Junior";
                salarioAtual = 3000;
                novoSalario = salarioAtual * 1.12; // aumento de 12%
                break;
            case 3:
                cargo = "Programador Pleno";
                salarioAtual = 5500;
                novoSalario = salarioAtual * 1.13; // aumento de 13%
                break;
            case 4:
                cargo = "Programador Senior";
                salarioAtual = 8000;
                novoSalario = salarioAtual * 1.15; // aumento de 15%
                break;
            case 5:
                cargo = "Programador Master";
                salarioAtual = 12000;
                novoSalario = salarioAtual * 1.18; // aumento de 18%
                break;
            default:
                System.out.println("Código de cargo inválido. Por favor, insira um código entre 0001 e 0005.");
                scanner.close();
                return;
        }

        System.out.printf("Cargo: %s\n", cargo);
        System.out.printf("Novo salário: R$ %.2f\n", novoSalario);

        scanner.close();
    }
}

