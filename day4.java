import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class day4 {
    int Task1Count = 0;
    int Task2Count = 0;
    public day4(String filename) {
        //not overly happy with how i made this, but it works, and can be used for any input code, rather than just the given test/solution code
        String[][] toiletpaper;
        filename = ("src/resources/" + filename);//file to be fetched
        File file = new File(filename);//file itself
        int j = 0, i = 0;
        String dispose = "";
        if (file.exists()) {
            //runs through the file to gather the values for the size of the array
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    dispose = scanner.nextLine();
                    j++;
                }
                String[] thing = dispose.split("");
                toiletpaper = new String[j + 1][thing.length];
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            //fetches the values from the file, and allocates them to the 2dimensional toiletpaper array
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    toiletpaper[i] = scanner.nextLine().split("");
                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            int length = dispose.length() - 1;
            j--;
            for (int k = 0; k <= j; k++) {
                for (int s = 0; s <= length; s++) {
                    int score = 0;
                    //the following lines are responsible for checking the surrounding edges
                    if (!((k + 1) > j)) {
                        if (toiletpaper[k + 1][s].equals("@")) {//Bottom Middle
                            score++;
                        }
                        if (!((s + 1) > length)) {
                            if (toiletpaper[k + 1][s + 1].equals("@")) {//Bottom Right
                                score++;
                            }
                        }
                        if (!((s - 1) < 0)) {
                            if (toiletpaper[k + 1][s - 1].equals("@")) {//Bottom Left
                                score++;
                            }
                        }

                    }
                    if (!((k - 1) < 0)) {
                        if (toiletpaper[k - 1][s].equals("@")) {//Top Middle
                            score++;
                        }
                        if (!((s + 1) > length)) {
                            if (toiletpaper[k - 1][s + 1].equals("@")) {//Top right
                                score++;
                            }
                        }
                        if (!((s - 1) < 0)) {
                            if (toiletpaper[k - 1][s - 1].equals("@")) {//Top Left
                                score++;
                            }
                        }
                    }
                    if (!((s + 1) > length)) {
                        if (toiletpaper[k][s + 1].equals("@")) {//Middle right
                            score++;
                        }
                    }
                    if (!((s - 1) < 0)) {
                        if (toiletpaper[k][s - 1].equals("@")) {//Middle Left
                            score++;
                        }
                    }
                    if (score < 4 && !(toiletpaper[k][s].equals("."))) {
                        Task1Count++;
                    }

                }
            }
            Recursiveremoval(j, length, toiletpaper);

        }
    }
/*
the code recursively goes through the array, and checks if it can remove anymore toiletpaper. once it has reached the point where no toiletpaper can/has been removed
it ends. During this process it adds every time that we remove one to the Task 2Count.
one problem i thought of whilst making this was that removing the toiletpaper whilst it was still checking toilet papers within its recursion might cause a different answer,
but in the end this fear was unfounded, and arguably made it more efficient than the alternative(removing them at the end)
 */
    public void Recursiveremoval(int j, int length, String[][] toiletpaper) {
        boolean change = false;
        for (int k = 0; k <= j; k++) {
            for (int s = 0; s <= length; s++) {
                int score = 0;
                //checks the corresponding edges, and adds them to the count if they can
                if (!((k + 1) > j)) {
                    if (toiletpaper[k + 1][s].equals("@")) {//Bottom Middle
                        score++;
                    }
                    if (!((s + 1) > length)) {
                        if (toiletpaper[k + 1][s + 1].equals("@")) {//Bottom Right
                            score++;
                        }
                    }
                    if (!((s - 1) < 0)) {
                        if (toiletpaper[k + 1][s - 1].equals("@")) {//Bottom Left
                            score++;
                        }
                    }

                }
                if (!((k - 1) < 0)) {
                    if (toiletpaper[k - 1][s].equals("@")) {//Top Middle
                        score++;
                    }
                    if (!((s + 1) > length)) {
                        if (toiletpaper[k - 1][s + 1].equals("@")) {//Top right
                            score++;
                        }
                    }
                    if (!((s - 1) < 0)) {
                        if (toiletpaper[k - 1][s - 1].equals("@")) {//Top Left
                            score++;
                        }
                    }
                }
                if (!((s + 1) > length)) {
                    if (toiletpaper[k][s + 1].equals("@")) {//Middle right
                        score++;
                    }
                }
                if (!((s - 1) < 0)) {
                    if (toiletpaper[k][s - 1].equals("@")) {//Middle Left
                        score++;
                    }
                }
                if (score < 4 && !(toiletpaper[k][s].equals("."))) {
                    toiletpaper[k][s] = ".";
                    Task2Count++;
                    change=true;
                }

            }
        }
        if (change) {
            Recursiveremoval(j, length, toiletpaper);
        }
    }

    public int getTask1Count() {
        return Task1Count;
    }

    public int getTask2Count() {
        return Task2Count;
    }
}
