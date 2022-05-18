package DataStructure;

import java.util.Scanner;

class Euclid_GCD_LCM {

    Scanner s = new Scanner(System.in);

    void gcd() {
        System.out.println("Give two inputs for GCD: ");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        if (n1 <= 0 || n2 <= 0) {
            System.out.println("Invalid Input. Enter positive numbers.");
            }
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; ++i) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd + "\n");
    }
}
