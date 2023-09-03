package edu.laisson.secondweek;
public class MyClassAtual {
    public static void main(String[] args) {
        String primeiroNome = "Laisson";
        String segundoNome = "Bruno";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
