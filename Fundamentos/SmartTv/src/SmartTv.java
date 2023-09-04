public class SmartTv {

        boolean ligada = false;
        int canal = 1;
        int volume = 10;
        
        public void ligar(){
            ligada=true;
        }
        public void desliga(){
            ligada=false;
        }

        public void aumentarVolume(){
            volume++;
        }

        public void diminuirVolume(){
            volume--;
        }
}
