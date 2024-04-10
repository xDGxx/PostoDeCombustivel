import java.util.Scanner;

/*Nesse código solicitei as informações de qual item o usuario iria escolher
 para realizar o abastecimento do seu veículo, em seguida informei todas as variáveis que seriam utilizadas e seu tipo
 usando a variável "litros" escolheriamos a quantidade de litros que o usuario escolheria, após a solicitação,
 o usuário deveria informar 1 para gasolina e 2 para etanol, utilizei a variavel "produto" para que o cliente informe
 dentro do switch se é gasolina ou etanol, para realizar a conta, foi simples * (1-0.05) para 5%
 e assim em diante (lembrando que % representa resto de divisão em java).
 */

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
