/**
 * Thread che simula la cottura di una singola piastrella in forno.
 * <p>
 * Ogni istanza rappresenta la cottura di una piastrella identificata da un numero.
 * La fase di cottura viene simulata tramite una pausa di 1,5 secondi.
 */
public class CotturaForno extends Thread {

    private int n;

    /**
     * Costruisce un thread per la cottura di una piastrella.
     *
     * @param n il numero identificativo della piastrella
     */
    public CotturaForno(int n) {
        this.n = n;
    }

    /**
     * Esegue la cottura della piastrella.
     * <p>
     * Stampa l'inizio della cottura, attende 1,5 secondi per simulare il processo
     * e poi segnala che la cottura è completata.
     */
    @Override
    public void run() {
        System.out.println("Inizio cottura piastrellla n" + n);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Cottura completata");
    }
}
