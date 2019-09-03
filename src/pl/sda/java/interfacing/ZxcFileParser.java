package pl.sda.java.interfacing;

import java.util.List;

public class ZxcFileParser implements FileParser {
    @Override
    public String name() {
        return "ZxcFileParser";
    }

    @Override
    public boolean validFormat(String filename) {
        return filename.endsWith(".zxc");
    }


}
