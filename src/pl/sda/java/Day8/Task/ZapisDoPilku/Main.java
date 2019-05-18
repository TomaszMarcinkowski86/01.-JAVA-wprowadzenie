package pl.sda.java.Day8.Task.ZapisDoPilku;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\JAVA\\SAVE_TO_FILE_FOLDER\\testSave.nc");
        SaveToFile saveToFile =new SaveToFile();
        List<String> lines = new ArrayList<>();
        lines.add("text1");
        lines.add("text11");
        lines.add("text2");
        lines.add("text4");
        saveToFile.save(path,lines);
    }
}
