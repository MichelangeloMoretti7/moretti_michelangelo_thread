import java.util.Scanner;

/**
 * Classe principale per la produzione di piastrelle.
 * <p>
 * Questo programma simula la produzione di un numero specifico di piastrelle.
 * Per ogni piastrella, vengono eseguite le seguenti fasi:
 * <ul>
 *     <li>Preparazione dell'impasto (tramite il thread PreparazioneImpasto)</li>
 *     <li>Cottura in forno (tramite il thread CotturaForno)</li>
 *     <li>Smaltatura (tramite il metodo esegui della classe Smaltatura)</li>
 * </ul>
 * L'utente inserisce il numero di piastrelle da produrre tramite console.
 * <p>
 * La classe utilizza il costrutto {@code join()} per assicurarsi che le fasi di
 * impasto e cottura siano completate prima della smaltatura.
 */
public class ProduzionePiastrelle {

    /**
     * Punto di ingresso del programma.
     * <p>
     * Chiede all'utente quante piastrelle produrre e avvia in sequenza
     * le fasi di produzione per ciascuna piastrella.
     *
     * @param args gli argomenti da linea di comando (non utilizzati)
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quante piastrelle vuoi produrre? ");
        int quantita = scanner.nextInt();

        for (int i = 1; i <= quantita; i++) {
            System.out.println("Inizio produzione piastrella n" + i );

            PreparazioneImpasto impasto = new PreparazioneImpasto(i);
            CotturaForno forno = new CotturaForno(i);
            impasto.start();
            forno.start();

            try {
                impasto.join();
                forno.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Smaltatura smaltatura = new Smaltatura();
            smaltatura.esegui(i);

            System.out.println("Piastrella n " + i + " completata");
        }

        System.out.println("Tutte le piastrelle sono state prodotte");
        scanner.close();
    }
}
