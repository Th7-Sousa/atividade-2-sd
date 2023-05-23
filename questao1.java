// 1. Crie uma classe Racer que possui um “while (true)” e imprime a frase “Racer 
// i – imprimindo” onde i deve ser um parâmetro do seu construtor. Transforme 
// esta classe em uma Thread usando uma das formas de criação e instanciação.

public class Main {
    public static void main(String[] args) {
        Racer racer1 = new Racer(1);
        Racer racer2 = new Racer(2);
        
        racer1.start();
        racer2.start();
    }
}

class Racer extends Thread {
    private int numeroRace;
    
    public Racer(int numeroRace) {
        this.numeroRace = numeroRace;
    }
    
    @Override
    public void run() {
        while (true) {
            System.out.println("Racer " + numeroRace + " - imprimindo");
        }
    }
}
