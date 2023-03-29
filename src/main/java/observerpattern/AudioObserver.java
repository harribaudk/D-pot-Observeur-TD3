package observerpattern;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AudioObserver implements ObserverPattern.DataObserver {


    public void update(String fileName) {         // Créer un objet AudioInputStream à partir du fichier audio WAV
        // Code d'observation pour les audios
        if (fileName.contains("/wav/")) {
            LocalTime now = LocalTime.now();

            // Formater l'heure dans le format souhaité (hh:mm:ss)
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedTime = now.format(formatter);
            String content = formattedTime;


            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Observation des audios...");

            content += " ::Fichier compressé : " + fileName;
            FileWriter.writeToFile("./data/compressed/wav/AudioCompressionObserver.txt", content);
            System.out.println("-----------------------------------------------------------------------");

        }
    }
}