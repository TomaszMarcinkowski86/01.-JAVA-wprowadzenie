package pl.sda.java.Day6.Task.interfacing;

import pl.sda.java.Day6.Task.interfacing.FileParser;

/**
 * @author Michal Jaszczyk
 **/
public class TxtFileParser implements FileParser {
    @Override
    public String name() {
        return "TxtFileParser";
    }

    @Override
    public boolean validFormat(String filename) {
        return filename.endsWith(".txt");
    }
}
