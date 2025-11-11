package Soal4_WordReverseApp;/*
 * PRAKTIKUM 01 "IN234 Paradigma Pemrograman" - SOAL 4
 * Nama Program : Soal4_WordReverseApp.WordReverserDemo
 * Deskripsi    : Program menjalankan class 'Soal4_WordReverseApp.WordReverser' dan melakukan loop hingga user keluar dari interface (dgn mengetikkan 0)
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
*/

import java.util.Scanner;

public class WordReverserDemo {
    public static void main(String[] args) {
        WordReverser obj = new WordReverser();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input kalimat (0 untuk keluar): ");
        String input = scanner.nextLine();
        String flippedWord = obj.reverseWord(input);

        while (!input.isEmpty() && !input.equals("0")) {
            System.out.println("Hasil pembalikan: " + flippedWord);
            System.out.print("Input kalimat (0 untuk keluar): ");
            input = scanner.nextLine();
            flippedWord = obj.reverseWord(input);
        }
    }
}
