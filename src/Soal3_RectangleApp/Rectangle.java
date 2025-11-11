package Soal3_RectangleApp;/*
 * PRAKTIKUM 01 "IN234 Paradigma Pemrograman" - SOAL 3
 * Nama Program : Soal3_RectangleApp.Rectangle
 * Deskripsi    : Program menghitung perpindahan suatu persegi panjang berukuran (panjang x lebar) sejauh x absis dan y ordinat
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
*/

public class Rectangle {
    int x;
    int y;
    int panjang;
    int lebar;

    public Rectangle(int x, int y, int panjang, int lebar) {
        this.x = x;
        this.y = y;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void geserKeAtas() {
        this.y += 1;
    }

    public void geserKeBawah() {
        this.y -= 1;
    }

    public void geserKeKanan() {
        this.x += 1;
    }

    public void geserKeKiri() {
        this.x -= 1;
    }

    public void show() {
        System.out.printf("Posisi Kotak: (%d, %d)%n", this.x, this.y);
        System.out.printf("Ukuran: %d x %d%n", this.panjang, this.lebar);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Rectangle kotak = new Rectangle(0, 0, 5, 5);
        System.out.println("Posisi Awal Kotak:");
        kotak.show();

        System.out.println("Jika digeser ke atas 1 kali...");
        kotak.geserKeAtas();
        kotak.show();

        System.out.println("Jika digeser ke bawah 1 kali...");
        kotak.geserKeBawah();
        kotak.show();

        System.out.println("Jika digeser ke kanan 1 kali...");
        kotak.geserKeKanan();
        kotak.show();

        System.out.println("Jika digeser ke kiri 1 kali...");
        kotak.geserKeKiri();
        kotak.show();
    }
}
