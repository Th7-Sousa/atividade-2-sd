
// 2. Crie uma classe Race que cria e executa 10 racers (identificadores de 1 a 10). 

public class Main {
    public static void main(String[] args) {
        Race race = new Race();
        race.startRace();
    }
}

class Race {
    public void startRace() {
        for (int i = 1; i <= 10; i++) {
            Racer racer = new Racer(i);
            racer.start();
        }
    }
}

class Racer extends Thread {
    private int numeroRace;
    
    public Racer(int numeroRace) {
        this.numeroRace = nu;
    }
    
    @Override
    public void run() {
        while (true) {
            System.out.println("Racer " + numeroRace + " - imprimindo");
            try {
                Thread.sleep(1000); // ADD TEMPO DE ESPERAA
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// a) Como se deu o comportamento dos prints?
// RESPOSTA: Os prints podem aparecer em uma sequência intercalada e imprevisível, considerando que não há tempo de espera.

// b) Adiciona um tempo de espera (usando o método sleep) nos Racers, o que houve com comportamento do sistema?
// RESPOSTA: haverá um atraso entre as execuções das threads. Cada thread vai ter que aguardar o tempo especificado.

// c) Utilize o método setPriority (java) para definir as condições de corrida. Houve mudanças na execução? Se sim, descreva-as.

// RESPOSTA: 

// class Race {
//     public void startRace() {
//         for (int i = 1; i <= 10; i++) {
//             Racer racer = new Racer(i);
//             racer.setPriority(i); // Usando o setPriority
//             racer.start();
//         }
//     }
// }

// Sim, as threads com maior peioridade de acordo com o contador são printadas com mais frequência;