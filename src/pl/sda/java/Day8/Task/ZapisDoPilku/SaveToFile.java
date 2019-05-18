package pl.sda.java.Day8.Task.ZapisDoPilku;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class SaveToFile {

    public void save(Path path, List<String> lines) throws IOException {
       // Files.write(path, lines, StandardOpenOption.APPEND, StandardOpenOption.CREATE);  // różne opcje tworzy np. nowy plik
        //Files.write(path, lines, StandardOpenOption.CREATE_NEW, StandardOpenOption.CREATE);
       // Files.write(path, lines, StandardOpenOption.APPEND, StandardOpenOption.TRUNCATE_EXISTING; // poczytać
        Files.write(path,lines);
       // Files.write(path,lines, StandardCharsets.UTF_8); // możemy określić kodowanie pliku


        /////żeby przekazać i zapisać tablice bajtów i zapisać w kodzie binarnym ///////
//        String string = "Hello world";
//        Files.write(path, string.getBytes());
        }

    }

