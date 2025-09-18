/*
 * PRAKTIKUM 01 "IN234 Paradigma Pemrograman" - SOAL 5
 * Nama Program : NumberConverterDemo
 * Deskripsi    : Program menjalankan class 'NumberConverter' dan melakukan loop hingga user keluar dari interface (dgn mengetikkan 4)
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
*/

import java.util.Scanner;

public class NumberConverterDemo {
    public static void main(String[] args) {
        NumberConverter obj = new NumberConverter();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        System.out.println("==========================================");
        System.out.println("Number Converter");
        System.out.println("==========================================");
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Decimal to Octal");
        System.out.println("3. Decimal to Hex");
        System.out.println("4. Exit");

        do {
            System.out.print("\nChoice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Number to convert: ");
                int input = scanner.nextInt();
                scanner.nextLine();
                String binary = obj.convertToBinary(input);
                System.out.printf("Converted number is %s\n", binary);
            }
            else if (choice == 2) {
                System.out.print("Number to convert: ");
                int input = scanner.nextInt();
                scanner.nextLine();
                String octal = obj.convertToOctal(input);
                System.out.printf("Converted number is %s\n", octal);
            }
            else if (choice == 3) {
                System.out.print("Number to convert: ");
                int input = scanner.nextInt();
                scanner.nextLine();
                String hex = obj.convertToHex(input);
                System.out.printf("Converted number is %s\n", hex);
            }
            else if (choice == 4) {
                System.out.println("Exiting program...");
            }
            else {
                System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}
