# Produzione Piastrelle

Questo progetto in Java simula la produzione di piastrelle, passando per tre fasi:

- Preparazione dell’impasto
- Cottura in forno
- Smaltatura

Le prime due fasi vengono eseguite in parallelo usando i thread, mentre la smaltatura avviene dopo.

## 1. Funzionamento

Il programma chiede quante piastrelle si vogliono produrre, poi per ogni piastrella:

- Viene preparato l’impasto
- Si avvia la cottura
- Dopo la fine di entrambe le operazioni, avviene la smaltatura

Al termine, viene mostrato un messaggio che indica che tutte le piastrelle sono state completate.

## 2. Struttura del progetto

- ProduzionePiastrelle: classe principale con il metodo main
- PreparazioneImpasto: thread che prepara l’impasto
- CotturaForno: thread che cuoce la piastrella
- Smaltatura: classe che gestisce la fase finale

## 3. Tecnologie

- Java
- Thread e sincronizzazione con join()
- Uso di Thread.sleep() per simulare i tempi di lavoro
- Input da tastiera con Scanner

## 4. Istruzioni d’uso

1. Avvia il programma con un ambiente Java.
2. Inserisci il numero di piastrelle da produrre quando richiesto.
3. Segui i messaggi a video per vedere le fasi di produzione.
4. Al termine, il programma mostrerà che tutte le piastrelle sono pronte.

## 5. Esempio di output

Quante piastrelle vuoi produrre? 2

Inizio produzione piastrella n1

Inizio preparazione impasto piastrella n1

Inizio cottura piastrellla n1

Impasto piastrella n1 pronto per la cottura

Cottura completata

Inizio smaltatura della piastrella n1

Piastrella n 1 completata

Tutte le piastrelle sono state prodotte

## 6. Contatti

- Contatti: Creato da Moretti Michelangelo – Email: emailmichelangeloprova@gmail.com
