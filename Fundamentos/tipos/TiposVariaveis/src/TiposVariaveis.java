public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // "casting" a seguir
        short numeroCurto2 = (short) numeroNormal;

        // variaveis e constantes

        // constantes seguem a palavra "final" e sempre devem ter o nome maisculo.

        final double VALOR_DE_PI = 3.14;

        // o valor não pode ser alterado, é gerado um erro ao tentar realizar a alteração.
        // VALOR_DE_PI = 5;

        System.out.println(VALOR_DE_PI);

    }
}
