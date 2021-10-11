package lab1;

import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n);
        scan.nextLine();
        String phrase = scan.nextLine();
        System.out.println(phrase);
        scan.close();
    }
}
