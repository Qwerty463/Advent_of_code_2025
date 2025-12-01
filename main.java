import java.util.Scanner;

public class main {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String command;
        boolean exit = false;
        boolean exit2 = false;
        while (!exit) {
            System.out.println("""
                       Which Day would you like to test?\n
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
                            System.out.println("Day-1\nTest\nSolution\nExit");
                            command = sc.nextLine();
                            if (command.equals("Exit")) {
                                exit2 = true;
                            } else {
                                switch (command) {
                                    case "Test":
                                        day1 test = new day1("test.txt");
                                        System.out.println("Solution for Task 1: " + test.get1stPassword()
                                                + "\nSolution for Task 2: " + test.get2ndPassword());
                                        break;
                                    case "Solution":
                                        day1 solution = new day1("Solution.txt");
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
                        break;
                    case "Day-3":
                        break;
                    case "Day-4":
                        break;
                    case "Day-5":
                        break;
                    case "Day-6":
                        break;
                    case "Day-7":
                        break;
                    case "Day-8":
                        break;
                    case "Day-9":
                        break;
                    case "Day-10":
                        break;
                    case "Day-11":
                        break;
                    case "Day-12":
                        break;
                    default:
                        System.out.println("Invalid Command");
                        break;
                }
            }
        }
    }
}
