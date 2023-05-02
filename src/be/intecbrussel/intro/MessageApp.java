package be.intecbrussel.intro;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MessageApp {
    public static void main(String[] args) {

        //File with absolute Path
        File myResourceFolder = new File ("C:\\Users\\AlinaB\\IdeaProjects\\Exceptions_les_24_04_2023\\resources");

        //File with relative Path
        File myResourceFolderRelative = new File ("resources");

        //Path with absolute Path
        Path myResourceFolderPath = Paths.get("C:\\Users\\AlinaB\\IdeaProjects\\Exceptions_les_24_04_2023\\resources");

        //Path with relative Path

        Path myResourceFolderPathRelative = Paths.get("resources");

        System.out.println(myResourceFolderPath.toFile());
        System.out.println(myResourceFolderRelative);

        System.out.println(Files.isDirectory(myResourceFolderPath));


    }
}
