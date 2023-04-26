public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada= true;
    }

    public void desligar(){
        ligada= false;
    }

    public void aumentarVolume(){
        volume ++;
    }

    public void diminuirVolume(){
        volume --;
    }

    public void diminuirVolumeDefinir(int quantidade){
        volume -= quantidade;
    }

    public void aumentarVolumeDefinir(int quantidade) { volume += quantidade; }

    public void aumentarCanal() { canal ++; };
    public void diminuirCanal() { canal --; };
    public void canalDefinir(int novoCanal) { canal = novoCanal; };

    public static void main(String[] args) {



    }
}
