package pilares;

public class Carro extends Veiculo {    

    public void ligar() {
        confereCombistivel();
        confereCambio();
        System.out.println("Carro ligado");
    }

    public void confereCombistivel(){
        System.out.println("conferindo combustivel");
    }
    public void confereCambio(){
        System.out.println("conferindo cambio em P");
    }

}
