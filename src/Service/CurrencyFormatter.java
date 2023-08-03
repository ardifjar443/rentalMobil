package Service;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class CurrencyFormatter {
    public static String formatToRupiah(int amount) {
        // Buat instance DecimalFormatSymbols untuk mengatur simbol mata uang ke Rupiah
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setCurrencySymbol("Rp");
        symbols.setGroupingSeparator('.');

        // Buat pola format untuk format Rupiah
        String pattern = "###,###,###";

        // Buat instance DecimalFormat dengan pola dan simbol yang telah diatur
        DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);

        // Format angka menjadi Rupiah dan kembalikan sebagai String
        return decimalFormat.format(amount);
    }
    public static int convertRupiahStringToInt(String rupiahString) {
        // Menghilangkan simbol "Rp", spasi, dan tanda baca lainnya
        String cleanString = rupiahString.replaceAll("[Rp,.\\s]", "");

        // Mengonversi string menjadi tipe data int
        try {
            return Integer.parseInt(cleanString);
        } catch (NumberFormatException e) {
            System.out.println("Format Rupiah tidak valid.");
            return 0;
        }
    }

   
}
