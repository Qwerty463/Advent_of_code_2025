import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class day2 {
    public day2(String Filename) {
        Filename = ("src/resources/" + Filename);
        File file = new File(Filename);
        String line;
        if (file.exists()) {
            try (Scanner scanner = new Scanner(file)) {

            } catch (IOException e) {

                throw new RuntimeException(e);
            }
        }
    }
}
