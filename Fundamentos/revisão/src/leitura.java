import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite algo");
        String algo = leitura.nextLine();
        System.out.println("Ano");
        int ano = leitura.nextInt();
        System.out.println("Digite um numero decimal");
        double decimal = leitura.nextDouble();
        System.out.println(algo);
        System.out.println(ano);
        System.out.println(decimal);
    }
}
