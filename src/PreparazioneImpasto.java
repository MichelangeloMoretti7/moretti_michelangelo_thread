/**
 * Thread che simula la preparazione dell'impasto per una singola piastrella.
 * <p>
 * Ogni istanza rappresenta la preparazione dell'impasto di una piastrella identificata da un numero.
 * La fase di preparazione viene simulata tramite una pausa di 1 secondo.
 */
public class PreparazioneImpasto extends Thread {

    private int n;

    /**
     * Costruisce un thread per la preparazione dell'impasto di una piastrella.
     *
     * @param n il numero identificativo della piastrella
     */
    public PreparazioneImpasto(int n) {
        this.n = n;
    }

    /**
     * Esegue la preparazione dell'impasto.
     * <p>
     * Stampa l'inizio della preparazione, attende 1 secondo per simulare il lavoro
     * e poi segnala che l'impasto è pronto per la cottura.
     */
    @Override
    public void run() {
        System.out.println("Inizio preparazione impasto piastrella n" + n);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Impasto piasttrella n" + n + " pronto per la cottura ");
    }
}
