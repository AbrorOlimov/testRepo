import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    // This is a comment line
    
    // this one is a new comment line 

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.csv"));

        String readLine = bufferedReader.readLine();

        System.out.println(readLine);


        List<String> allLines = Files.readAllLines(Path.of("input.csv"));


        for (String eachLine
                : allLines) {

            System.out.println(eachLine);

        }

    }
}


// NEW CHANGES MADE TO TEST GITHUB
