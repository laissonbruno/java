public class Condicional {
    public static void main(String[] args) {
        boolean includePlan = true;
        double nota = 8.1;
        int anoLancamento = 2023;
        String tipoPlano = "plus";

        if(anoLancamento >= 2023) {
            System.out.println("Lançamento");
        } else {
            System.out.println("Filmes antigos");
        }

        if (includePlan == true || tipoPlano.equals("plus")){
            System.out.println("liberado");
        } else {
            System.out.println("bloqueado");
        }
    }
}
