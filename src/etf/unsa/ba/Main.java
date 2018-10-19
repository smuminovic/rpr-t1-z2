package etf.unsa.ba;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for (int i = 1; i <= n; i++) {
            if ((i % sumaCifara(i)) == 0) System.out.println(i);
        }
    }

    public class sumaCifara(int a) {
        int suma = 0;
        int b = 0;
        while (a != 0) {
            b = a % 10;
            suma = suma + b;
            a = a/10;
        }
        return suma;
    }
}
