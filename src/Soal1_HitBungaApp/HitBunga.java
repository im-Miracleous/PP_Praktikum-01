package Soal1_HitBungaApp;/*
 * PRAKTIKUM 01 "IN234 Paradigma Pemrograman" - SOAL 1
 * Nama Program : Soal1_HitBungaApp.HitBunga
 * Deskripsi    : Program menghitung bunga yang didapatkan jika seseorang melakukan deposit dengan suku bunga & jangka waktu tertentu
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class HitBunga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        symbols.setDecimalSeparator(',');

        DecimalFormat decimalFormat = new DecimalFormat("#,###", symbols);

        System.out.print("Masukkan uang yang hendak didepositkan: ");
        int balance = input.nextInt();
        System.out.print("Masukkan lama deposito: ");
        int tenor = input.nextInt();
        System.out.print("Masukkan bunga deposito: ");
        float interestRate = input.nextFloat();

        double interest = (balance * tenor * interestRate) / 100;

        System.out.printf("Jumlah uang: %s%n", decimalFormat.format(balance));
        System.out.printf("Bunga deposito: %s%n", decimalFormat.format((int) interest));
        System.out.printf("Saldo akhir: %s%n", decimalFormat.format(balance + (int) interest));
    }
}
