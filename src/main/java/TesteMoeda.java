import java.util.Scanner;

public class TesteMoeda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Moeda moeda = new Moeda();
        System.out.println("Informe o valor em reais: R$ ");
        moeda.valorReal = leitor.nextDouble();
        System.out.println("Informe a cotacao do dolar de hoje: ");
        moeda.cotacaoDolar = leitor.nextDouble();
        moeda.calcularConversao();
        System.out.println("A quantidade convertida é: "+ moeda.quantidadeDolar);

    }
}
