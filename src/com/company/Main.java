package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int computer = rand.nextInt(11) + 1 + rand.nextInt(11) + 1;
        int user = rand.nextInt(11) + 1 + rand.nextInt(11) + 1;


        System.out.println("Computer" + computer);
        System.out.println("user" + user);
        while (user < 21) {
            System.out.println("do you want another card?");
            String answer = input.next();
            if (answer.equals("yes")) {
                user = user + (rand.nextInt(11) + 1);
                System.out.println("total: " + user);

            } else {
                break;
            }

        }
        while (computer < 18) {
            computer = computer + (rand.nextInt(11) + 1);
        }

        System.out.println("user total: " + user + " computer total: " + computer);

        if (computer > 21) {
            System.out.println("computer loses, it went bust");
        } else if (computer > user) {
            System.out.println("computer won");
        }
        if (user > 21) {
            System.out.println("you lose, you went bust");
        } else if (user > computer || (computer > 21 && user < 21)) {
            System.out.println("you won");
        }
    }
}
