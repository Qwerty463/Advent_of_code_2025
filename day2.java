import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class day2 {
    long Task1count = 0;
    long Task2count = 0;

    public day2(String Filename) {
        Set<Long> InvalidIds = new HashSet<>();
        Filename = ("src/resources/" + Filename);
        File file = new File(Filename);
        String line = "";
        if (file.exists()) {
            try (Scanner scanner = new Scanner(file)) {
                line = scanner.nextLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        String[] products = line.split(",");
        for (String product : products) {
            String[] IDs = product.split("-");
            long startID = Long.parseLong(IDs[0]);
            long endID = Long.parseLong(IDs[1]);
            for (long count = startID; count <= endID; count++) {
                int Length = (int) (Math.log10(count)) + 1;
                for (int i = 2; i <= Length; i++) {
                    if (Length % i == 0) {
                        String[] thingy = new String[i];
                        int thinglength = (int) (Math.log10(count) / i) + 1;
                        for (int j = 0; j < i; j++) {
                            if (j + 1 > i) {
                                thingy[j] = (String.valueOf(count).substring(j * thinglength));
                            } else {
                                thingy[j] = (String.valueOf(count).substring(j * thinglength, (j + 1) * thinglength));
                            }
                        }
                        for (int k = 0; k < thingy.length; k++) {
                            if (k + 1 >= thingy.length) {
                                Task2count += count;
                                InvalidIds.add(count);
                                break;
                            }
                            if (!(thingy[k].equals(thingy[k + 1]))||(InvalidIds.contains(count))) {
                                break;
                            }
                        }
                    }
                }
                if ( (Length) % 2 == 1) {//if its even
                    int midpoint = (Length / 2) + 1;
                    String[] temp = new String[]{String.valueOf(count).substring(0, midpoint), String.valueOf(count).substring(midpoint)};
                    if (temp[0].equals(temp[1])) {
                        Task1count += count;
                    }
                }
            }
        }
        for (Long id : InvalidIds) {
            System.out.println(id);
        }
    }
    public Long getTask1Count() {
        return Task1count;
    }

    public Long getTask2Count() {
        return Task2count;
    }
}
