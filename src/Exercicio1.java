 import java.util.Scanner;

   public class Exercicio1 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Por gentileza, preencha o formulário!");

        System.out.println("Informe o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe o sua idade:");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Você possui um carro? [Sim/ Não]");
        String carro = scanner.nextLine();

        System.out.println("\n\n**********************************");
        System.out.println("Os seus dados seriam:");
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("Possuí um veiculo? " + carro);

        scanner.close();
      }
    }
    
 

