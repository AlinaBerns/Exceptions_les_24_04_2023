package be.intecbrussel.intro;

import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class IntroApp {

    //main throws Exception -> never!!!!!!!!!! this is for demonstration of Files only
    public static void main(String[] args)  {

          //  test();

        System.out.println("What is your username?");
        Path resources = Paths.get("resources");
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        Path userFolder = resources.resolve(username);

       // if (!userFolder.toFile().exists()) {
        try {
            Files.createDirectory(userFolder);
        } catch (FileAlreadyExistsException fileAlreadyExistsException) {
            System.err.println("Sorry, something wrong...\n");
            fileAlreadyExistsException.printStackTrace();

        } catch (IOException e) {
            System.err.println("Ooooopppsss....\n");
            e.printStackTrace();

        } finally {
            System.out.println("Finally block");
        }
        //}

        Path filePath = userFolder.resolve(username+".txt");

        //if (!filePath.toFile().exists()) {
        try {
            Files.createFile(filePath);
        } catch (IOException e) {

        }
        //}

        String text = " Welcome back " + username;

        try {
            Files.writeString(filePath, text, StandardOpenOption.APPEND);
        } catch (IOException e) {
        }

        List<String> q = null;
        try {
            q = Files.readAllLines(filePath);
        } catch (IOException e) {

        }

        q.forEach(string -> System.out.println("New line: " + string));
    }

    private static void test() throws IOException{
        Files.readAllLines(Paths.get(""));
    }

    private static void errorPlease() {
        errorPlease();
    }
}
