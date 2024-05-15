public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("Canal ? " + smartTv.canal);
        System.out.println("Volume ? " + smartTv.volume);

        smartTv.ligar();
        // chama o metodo de ligar a TV
        System.out.println("Tv ligada ? " + smartTv.ligada);
        
        // Chama o método e aumenta o canal
        smartTv.aumentarCanal();
        System.out.println("Canal ? " + smartTv.canal);

        // Chama o método de baixar  o volume 
        smartTv.baixarVolume();
        System.out.println("Volume ? " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal ? " + smartTv.canal);
        
    }
}
