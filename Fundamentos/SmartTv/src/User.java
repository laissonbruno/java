public class User {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ?" + smartTv.ligada);
        System.out.println("Volume atual :" + smartTv.volume);
        System.out.println("Canal atual :" + smartTv.canal);

        smartTv.ligar();
        
        System.out.println("Novo status :" + smartTv.ligada);
        smartTv.desliga();
        System.out.println("Novo status :" + smartTv.ligada);
        smartTv.ligar();
        System.out.println("Novo status :" + smartTv.ligada);


        smartTv.aumentarVolume();
        System.out.println("Volume atual:" + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual:" + smartTv.volume);
    }
}
