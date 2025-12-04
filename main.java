import java.util.Scanner;

public class main {
    public static void main() {
        run();
    }

    public static void run() {
        //interface to interact with all 12 days at once
        //makes testing annoying, but looks nice when revisiting the code
        Scanner sc = new Scanner(System.in);
        String command;
        boolean exit = false;
        boolean exit2;
        while (!exit) {
            exit2 = false;
            System.out.println("""
                       Choose a Day!\n
                       Day-1\
                    
                       Day-2\
                    
                       Day-3\
                    
                       Day-4\
                    
                       Day-5\
                    
                       Day-6\
                    
                       Day-7\
                    
                       Day-8\
                    
                       Day-9\
                    
                       Day-10\
                    
                       Day-11\
                    
                       Day-12\
                    
                       Exit\
                    """);
            command = sc.nextLine();
            if (command.equals("Exit")) {
                exit = true;
            } else {
                switch (command) {
                    case "Day-1":
                        while (!exit2) {
                            System.out.println("\nDay-1\n_____\nTest\nSolution\nExit");
                            command = sc.nextLine();
                            if (command.equals("Exit")) {
                                exit2 = true;
                            } else {
                                switch (command) {
                                    case "Test":
                                        day1 test = new day1("Day-1-test.txt");
                                        System.out.println("Solution for Task 1: " + test.get1stPassword()
                                                + "\nSolution for Task 2: " + test.get2ndPassword());
                                        break;
                                    case "Solution":
                                        day1 solution = new day1("Day-1-Solution.txt");
                                        System.out.println("Solution for Task 1: " + solution.get1stPassword()
                                                + "\nSolution for Task 2: " + solution.get2ndPassword());
                                        break;
                                    default:
                                        System.out.println("Invalid Input");
                                        break;

                                }
                            }
                        }
                        break;
                    case "Day-2":
                        while (!exit2) {
                            System.out.println("Day-2\n_____\nTest\nSolution\nExit");
                            command = sc.nextLine();
                            if (command.equals("Exit")) {
                                exit2 = true;
                            } else {
                                switch (command) {
                                    case "Test":
                                        day2 test = new day2("Day-2-test.txt");
                                        System.out.println("Solution for Task1: " + test.getTask1Count()
                                                + "\nSolution for Task2: " + test.getTask2Count());
                                        break;
                                    case "Solution":
                                        day2 solution = new day2("Day-2-solution.txt");
                                        System.out.println("Solution for Task1: " + solution.getTask1Count()
                                                + "\nSolution for Task2: " + solution.getTask2Count());
                                        break;
                                    default:
                                        System.out.println("Invalid Input");
                                        break;
                                }
                            }
                        }
                        break;
                    case "Day-3":
                        while (!exit2) {
                            System.out.println("Day-3\n_____\nTest\nSolution\nExit");
                            command = sc.nextLine();
                            if (command.equals("Exit")) {
                                exit2 = true;
                            } else {
                                switch (command) {
                                    case "Test":
                                        day3 test = new day3("Day-3-test.txt");
                                        System.out.println("Solution for Task1: " + test.getTask1Joltage()
                                                + "\nSolution for Task2: " + test.getTask2Joltage());
                                        break;
                                    case "Solution":
                                        day3 solution = new day3("Day-3-Solution.txt");
                                        System.out.println("Solution for Task1: " + solution.getTask1Joltage()
                                                + "\nSolution for Task2: " + solution.getTask2Joltage());
                                        break;
                                    default:
                                        System.out.println("Invalid Input");
                                        break;
                                }
                            }
                        }
                        break;
                    case "Day-4":
                        while (!exit2) {
                            System.out.println("Day-4\n_____\nTest\nSolution\nExit");
                            command = sc.nextLine();
                            if (command.equals("Exit")) {
                                exit2 = true;
                            } else {
                                switch (command) {
                                    case "Test":
                                        day4 test = new day4("Day-4-test.txt");
                                        System.out.println("Solution for Task1:" + test.getTask1Count()
                                                + "\nSolution for Task2: " + test.getTask2Count());
                                        break;
                                    case "Solution":
                                        day4 Solution = new day4("Day-4-Solution.txt");
                                        System.out.println("Solution for Task1:" + Solution.getTask1Count()
                                                + "\nSolution for Task2: " + Solution.getTask2Count());
                                        break;
                                    default:
                                        System.out.println("Invalid Input");
                                        break;
                                }
                            }
                        }
                        break;
                    case "Day-5":
                        while (!exit2) {
                            System.out.println("Day-5\n_____\nTest\nSolution\nExit");
                            command = sc.nextLine();
                            if (command.equals("Exit")) {
                                exit2 = true;
                            } else {
                                switch (command) {
                                    case "Test":
                                        /*



                                         */
                                        break;
                                    case "Solution":
                                        /*



                                         */
                                        break;
                                    default:
                                        System.out.println("Invalid Input");
                                        break;
                                }
                            }
                        }
                        break;
                    case "Day-6":
                        while (!exit2) {
                            System.out.println("Day-6\n_____\nTest\nSolution\nExit");
                            command = sc.nextLine();
                            if (command.equals("Exit")) {
                                exit2 = true;
                            } else {
                                switch (command) {
                                    case "Test":
                                        /*



                                         */
                                        break;
                                    case "Solution":
                                        /*



                                         */
                                        break;
                                    default:
                                        System.out.println("Invalid Input");
                                        break;
                                }
                            }
                        }
                        break;
                    case "Day-7":
                        while (!exit2) {
                            System.out.println("Day-7\n_____\nTest\nSolution\nExit");
                            command = sc.nextLine();
                            if (command.equals("Exit")) {
                                exit2 = true;
                            } else {
                                switch (command) {
                                    case "Test":
                                        /*



                                         */
                                        break;
                                    case "Solution":
                                        /*



                                         */
                                        break;
                                    default:
                                        System.out.println("Invalid Input");
                                        break;
                                }
                            }
                        }
                        break;
                    case "Day-8":
                        while (!exit2) {
                            System.out.println("Day-8\n_____\nTest\nSolution\nExit");
                            command = sc.nextLine();
                            if (command.equals("Exit")) {
                                exit2 = true;
                            } else {
                                switch (command) {
                                    case "Test":
                                        /*



                                         */
                                        break;
                                    case "Solution":
                                        /*



                                         */
                                        break;
                                    default:
                                        System.out.println("Invalid Input");
                                        break;
                                }
                            }
                        }
                        break;
                    case "Day-9":
                        while (!exit2) {
                            System.out.println("Day-9\n_____\nTest\nSolution\nExit");
                            command = sc.nextLine();
                            if (command.equals("Exit")) {
                                exit2 = true;
                            } else {
                                switch (command) {
                                    case "Test":
                                        /*



                                         */
                                        break;
                                    case "Solution":
                                        /*



                                         */
                                        break;
                                    default:
                                        System.out.println("Invalid Input");
                                        break;
                                }
                            }
                        }
                        break;
                    case "Day-10":
                        while (!exit2) {
                            System.out.println("Day-10\n_____\nTest\nSolution\nExit");
                            command = sc.nextLine();
                            if (command.equals("Exit")) {
                                exit2 = true;
                            } else {
                                switch (command) {
                                    case "Test":
                                        /*



                                         */
                                        break;
                                    case "Solution":
                                        /*



                                         */
                                        break;
                                    default:
                                        System.out.println("Invalid Input");
                                        break;
                                }
                            }
                        }
                        break;
                    case "Day-11":
                        while (!exit2) {
                            System.out.println("Day-11\n_____\nTest\nSolution\nExit");
                            command = sc.nextLine();
                            if (command.equals("Exit")) {
                                exit2 = true;
                            } else {
                                switch (command) {
                                    case "Test":
                                        /*



                                         */
                                        break;
                                    case "Solution":
                                        /*



                                         */
                                        break;
                                    default:
                                        System.out.println("Invalid Input");
                                        break;
                                }
                            }
                        }
                        break;
                    case "Day-12":
                        while (!exit2) {
                            System.out.println("Day-12\n_____\nTest\nSolution\nExit");
                            command = sc.nextLine();
                            if (command.equals("Exit")) {
                                exit2 = true;
                            } else {
                                switch (command) {
                                    case "Test":
                                        /*



                                         */
                                        break;
                                    case "Solution":
                                        /*



                                         */
                                        break;
                                    default:
                                        System.out.println("Invalid Input");
                                        break;
                                }
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid Command");
                        break;
                }
            }
        }
    }


}
