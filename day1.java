import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class day1 {
    private int Part1password;
    private int Part2password;

    public day1(String filename) {
        filename = ("src/resources/" + filename);//file to be fetched
        File file = new File(filename);//file itself
        String line;//Direction and turn amount
        int adder;// which way we should be adding the turn amount
        int Lock = 50;// state that the lock is at. starts at 50
        if (file.exists()) {
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    line = scanner.nextLine();
                    if (line.contains("L")) {//only 2 options that it can be, L or R. if it isn't L then must be R
                        line = line.replace("L", "");
                        adder = -1;//Turning Left is represented by going down the number line
                    } else {
                        line = line.replace("R", "");
                        adder = 1;//turning right is represented by going up the number line
                    }
                    for (int i = 0; i < Integer.parseInt(line); i++) {
                        //originally used 2 individual while loops to change the Lock, and if they went above
                        //or below i would increment the Part2password by 1
                        //However this resulted in issues where it would add more if Lock was 0
                        //My attempts at fixing this resulted in a few headaches, so i decided to change to
                        //a for loop, where it would increment by 1 in the direction specified above.
                        //if it was 0, i would increment Part2password by 1, and as it always changes by at least 1
                        //in the for loop, it doesn't encounter false positives
                        Lock += (adder);
                        if (Lock < 0 || Lock > 99) {//saves on adding multiple for loops and multiple additions
                            Lock += (adder * -100);
                        }
                        if (Lock == 0) {
                            Part2password++;
                        }
                    }
                    if (Lock == 0) {
                        //if after the turn is added, lock is 0, it'll need to increment Part1password
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
