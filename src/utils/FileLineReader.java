package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * C'est une classe "outil" qui permet de lire un fichier et avoir le contenu de chaque ligne dans
 * un String à part.
 *
 * Si elle n'est pas dans le model, c'est parce que c'est deux tâches différentes.
 *
 * En dev, on a un principe qui s'appelle le principe de responsabilité unique qui s'applique aux classes est aux méthodes,
 * qui indique qu'elles doivent faire une chose sur leurs niveaux d'abstraction.
 *
 * Ainsi, cette classe justifie son existence, car le modèle gère la liste d'employé, et lire le fichier est une autre
 * responsabilité.
 */
public class FileLineReader {
    public static List<String> lines;

    public static String[] readByLines(String fileName) throws IOException {
        String content = Files.readString(Paths.get(fileName));
        return content.split("\n");
    }
}
