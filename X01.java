// 12S24039 - Jody Alfonso Siahaan
// 12S24042 - Ventyola Rohati Napitupulu
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargabuku, totalprice, hargaterkecil, total;

        hargabuku = Double.parseDouble(input.nextLine());
        totalprice = hargabuku;
        hargaterkecil = hargabuku;
        while (hargabuku != 0) {
            if (hargaterkecil < hargabuku) {
                hargaterkecil = hargaterkecil;
            } else {
                hargaterkecil = hargabuku;
            }
            hargabuku = Double.parseDouble(input.nextLine());
            totalprice = totalprice + hargabuku;
        }
        if (totalprice >= 100) {
            total = totalprice - hargaterkecil;
        } else {
            total = totalprice;
        }
        System.out.println(toFixed(total,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
