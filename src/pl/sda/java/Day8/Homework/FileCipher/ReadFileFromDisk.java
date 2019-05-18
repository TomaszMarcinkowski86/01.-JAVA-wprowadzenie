package pl.sda.java.Day8.Homework.FileCipher;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class ReadFileFromDisk {

    public static void main(String[] args) throws IOException {


        File file = new File("src/pl/sda/resources/aaa.ncl");

        List<String> lines = FileUtils.readLines(file, "UTF-8");
        for(String line:lines)
        System.out.println(lines);
    }



//    for(String line:lines)
//
//    {
//        System.out.println(line);
//
//
//    }
//
//    public ReadFileFromDisk() throws IOException {
//    }
}
