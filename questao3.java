public class Main {
    public static void main(String[] args) {
        Race race = new Race();
        race.startRace();
    }
}

class Race {
    public void startRace() {
        Racer raceInicial = new Racer(1, 1000);
        Racer raceDeStart = new Racer(2, 1000);

        raceInicial.start();
        try {
            raceInicial.join(); //  Esperando ímpar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        raceDeStart.start();
    }
}

class Racer extends Thread {
    private int numeroRace;
    private int totalIterations;

    public Racer(int numeroRace, int totalIterations) {
        this.numeroRace = numeroRace;
        this.totalIterations = totalIterations;
    }

    @Override
    public void run() {
        for (int i = 0; i < totalIterations; i++) {
            System.out.println("Racer " + numeroRace + " - imprimindo");
        }
    }
}
