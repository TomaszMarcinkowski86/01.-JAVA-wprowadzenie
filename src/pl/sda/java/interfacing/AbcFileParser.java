package pl.sda.java.interfacing;

import java.util.ArrayList;
import java.util.List;

public class AbcFileParser implements FileParser {

    @Override
    public String name() {
        return "AbcFileParser";
    }

    @Override
    public boolean validFormat(String filename) {
        return filename.endsWith(".abc");
    }

    @Override
    public List<String> parse(List<String> fileContent) {
        List<String> result = new ArrayList<>();
        for (String line : fileContent) {
            // Zamienia wszystkie abc na spacje oraz zapisuje tak zamieniony ciąg znaków do zmiennej parsedLine
            String parsedLine = line.replaceAll("abc", " ");
//            String parsedLine = line.replaceAll("\\s", "_"); // to samo co wyżej, ale z użyciem wyrażenia regularnego
            result.add(parsedLine);
        }

        return result;
    }
}
