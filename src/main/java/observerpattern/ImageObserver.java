package observerpattern;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ImageObserver implements ObserverPattern.DataObserver {


    public void update(String fileName) {
        // Code d'observation pour les images
        if (fileName.contains("/jpg/")) {
            LocalTime now = LocalTime.now();

            // Formater l'heure dans le format souhaité (hh:mm:ss)
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedTime = now.format(formatter);
            String content = formattedTime;


            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Observation des audios...");

            content += " ::Fichier compressé : " + fileName;
            FileWriter.writeToFile("./data/compressed/jpg/ImageCompressionObserver.txt", content);
            System.out.println("-----------------------------------------------------------------------");
        }
    }


}