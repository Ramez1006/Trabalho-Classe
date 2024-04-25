import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de cliente (char): ");
        String tipoCliente = scanner.nextLine();

        if (tipoCliente.length() != 1 || Character.isDigit(tipoCliente.charAt(0))) {
            System.out.println("Tipo de cliente inválido. Deve ser um único caractere.");
            return;
        }

        System.out.println("Cliente cadastrado com tipo: " + tipoCliente);

        int quantidadeCadastros = 0; // Substitua por lógica para obter a quantidade de cadastros

        if (quantidadeCadastros <= 0) {
            System.out.println("Cliente não está apto a selecionar o produto. Realize o cadastro primeiro.");
            return;
        }

        System.out.println("Digite o produto que deseja comprar (B): ");
        String escolhaProduto = scanner.nextLine();

        if (!escolhaProduto.equals("B")) {
            System.out.println("Produto inválido. Digite B para comprar o produto B.");
            return;
        }

        double precoProduto = 20; // Substitua por lógica para obter o preço do produto

        if (precoProduto != 20) {
            System.out.println("Produto não corresponde ao desejado. O preço deve ser de R$20,00.");
            return;
        }

        System.out.println("Compra do produto " + escolhaProduto + " efetuada!");
        // Imprimir nota fiscal (substitua por lógica para imprimir a nota fiscal)
    }
}
