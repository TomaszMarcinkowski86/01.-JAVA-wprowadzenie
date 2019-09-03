package pl.sda.java.interfacing;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michal Jaszczyk
 **/
public class TxtFileParserTwo implements FileParser {
    @Override
    public String name() {
        return "TxtFileParserTwo";
    }

    @Override
    public boolean validFormat(String filename) {
        return filename.endsWith(".txt");
    }

    @Override
    public List<String> parse(List<String> fileContent) {
        List<String> result = new ArrayList<>();
        for (String line : fileContent) {
            // Zamienia wszystkie abc na spacje oraz zapisuje tak zamieniony ciąg znaków do zmiennej parsedLine
            String parsedLine = line.replaceAll(" ", "?");
//            String parsedLine = line.replaceAll("\\s", "_"); // to samo co wyżej, ale z użyciem wyrażenia regularnego
            result.add(parsedLine);
        }

        return result;
    }
}
