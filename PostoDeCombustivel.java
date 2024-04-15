import java.util.Scanner;

public class PostoDeCombustivel {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("==POSTO DE GASOLINA==\n");
            double gasolina = 4.79;
            double etanol = 3.65;
            int litros = 0;
            System.out.println("Digite o tipo de combustivel: \n1: Etanol\n2: Gasolina\n");
            int produto = input.nextInt();
            System.out.println("Informe a quantidade de litros: ");
            litros = input.nextInt();
            switch (produto) {
                case 1:
                    if (litros < 5) {
                        System.out.println("O valor a pagar é: " + litros * etanol);
                    } else if (litros >= 5) {
                        System.out.println("O valor a pagar é: " + litros * etanol * (1 - 0.10));
                        break;
                    }
                case 2:
                    if (litros < 10) {
                        System.out.println("O valor a pagar é: " + litros * gasolina * (1 - 0.05));
                    } else if (litros >= 10) {
                        System.out.println("O valor a pagar é: " + litros * gasolina * (1 - 0.07));
                        break;
                    }
                default:
                    System.out.println("Opção invalida!");
            }
        }

    }
