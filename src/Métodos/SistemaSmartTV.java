package src.Métodos;

public class SistemaSmartTV {
        boolean ligada = false;
        int canal = 1;
        int volume = 0;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        if (volume > 100) {
            volume = 100;
        }
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        if (volume < 0) {
            volume = 0;
        }
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void canalMais() {
        canal++;
        System.out.println("Canal " + canal);
    }

    public void canalMenos() {
        canal--;
        if (canal < 0) {
            canal = 0;
        }
        System.out.println("Canal " + canal);
    }

    public void buscarCanal(int novoCanal) {
        canal = novoCanal;
        if (canal < 0) {
            canal = 0;
        }
        System.out.println("Canal " + canal);
    }
}
