package pilares.interface1.estabelecimento;

import pilares.interface1.equipamentos.impressora.Deskjet;
import pilares.interface1.equipamentos.impressora.Impressora;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new Deskjet();

        impressora.imprimir();
    }
}
