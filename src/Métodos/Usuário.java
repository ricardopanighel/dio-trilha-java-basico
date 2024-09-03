package src.Métodos;

public class Usuário {
    public static void main(String[] args) throws Exception{
        SistemaSmartTV smartTv = new SistemaSmartTV();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Em qual canal a TV está? " + smartTv.canal);
        System.out.println("Qual é o volume da TV? " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.diminuirVolume ();

        smartTv.buscarCanal(3788);
    }
}
