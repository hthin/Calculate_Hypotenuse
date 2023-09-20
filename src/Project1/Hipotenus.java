package Project1;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("1. Kenar : ");
        int k1 = scan.nextInt();

        System.out.print("2. Kenar : ");
        int k2 = scan.nextInt();

        double k3 = Math.sqrt( (k1 * k1) + (k2 * k2));

        System.out.println("Hipotenüs => " + (int) k3);



    }

}
