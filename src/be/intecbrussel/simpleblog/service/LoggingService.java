package be.intecbrussel.simpleblog.service;

import be.intecbrussel.simpleblog.model.Level;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class LoggingService {
    private final Path logFilePath = Paths.get("log/log.txt");
    public void logToWrite(IOException e, Level level) throws IOException {

        FileWriter fileWriter = new FileWriter(logFilePath.toFile(), true);
        fileWriter.write(level + Arrays.toString(e.getStackTrace()) + "\n");

        fileWriter.close();
    }


}