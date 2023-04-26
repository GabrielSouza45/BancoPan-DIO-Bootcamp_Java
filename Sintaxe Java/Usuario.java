public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo Volume Atual +1: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Volume Atual -1: " + smartTv.volume);

        smartTv.diminuirVolumeDefinir(5);
        System.out.println("Novo Volume Atual -5: " + smartTv.volume);

        smartTv.aumentarVolumeDefinir(25);
        System.out.println("Novo Volume Atual +25: " + smartTv.volume);

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal Atual -1: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal Atual +1: " + smartTv.canal);

        smartTv.canalDefinir(305);
        System.out.println("Canal Atual '305': " + smartTv.canal);
    }
}
