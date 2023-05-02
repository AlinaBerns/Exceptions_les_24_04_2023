package be.intecbrussel.simpleblog.service;

import be.intecbrussel.simpleblog.model.Level;
import be.intecbrussel.simpleblog.model.Log;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class LoggingService {
    private final Path logFilePath = Paths.get("log/log.txt");
    public void logToWrite(Log log) throws IOException {

        FileWriter fileWriter = new FileWriter(logFilePath.toFile(), true);
        fileWriter.write(log + "\n");

        fileWriter.close();
    }


}
