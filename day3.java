import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class day3 {
    int Task1Joltage = 0;
    Long Task2Joltage = 0L;

    public day3(String Filename) {
        Filename = ("src/resources/" + Filename);
        File file = new File(Filename);
        String line;

        if (file.exists()) {
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    line = scanner.nextLine();
                    String[] temporary = line.split("");
                    int[] Batteries = new int[temporary.length];
                    for (int i = 0; i < Batteries.length; i++) {
                        Batteries[i] = Integer.parseInt(temporary[i]);
                    }
                    Task2Joltage += Long.parseLong(assignNums(12, Batteries));
                    Task1Joltage += Integer.parseInt(assignNums(2, Batteries));
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public int getTask1Joltage() {
        return Task1Joltage;
    }

    public Long getTask2Joltage() {
        return Task2Joltage;
    }

    public String assignNums(int Length, int[] Batteries) {
        int[] num = new int[Length];
        int index = 0;
        String result = "";
        for (int i = 0; i < Length; i++) {
            for (int j = index; j < Batteries.length - (Length - i - 1); j++) {
                if (Batteries[j] > num[i]) {
                    num[i] = Batteries[j];
                    index = j + 1;
                }
            }
        }
        for (int j : num) {
            result += j;
        }
        return result;
    }
}
