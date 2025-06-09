package Java;

import java.util.Scanner;

public class Overload {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Integer firstInt = scanner.nextInt();
            Integer secondInt = scanner.nextInt();
            Integer addition = firstInt + secondInt;
            System.out.println(firstInt + " + " + secondInt + " = " + addition);
        }
    }
}
