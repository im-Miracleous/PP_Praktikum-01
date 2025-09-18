/*
 * PRAKTIKUM 01 "IN234 Paradigma Pemrograman" - SOAL 4
 * Nama Program : WordReverser
 * Deskripsi    : Program membalik kata yang diinputkan
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
*/

public class WordReverser {
    public String reverseWord(String word) {
        String flippedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            flippedWord += word.charAt(i);
        }
        return flippedWord;
    }
}
