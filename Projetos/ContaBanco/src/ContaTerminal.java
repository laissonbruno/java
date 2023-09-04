import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 50.55;

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = sc.nextInt();
        
        
        sc.nextLine();
        
        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = sc.nextLine();
        System.out.println();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é a " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}