package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FileLineReader {
    public static List<String> lines;

    public static String[] readByLines(String fileName) throws IOException {
        String content = Files.readString(Paths.get(fileName));
        return content.split("\n");
    }
}
