package Soal2_MathCalculator;/*
 * PRAKTIKUM 01 "IN234 Paradigma Pemrograman" - SOAL 2
 * Nama Program : Soal2_MathCalculator.MathCalc
 * Deskripsi    : Program menghitung beberapa operasi matematika (seperti kuadrat, perpangkatan 5, akar kuadrat, absolut, dan pembulatan)
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class MathCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        DecimalFormat df = new DecimalFormat("#,###.#####", symbols);

        symbols.setGroupingSeparator('.');
        symbols.setDecimalSeparator(',');

        System.out.print("Masukkan bilangan: ");
        float startingNum = input.nextFloat();

        double square = Math.pow(startingNum, 2);
        double powerOfFive = Math.pow(startingNum, 5);
        double sqRoot = Math.sqrt(startingNum);
        float absolute = Math.abs(startingNum);
        int rounded = Math.round(startingNum);

        System.out.printf("Hasil kuadrat: %s%n", df.format(square));
        System.out.printf("Hasil pangkat 5: %s%n", df.format(powerOfFive));
        System.out.printf("Hasil akar kuadrat: %s%n",  df.format(sqRoot));
        System.out.printf("Hasil absolut: %s%n", df.format(absolute));
        System.out.printf("Hasil pembulatan: %s%n",  df.format(rounded));
    }
}
