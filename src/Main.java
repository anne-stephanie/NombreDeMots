import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int totalMots = 0;

        try {
            File fichier = new File("src/Mots.txt");
            Scanner lecteur = new Scanner(fichier);

            while (lecteur.hasNextLine()) {
                String ligne = lecteur.nextLine();


                if (!ligne.trim().isEmpty()) {
                    String[] mots = ligne.trim().split("\\s+");
                    totalMots += mots.length;
                }
            }

            lecteur.close();
            System.out.println("Nombre total de mots : " + totalMots);

        } catch (FileNotFoundException e) {
            System.out.println(" Fichier introuvable !");
        }
    }
}