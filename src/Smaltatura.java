/**
 * Classe che simula la smaltatura di una piastrella.
 * <p>
 * La smaltatura viene eseguita per una singola piastrella identificata da un numero.
 * La fase di smaltatura viene simulata tramite una pausa di 0,8 secondi.
 */
public class Smaltatura {

    /**
     * Esegue la smaltatura di una piastrella.
     * <p>
     * Stampa l'inizio della smaltatura, attende 0,8 secondi per simulare il lavoro
     * e poi segnala che la piastrella è pronta.
     *
     * @param n il numero identificativo della piastrella
     */
    public void esegui(int n) {
        System.out.println("Inizio smaltatura della piastrella n" + n);
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Piastrella n " + n + " pronta");
    }
}
