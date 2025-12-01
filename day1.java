import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class day1 {
    int Part1password;
    int Part2password;

    public day1(String filename) {
        filename = ("src/resources/" + filename);
        File file = new File(filename);
        String line;
        int adder = 1;
        int passer = 0;
        int Lock = 50, PrevLock;
        if (file.exists()) {
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    line = scanner.nextLine();
                    String[] thing = line.split("");
                    if (Objects.equals(thing[0], "L")) {
                        line = line.replace("L", "");
                        adder = -1;
                        //L-C-R-C-C-L
                    } else {
                        line = line.replace("R", "");
                        adder = 1;
                    }
                    for (int i = 0; i < Integer.parseInt(line); i++) {
                        Lock += (adder);
                        if (Lock < 0 || Lock > 99) {//if it goes right on 0, we cannot
                            Lock += (adder * -100);
                        }
                        if (Lock == 0) {
                            Part2password++;
                        }
                    }
                    if (Lock == 0) {
                        Part1password++;
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int get1stPassword() {
        return Part1password;
    }

    public int get2ndPassword() {
        return Part2password;
    }
}
