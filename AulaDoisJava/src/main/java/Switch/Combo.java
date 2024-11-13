package Switch;

import java.util.Scanner;

public class Combo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o número do combo:");
        System.out.println("1 - Big Mac");
        System.out.println("2 - Cheddar McMelt");
        System.out.println("3 - Whopper");
        System.out.println("4 - King Costela");
        System.out.println("5 - Chicken Sandwich");

        int combo = scanner.nextInt();

        switch (combo) {
            case 1:
                System.out.println("Combo 1 - Big Mac:");
                System.out.println("Dois hambúrgueres, alface, queijo, molho especial, cebola, picles, pão com gergelim.");
                break;
            case 2:
                System.out.println("Combo 2 - Cheddar McMelt:");
                System.out.println("Pão escuro com gergelim, hambúrguer, queijo cheddar cremoso e cebola grelhada.");
                break;
            case 3:
                System.out.println("Combo 3 - Whopper:");
                System.out.println("Pão com gergelim, hambúrguer de carne bovina, alface, tomate, maionese, ketchup, picles, cebola.");
                break;
            case 4:
                System.out.println("Combo 4 - King Costela:");
                System.out.println("Pão brioche, hambúrguer de carne bovina, queijo cheddar, costela desfiada, chutney de cebola roxa, cebola crispy, onion rings, maionese de alho.");
                break;
            case 5:
                System.out.println("Combo 5 - Chicken Sandwich:");
                System.out.println("Pão com gergelim, peito de frango empanado, alface, maionese.");
                break;
            default:
                System.out.println("Combo inválido. Por favor, escolha um número entre 1 e 5.");
        }

        scanner.close();
    }
}

