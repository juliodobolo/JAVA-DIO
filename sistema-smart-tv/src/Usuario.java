public class Usuario {
    
    public static void main(String[] args) {
        
        SmartTv minhaTv = new SmartTv();

        System.out.println("Tv ligada? " + minhaTv.ligada);
        System.out.println("Canal Atual : " + minhaTv.canal);
        System.out.println("Volume atual : " + minhaTv.volume);
        
        minhaTv.ligar();
        minhaTv.diminuirVolume();
        minhaTv.mudarCanal(5);
        minhaTv.aumentarCanal();


        System.out.println("E agora,Tv ligada? " + minhaTv.ligada);
        System.out.println("E agora,Canal Atual : " + minhaTv.canal);
        System.out.println("E agora,Volume atual : " + minhaTv.volume);
    }
}
