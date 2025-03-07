package comp8741;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class WombatVetClinic {
    public static void main(String[] args) {
// Part-2, Task-4
        // Print-1
//        Queue<Wombat> wombatQueue = new ArrayDeque<Wombat>();
//
//        wombatQueue.add(new Wombat("Fluffy",5,10.5));
//        wombatQueue.add(new Wombat("Socks",10,11.3));
//        wombatQueue.add(new Wombat("Barry",10,10.8));
//        wombatQueue.add(new Wombat("Jobe",3,12.0));
//        wombatQueue.add(new Wombat("Ginger",15,3.2));
//
//        for (Wombat wombat: wombatQueue) {
//            System.out.println(wombat);
//        }

        // Print-2
//        Queue<Wombat> wombatQueue = new PriorityQueue<>();
//
//        wombatQueue.add(new Wombat("Fluffy", 5, 10.5));
//        wombatQueue.add(new Wombat("Socks", 10, 11.3));
//        wombatQueue.add(new Wombat("Barry", 10, 10.8));
//        wombatQueue.add(new Wombat("Jobe", 3, 12.0));
//        wombatQueue.add(new Wombat("Ginger", 15, 3.2));
//
//        while (!wombatQueue.isEmpty()) {
//            System.out.println(wombatQueue.poll());
//        }

// Part-2, Task-5
        Queue<Wombat> wombatQueue = new PriorityQueue<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Starting Wombat Vet Clinic Application");

        while (true) {
            System.out.println("Enter Wombat's data [name, severity and time], process or quit:");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("QUIT")) {
                break;
            } else if (input.equalsIgnoreCase("PROCESS")) {
                while (!wombatQueue.isEmpty()) {
                    System.out.println(wombatQueue.poll());
                }
            } else {
                String[] textInput = input.split(" ");

                if (textInput.length != 3) {
                    System.out.println("!Sorry, Data you entered is incorrect");
                } else {
                    try {
                        String name = textInput[0];
                        int severity = Integer.parseInt(textInput[1]);
                        double time = Double.parseDouble(textInput[2]);

                        Wombat wombat = new Wombat(name, severity, time);
                        wombatQueue.add(wombat);

                    } catch (SeverityOutOfBoundsException error) {
                        System.out.println(error.getMessage());
                    } catch (NumberFormatException error) {
                        System.out.println("!Sorry, Data you entered is incorrect");
                    }
                }
            }
        }


        // End of main method
    }
}
