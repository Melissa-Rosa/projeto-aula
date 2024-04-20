import java.util.Scanner;

public class calculdora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o primeiro valor: ");
            int num1 = scanner.nextInt();
            System.out.print("Digite o segundo valor: ");
            int num2 = scanner.nextInt();

            System.out.println("Escolha as operações");
            System.out.println("[1] Somar");
            System.out.println("[2] Subtrair");
            System.out.println("[3] Dividir");
            System.out.println("[4] Multiplicar");
            System.out.println("[5] Sair");
            System.out.print("Digite a opção desejada: ");
            String resposta = scanner.next();

            switch (resposta) {
                case "1":
                    int soma = num1 + num2;
                    System.out.println("O resultado da soma é " + soma);
                    break;
                case "2":
                    int sub = num1 - num2;
                    System.out.println("O resultado da subtração é " + sub);
                    break;
                case "3":
                    if (num2 != 0) {
                        double div = (double) num1 / num2;
                        System.out.println("O resultado da divisão é " + div);
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                    }
                    break;
                case "4":
                    int mult = num1 * num2;
                    System.out.println("O resultado da multiplicação é " + mult);
                    break;
                case "5":
                    System.out.println("Programa encerrado.");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");

                }
            }
        }
    }

