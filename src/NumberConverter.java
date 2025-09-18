/*
 * PRAKTIKUM 01 "IN234 Paradigma Pemrograman" - SOAL 5
 * Nama Program : NumberConverter
 * Deskripsi    : Program menerima dan memproses angka desimal menjadi bentuk biner, oktal, atau heksadesimal
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
*/

public class NumberConverter {
    public String convertToBinary(int num) {
        String pseudoBinary = "";
        String trueBinary = "";
        while (num != 0) {
            if (num % 2 == 0) {
                pseudoBinary += "0";
            }
            else {
                pseudoBinary += "1";
            }
            num = num / 2;
        }
        for (int i = pseudoBinary.length() - 1; i >= 0; i--) {
            trueBinary += pseudoBinary.charAt(i);
        }
        return trueBinary;
    }

    public String convertToOctal(int num) {
        String pseudoOctal = "";
        String trueOctal = "";
        if (num == 0) {
            return "0";
        }
        int i = 0;
        while (num != 0) {
            pseudoOctal += num % 8;
            num /= 8;
            i += 1;
        }
        for (int j = pseudoOctal.length() - 1; j >= 0; j--) {
            trueOctal += pseudoOctal.charAt(j);
        }
        return trueOctal;
    }

    public String convertToHex(int num) {
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        if  (num == 0) {
            return "0";
        }
        String pseudoHex = "";
        String trueHex = "";

        while (num > 0) {
            int value = num % 16;
            if (value < 10) {
                pseudoHex += hexChars[value];
            }
            else {
                switch(value) {
                    case 10:
                        pseudoHex += hexChars[10];
                        break;
                    case 11:
                        pseudoHex += hexChars[11];
                        break;
                    case 12:
                        pseudoHex += hexChars[12];
                        break;
                    case 13:
                        pseudoHex += hexChars[13];
                        break;
                    case 14:
                        pseudoHex += hexChars[14];
                        break;
                    case 15:
                        pseudoHex += hexChars[15];
                        break;
                    default:
                        pseudoHex += hexChars[value];
                }
            }
            num /= 16;
        }
        for (int i = pseudoHex.length() - 1; i >= 0; i--) {
            trueHex += pseudoHex.charAt(i);
        }

        return trueHex;
    }
}
